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
import com.bill.hotfixdemo.model.ModifyFiledModel1Impl;
import com.bill.hotfixdemo.model.ModifyFiledModelImpl;
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
    }

    public static synchronized XXManager getInstance() {
        if (xXManagerInstance == null) {
            xXManagerInstance = new XXManager();
        }
        return xXManagerInstance;
    }

    public List<BaseModel> getBaseModels() {
        List<BaseModel> baseModels = new ArrayList<>();
        baseModels.add(new ModifyMethodModelImpl());
        baseModels.add(new ModifyMethod1ModelImpl());
        baseModels.add(new ModifyMethod2ModelImpl());
        baseModels.add(new ModifyMethod3ModelImpl());
        baseModels.add(new ModifyMethod4ModelImpl());
        baseModels.add(new ModifyMethod5ModelImpl());
        baseModels.add(new ModifyMethod6ModelImpl());
        baseModels.add(new ModifyMethod7ModelImpl());
        baseModels.add(new ModifyMethod8ModelImpl());
        baseModels.add(new ModifyMethod9ModelImpl());
        baseModels.add(new ModifyMethod10ModelImpl());
        baseModels.add(new FinalStaticFieldModelImpl());
        baseModels.add(new FinalStaticField1ModelImpl());
        baseModels.add(new FinalStaticField2ModelImpl());
        baseModels.add(new FinalStaticField3ModelImpl());
        baseModels.add(new ModifyClassModelImpl());
        baseModels.add(new ModifyClass1ModelImpl());
        baseModels.add(new ModifyClass2ModelImpl());
        baseModels.add(new ModifyClass3ModelImpl());
        baseModels.add(new ModifyClass4ModelImpl());
        baseModels.add(new ModifyClass5ModelImpl());
        baseModels.add(new ModifyBlockModelImpl());
        baseModels.add(new ModifyBlock1ModelImpl());
        baseModels.add(new ModifyFiledModelImpl());
        baseModels.add(new ModifyFiledModel1Impl());
        return baseModels;
    }
}
