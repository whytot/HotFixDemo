# HotFixDemo

本demo旨在测试主流Android hotfix方案</br>
> 目前包含Tinker（本地&tinkerPatch平台）/阿里sophix方案</br>

## git分支结构：</br>
* master分支：</br>
  不接入任何hotfix方案，只向xxx/develop分支提供代码，便于对比各个方案</br>

* xxx/develop分支：</br>
  测试某一项hotfix方案</br>

---------------------------------------
# tinker/develop

接入tinker的本地方案
## 使用方法：
1. 先用assembleXXX打出要测试的渠道包（输出文件将被打入output目录（“根目录/build/output”）的指定分支目录下）
2. 将apk移到手机中并安装
3. 修改代码
4. 创建“bakApk”目录（“根目录/build/bakApk”）
5. 将output目录下指定的目录复制到“bakApk”目录下
6. 使用tinkerPatchXXX（这一步会打出新包，覆盖output目录下的指定渠道）
7. 将“patch_signed_7zip.apk”放到手机指定目录下（“根目录/1”）
8. 打开app测试
