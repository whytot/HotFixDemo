package com.bill.hotfixdemo;

import android.content.Context;
import android.os.Environment;

import com.tencent.tinker.entry.DefaultApplicationLike;
import com.tencent.tinker.lib.patch.UpgradePatch;
import com.tencent.tinker.lib.tinker.TinkerInstaller;

/**
 * @author Bill.WangBW
 */
public class TinkerManager {
    private static final String TAG = "Tinker.TinkerM";
    private static TinkerManager tinkerManagerInstance;
    private static String patchFilePath;

    private TinkerManager() {
        patchFilePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/1/patch_signed_7zip.apk";
    }

    public static synchronized TinkerManager getInstance() {
        if (tinkerManagerInstance == null) {
            tinkerManagerInstance = new TinkerManager();
        }
        return tinkerManagerInstance;
    }
    public void install() {
        DefaultApplicationLike sampleApplicationLike = SampleApplicationLike.getApplicationInstance();
        TinkerInstaller.install(sampleApplicationLike);
    }

    public void onReceiveUpgradePatch() {
        TinkerInstaller.onReceiveUpgradePatch(getApplicationContext(), patchFilePath);
    }

    public void cleanPatch() {
        TinkerInstaller.cleanPatch(getApplicationContext());
    }

    private Context getApplicationContext() {
        return SampleApplicationLike.getApplicationInstance().getApplication();
    }

}
