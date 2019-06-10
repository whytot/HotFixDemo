package com.bill.hotfixdemo;

import android.os.Environment;

import com.tencent.tinker.entry.DefaultApplicationLike;
import com.tinkerpatch.sdk.TinkerPatch;

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
        TinkerPatch.init(sampleApplicationLike)
                .reflectPatchLibrary()
                .setPatchRollbackOnScreenOff(true)
                .setPatchRestartOnSrceenOff(true)
                .setFetchPatchIntervalByHours(3);
    }

    public void onReceiveUpgradePatch() {
        TinkerPatch.with().fetchPatchUpdateAndPollWithInterval();
    }

    public void cleanPatch() {
        TinkerPatch.with().cleanPatch();
    }

}
