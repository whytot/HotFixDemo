package com.bill.hotfixdemo;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.multidex.MultiDex;
import android.util.Log;

import com.taobao.sophix.PatchStatus;
import com.taobao.sophix.SophixApplication;
import com.taobao.sophix.SophixEntry;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.listener.PatchLoadStatusListener;

/**
 * @author Bill.WangBW
 */
public class SophixStubApplication extends SophixApplication {
    private final String TAG = "sophix.StubApplication";

    @Keep
    @SophixEntry(App.class)
    static class RealApplicationStub {
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
        initSophix();
    }

    private void initSophix() {
        String appVersion = "1.0.0";
        try {
            appVersion = this.getPackageManager()
                    .getPackageInfo(this.getPackageName(), 0)
                    .versionName;
        } catch (Exception ignored) {
        }
        final SophixManager instance = SophixManager.getInstance();
        instance.setContext(this)
                .setAppVersion(appVersion)
                //下面的参数需妥善保管，做好加密策略
                .setSecretMetaData("27581154-1", "539476a606a14c48e140b4b5756a3bd9", "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQChc93JV66Lg6k7UIpXMPtpzBEMVfzwR0BYZigYurDtmGy0FT3BlzCvP6zmfmor72A5qTBEWnpCn/0p+nJfS5TO6drF5AZ59ebH8Pwb+K9XeT/vTQTSI2fQ0PfbnFwn7Br//dfGV3UPw2Pu05ZQ75O683ldvnaWrsOWTh+UUqxZjISrv6elJ2Sl4LWBY2c8VcFBspadMGqOkBFqclbJ7GBpr+u//YxrC/GPT28EcWMxvpGyEvS3CqtcbzgYgmwvOzJi/O5GEykMUUsPoL9TPTsTSh0cwMPKmUTSkVG4zX9bdRq/1vzup610wrf8FoOTkDn8P8dbf5ydGePyWWHPJPsVAgMBAAECggEBAIiE6Ozvb3AZDGhTWicQDAcRvvinXRHvrcER4KXIdwLw+DnuHCIuLcSCGzlre2tbJgqbvWyO9QKRNgjg9QUPa+zqYUsj3TYTb+lxJDyis+FLbXxzq7fkqEwx5uOT+3jmdI4xntrf6ORDW6T+1QPrEQfsCJv0CWKwtEHMHXfV0FaG1g4Ilw7+dbUgVUcJ6qwizVtk4ZnW+dPUHBsqCOTNkldnVuN8hXQeROqDF76M4cNbxIs62sZkB2Xec47hS/9pv37GImtWdbW45+Cczoi+EW42V/x08HQO9uC3Oo+ZIg7r/okiWe+hHTwibdvCOul2hlSpnH/KWWvkORxg0N4ZEQECgYEA8rWImOeCihQ/4PMO/vwFfB9lVyGg3sYXvwvarcdp3Gjaza+KptBVe+ji+/qxCyaAJ1JvRkGYLcnh9as1hTB6wA41lq4Nb77x3hVarVkaQqirFfBqBHU9lZOIXHpIpt+Hp7AMuJvPqpU0WdKbQ3YCLJPJEhpBHqpjuAY7i3czeo0CgYEAqks42E4oGk2GneZT4cY4RzY/g5AknOsIv9bI3jIw9LLYhn3AWqTI5XDfhcSCg4EJYgambO211gnSScsvbzb5N6QsRAlwVudg11UXi6Z7ZeZajingf/KmLQx8niRygeTbY6n4TQlJHRaflJuajxyywGATJBT5osPl7wPCkQ3yZKkCgYBVbCMJfeHp6zqYV7OdduIPT5WBVyqhfaL58JgktZzCoHzyC6iHEagkllDdUtxhCknsjQzw80E2TGmk539Mw0VQty+ROu0ruU6zVVy2yjd94pNkg1ss+n6UWHqT4c4UPXQnRsUTbHNonF7yhjdzRON7AQCxyF/HBT1XlYn7ihaqOQKBgQCj2YaTUPfy/t7kdGYHGOKzWfXYj0s7FEWx12YjrGVAPAhrtvjp/h0x7d2TZpUxFGnDwKRGsJ1BmOeViwNT3bAColrZB7/oTe32oe/qtT+Ltw0wNgjE8uKC+723p1fptRqGFVdMP//yFf9rTCB1TGaNBKPGFsxumFBXHeYKDUJJKQKBgEnyH11xtYprmXBmBh5762W2Pkjic0QNwaYorAi7sMm2pyg79pHyPw7ZkCkX19FwR8u35J9jZZB3wr+YgjJrNmDAxEkpIp45VOYQgvzFmZcYBxEJzS1q4l5Asfl7fZM/PkhyOLEPm0EhcnaZLOyfwLQc2ieKXEoQM9rL5Z+UAwuw")
                .setEnableDebug(true)
                .setEnableFullLog()
                .setPatchLoadStatusStub(new PatchLoadStatusListener() {
                    @Override
                    public void onLoad(final int mode, final int code, final String info, final int handlePatchVersion) {
                        if (code == PatchStatus.CODE_LOAD_SUCCESS) {
                            Log.i(TAG, "sophix load patch success!");
                        } else if (code == PatchStatus.CODE_LOAD_RELAUNCH) {
                            // 如果需要在后台重启，建议此处用SharePreference保存状态。
                            Log.i(TAG, "sophix preload patch success. restart app to make effect.");
                        }
                    }
                })
                .initialize();
    }
}
