# HotFixDemo

本demo旨在测试主流Android hotfix方案</br>
> 目前包含Tinker（本地&tinkerPatch平台）/阿里sophix方案</br>

## git分支结构：</br>
* master分支：</br>
  不接入任何hotfix方案，只向xxx/develop分支提供代码，便于对比各个方案</br>

* xxx/develop分支：</br>
  测试某一项hotfix方案</br>

---------------------------------------
# tinker/develop-platform

接入tinker的平台方案
## 使用方法：
1. 在tinker patch平台创建应用，获取appkey，替换到tinker.gradle文件中对应位置
2. 先用assembleXXX打出要测试的渠道包（输出文件将被打入output目录（“根目录/build/output”）的指定分支目录下）
3. 将apk移到手机中并安装
4. 修改代码
5. 创建“bakApk”目录（“根目录/build/bakApk”）
6. 将output目录下指定的目录复制到“bakApk”目录下
7. 使用tinkerPatchXXX（这一步会打出新包，覆盖output目录下的指定渠道）
8. 创建AppVersion，创建AppVersion Patch，将“patch_signed_7zip.apk”上传
9. 打开app测试
