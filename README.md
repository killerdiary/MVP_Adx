# MVP
#### Android MVP

[![](https://jitpack.io/v/killerdiary/MVP_Adx.svg)](https://jitpack.io/#killerdiary/MVP_Adx)

#### 说明

> 单纯使用 okhttp +mvp + Activity

> 复杂模式 后期编写，或者参考编写

#### 使用方式

##### Step 1. Add the JitPack repository to your build file

~~~
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
~~~

##### Step 2. Add the dependency
~~~
dependencies {
        implementation 'com.github.killerdiary:MVP_Adx:Tag'
}
~~~

##### 如果有引用包冲突和不必要的包，请排除

> OkHttp

~~~
注意 
    版本 > 3.12.0 works on Android 5.0+ (API level 21+) and on Java 8+. 并且 使用Kotlin
~~~

> Glide

~~~
注意 
    版本 >= 4.10.0 使用androidx
~~~