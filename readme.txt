rm-linux-gcc -fPIC -shared libhwlib.c -o libhwlib.so -I /usr/lib/jvm/java-1.7.0-openjdk-amd64/include/  -nostdlib /home/jordan/project/Android-5.0.2/android-5.0.2/prebuilts/ndk/9/platforms/android-19/arch-arm/usr/lib/libc.so -I /home/jordan/project/Android-5.0.2/android-5.0.2/prebuilts/ndk/9/platforms/android-19/arch-arm/usr/include /home/jordan/project/Android-5.0.2/android-5.0.2/prebuilts/ndk/9/platforms/android-19/arch-arm/usr/lib/liblog.so
* 2. 将native.so 文件放入 app/libs/armeabi
* 3. 修改build.gradle (Module:app), 添加 
	    sourceSets{
				main{
					jniLibs.srcDirs=['libs']
				}
		}
*
*/
