package com.bill.hotfixdemo;

import com.bill.hotfixdemo.model.BaseModel;
import com.bill.hotfixdemo.model.FinalStaticField1ModelImpl;
import com.bill.hotfixdemo.model.FinalStaticField2ModelImpl;
import com.bill.hotfixdemo.model.FinalStaticField3ModelImpl;
import com.bill.hotfixdemo.model.FinalStaticFieldModelImpl;
import com.bill.hotfixdemo.model.ModifyBlock1ModelImpl;
import com.bill.hotfixdemo.model.ModifyBlockModelImpl;
import com.bill.hotfixdemo.model.ModifyClass1ModelImpl;
import com.bill.hotfixdemo.model.ModifyClass2ModelImpl;
import com.bill.hotfixdemo.model.ModifyClass3ModelImpl;
import com.bill.hotfixdemo.model.ModifyClass4ModelImpl;
import com.bill.hotfixdemo.model.ModifyClass5ModelImpl;
import com.bill.hotfixdemo.model.ModifyClassModelImpl;
import com.bill.hotfixdemo.model.ModifyMethod10ModelImpl;
import com.bill.hotfixdemo.model.ModifyMethod1ModelImpl;
import com.bill.hotfixdemo.model.ModifyMethod2ModelImpl;
import com.bill.hotfixdemo.model.ModifyMethod3ModelImpl;
import com.bill.hotfixdemo.model.ModifyMethod4ModelImpl;
import com.bill.hotfixdemo.model.ModifyMethod5ModelImpl;
import com.bill.hotfixdemo.model.ModifyMethod6ModelImpl;
import com.bill.hotfixdemo.model.ModifyMethod7ModelImpl;
import com.bill.hotfixdemo.model.ModifyMethod8ModelImpl;
import com.bill.hotfixdemo.model.ModifyMethod9ModelImpl;
import com.bill.hotfixdemo.model.ModifyMethodModelImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bill.WangBW
 */
public class XXManager {

    private static XXManager xXManagerInstance;

    private XXManager() {
        mBaseModels = new ArrayList<>();
        mBaseModels.add(new ModifyMethodModelImpl());
        mBaseModels.add(new ModifyMethod1ModelImpl());
        mBaseModels.add(new ModifyMethod2ModelImpl());
        mBaseModels.add(new ModifyMethod3ModelImpl());
        mBaseModels.add(new ModifyMethod4ModelImpl());
        mBaseModels.add(new ModifyMethod5ModelImpl());
        mBaseModels.add(new ModifyMethod6ModelImpl());
        mBaseModels.add(new ModifyMethod7ModelImpl());
        mBaseModels.add(new ModifyMethod8ModelImpl());
        mBaseModels.add(new ModifyMethod9ModelImpl());
        mBaseModels.add(new ModifyMethod10ModelImpl());
        mBaseModels.add(new FinalStaticFieldModelImpl());
        mBaseModels.add(new FinalStaticField1ModelImpl());
        mBaseModels.add(new FinalStaticField2ModelImpl());
        mBaseModels.add(new FinalStaticField3ModelImpl());
        mBaseModels.add(new ModifyClassModelImpl());
        mBaseModels.add(new ModifyClass1ModelImpl());
        mBaseModels.add(new ModifyClass2ModelImpl());
        mBaseModels.add(new ModifyClass3ModelImpl());
        mBaseModels.add(new ModifyClass4ModelImpl());
        mBaseModels.add(new ModifyClass5ModelImpl());
        mBaseModels.add(new ModifyBlockModelImpl());
        mBaseModels.add(new ModifyBlock1ModelImpl());
    }

    public static synchronized XXManager getInstance() {
        if (xXManagerInstance == null) {
            xXManagerInstance = new XXManager();
        }
        return xXManagerInstance;
    }

    private List<BaseModel> mBaseModels;

    public List<BaseModel> getBaseModels() {
        return mBaseModels;
    }
}
