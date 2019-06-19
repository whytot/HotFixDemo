本demo旨在测试主流Android hotfix方案
    目前包含Tinker（本地&tinkerPatch平台）/阿里sophix方案

git分支结构：
    master分支：
        不接入任何hotfix方案，只向xxx/develop分支提供代码，便于对比各个方案
    xxx/develop分支：
        测试某一项hotfix方案

---------------------------------------
sophix/develop-hot
    *此分支测试可以进行热更新的情况*
    接入sophix方案
    使用方法：
        * 在阿里云平台创建应用，获取三条必要信息，在SophixStubApplication中setSecretMetaData三个参数
        #基准包：
            启用proguard-rules.pro中“-printmapping mapping.txt”代码行
            关闭proguard-rules.pro中“-applymapping mapping.txt”代码行
            用assembleXXX打出要测试的渠道包（输出文件将被打入output目录（“根目录/build/output”）的指定分支目录下）
            将apk移到手机中并安装
        #patch包
            创建“bakApk”目录（“根目录/build/bakApk”）
            复制output目录下的指定渠道包到bakApk目录下（“根目录/build/bakApk”）
            复制output/release目录下的mapping.txt到app目录下
            修改代码
            关闭proguard-rules.pro中“-printmapping mapping.txt”代码行
            启用proguard-rules.pro中“-applymapping mapping.txt”代码行
            用assembleXXX打出要测试的渠道包
        #patch文件
            使用官方插件，打出patch文件
        #发布patch
            在阿里云平台的对应项目下，发布patch
        打开app测试