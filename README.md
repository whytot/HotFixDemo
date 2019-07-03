# HotFixDemo

本demo旨在测试主流Android hotfix方案</br>
> 目前包含Tinker（本地&tinkerPatch平台）/阿里sophix方案</br>

## git分支结构：</br>
* master分支：</br>
  不接入任何hotfix方案，只向xxx/develop分支提供代码，便于对比各个方案</br>

* xxx/develop分支：</br>
  测试某一项hotfix方案</br>

---------------------------------------
# sophix/develop

接入sophix方案
## 使用方法：
1. 在阿里云平台创建应用，获取三条必要信息，在SophixStubApplication中setSecretMetaData三个参数
2. 基准包：</br>
启用proguard-rules.pro中“-printmapping mapping.txt”代码行</br>
关闭proguard-rules.pro中“-applymapping mapping.txt”代码行</br>
用assembleXXX打出要测试的渠道包（输出文件将被打入output目录（“根目录/build/output”）的指定分支目录下）</br>
将apk移到手机中并安装</br>
3. patch包：</br>
创建“bakApk”目录（“根目录/build/bakApk”）</br>
复制output目录下的指定渠道包到bakApk目录下（“根目录/build/bakApk”）</br>
修改代码</br>
启用proguard-rules.pro中“-applymapping mapping.txt”代码行</br>
用assembleXXX打出要测试的渠道包</br>
4. patch文件：</br>
使用官方插件，打出patch文件</br>
5. 发布patch：</br>
在阿里云平台的对应项目下，发布patch</br>
6. 打开app测试</br>
