# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

#-keepattributes SourceFile,LineNumberTable
-renamesourcefileattribute SourceFile
-repackageclasses com.example.dev
-allowaccessmodification

-obfuscationdictionary method-dictionary.txt
-packageobfuscationdictionary package-dictionary.txt
-classobfuscationdictionary class-dictionary.txt


# Runtime annotations, type introspection
-keepattributes *Annotation*, Signature, Exception

# DataBinding
-keep class **$$ViewBinder { *; }

#WebView
-keepclassmembers class fqcn.of.javascript.interface.for.webview {
   public *;
}

# lottie
-dontwarn com.airbnb.lottie.**
-keep class com.airbnb.lottie.** {*;}

# Firebase
-keep class com.google.android.gms.** { *; }
-keep class com.google.firebase.** { *; }

#Just Pay
-keep class in.juspay.** {*;}

# OkHttp
-keepattributes Signature
-keepattributes *Annotation*
-keep class com.squareup.okhttp.** { *; }
-keep interface com.squareup.okhttp.** { *; }
-dontwarn com.squareup.okhttp.**
-dontwarn javax.annotation.Nullable
-dontwarn javax.annotation.ParametersAreNonnullByDefault

#****************** Gson Rules *******************************#
# Serialization
-keepclassmembernames,allowobfuscation class * {
  @com.google.gson.annotations.SerializedName <fields>;
}

-dontwarn sun.misc.**
-dontwarn sun.reflet.**
-keep class sun.misc.Unsafe {*;}
-keep class com.google.gson.** {*;}
-keep class * implements com.google.gson.TypeAdapterFactory
-keep class * implements com.google.gson.JsonSerializer
-keep class * implements com.google.gson.JsonDeserializer

# FragmentManagerState
-keep class * implements android.os.Parcelable {
   public static final android.os.Parcelable$Creator *;
}

# Retrofit
-keep class com.google.gson.** { *; }
-keep public class com.google.gson.** {public private protected *;}
-keep class com.google.inject.** { *; }
-keep class org.apache.http.** { *; }
-keep class org.apache.james.mime4j.** { *; }
-keep class javax.inject.** { *; }
-keep class javax.xml.stream.** { *; }
-keep class retrofit.** { *; }
-keep class com.google.appengine.** { *; }
-keep public class com.google.android.gms.* { public *; }
-keepattributes LineNumberTable
-keepattributes *Annotation*
-keepattributes EnclosingMethod, SourceFile, Exceptions
-dontwarn sun.misc.**
-keep class com.google.android.gms.ads.identifier.** { *; }
-keep class com.google.gson.stream.** { *; }
-keep class com.google.gson.examples.android.model.** { *; }
-keepattributes *Annotation*
-keepattributes Signature
-dontwarn com.squareup.okhttp.*
-dontwarn rx.**
-dontwarn javax.xml.stream.**
-dontwarn com.google.appengine.**
-dontwarn java.nio.file.**
-dontwarn org.codehaus.**
-dontwarn javax.annotation.**

-dontwarn retrofit2.**
-dontwarn org.codehaus.mojo.**
-keep class retrofit2.** { *; }
-keepattributes Exceptions
-keepattributes RuntimeVisibleAnnotations
-keepattributes RuntimeInvisibleAnnotations
-keepattributes RuntimeVisibleParameterAnnotations
-keepattributes RuntimeInvisibleParameterAnnotations

-keepattributes EnclosingMethod
-keepclasseswithmembers class * {
    @retrofit2.http.* <methods>;
}
-keepclasseswithmembers interface * {
    @retrofit2.* <methods>;
}
# Platform calls Class.forName on types which do not exist on Android to determine platform.
-dontnote retrofit2.Platform
# Platform used when running on RoboVM on iOS. Will not be used at runtime.
-dontnote retrofit2.Platform$IOS$MainThreadExecutor
# Platform used when running on Java 8 VMs. Will not be used at runtime.
-dontwarn retrofit2.Platform$Java8
# Retain generic type information for use by reflection by converters and adapters.
-keepattributes Signature
# Retain declared checked exceptions for use by a Proxy instance.
-keepattributes Exceptions
-dontnote okhttp3.internal.Platform

# Hide warnings about references to newer platforms in the library
-dontwarn android.support.v7.**
# don't process support library
-keep class android.support.v7.** { *; }
-keep interface android.support.v7.** { *; }

# To support Enum type of class members
-keepclassmembers enum * { *; }
-keep class com.activeandroid.** { *; }
-keep class com.activeandroid.**.** { *; }

# okio
-dontwarn okio.**
-dontwarn okio.Okio

#Okhttp
-keep class okhttp3.** { *; }
-keep interface okhttp3.** { *; }
-dontwarn okhttp3.**
-dontwarn okio.**

-keep class com.crashlytics.** { *; }
-dontwarn com.crashlytics.**

-dontwarn com.android.installreferrer

#AppsFlyer
-keep class com.appsflyer.**{*;}
-dontwarn com.appsflyer.**

#otto
-keep class com.rapido.passenger.otto.*{*;}
-keepclassmembers class ** {
    @org.greenrobot.eventbus.Subscribe public *;
}

#ProtoBuf
-keep class com.rapido.passenger.pojo.protobuffmessages.*{*;}

# Webview
-keepclassmembers class * {
    @android.webkit.JavascriptInterface <methods>;
}
-keepattributes JavascriptInterface

#Payment RazorPay
-keepclassmembers class * {
    @android.webkit.JavascriptInterface <methods>;
}

-keepattributes JavascriptInterface
-keepattributes *Annotation*

-dontwarn com.razorpay.**
-keep class com.razorpay.** {*;}

-optimizations !method/inlining/*

-keepclasseswithmembers class * {
  public void onPayment*(...);
}

# Remove logs, don't forget to use 'proguard-android-optimize.txt' file in build.gradle
-assumenosideeffects class android.util.Log {
    public static int d(...);
    public static int v(...);
    public static int i(...);
    public static int w(...);
    public static int e(...);
    public static int wtf(...);
}

# custom own view
-keep public class * extends android.view.View {
    public <init>(android.content.Context);
    public <init>(android.content.Context, android.util.AttributeSet);
    public <init>(android.content.Context, android.util.AttributeSet, int);
    public void set*(...);
}

# Keep Native codes
-keepclasseswithmembernames class * { native <methods>; }

#For UXCam
-keep class com.uxcam.** { *; }
-dontwarn com.uxcam.**

#For Hansel
-dontwarn io.hansel.**
-keep class io.hansel.**{*;}
-keep class * implements io.hansel.**.* {*;}
-keep class * extends io.hansel.**.* {*;}
-keep class com.netcore.views.** { *; }


#Databinding
-keepclassmembers class * extends android.app.Activity {
     public void *(android.view.View);
 }

#ViewModel
-keep class * extends androidx.lifecycle.AndroidViewModel {
    <init>(android.app.Application);

}-keep class * extends androidx.lifecycle.ViewModel {
    <init>(android.app.Application);
}

#AndroidX
-keep class com.google.android.material.** { *; }

-dontwarn com.google.android.material.**
-dontnote com.google.android.material.**

-dontwarn androidx.**
-keep class androidx.** { *; }
-keep interface androidx.** { *; }


#RxJava
-dontwarn sun.misc.**

-keepclassmembers class rx.internal.util.unsafe.*ArrayQueue*Field* {
   long producerIndex;
   long consumerIndex;
}

-keepclassmembers class rx.internal.** {*;}
-dontwarn rx.**
-dontnote rx.internal.util.PlatformDependent

# Event Bus
-keepattributes *Annotation*
-keepclassmembers class ** {
    @org.greenrobot.eventbus.Subscribe <methods>;
}
-keep enum org.greenrobot.eventbus.ThreadMode { *; }

# Only required if you use AsyncExecutor
-keepclassmembers class * extends org.greenrobot.eventbus.util.ThrowableFailureEvent {
    <init>(java.lang.Throwable);
}

#Sqllite
-keep class org.sqlite.** { *; }
-keep class org.sqlite.database.** { *; }

#Dagger2
-keep class com.google.errorprone.annotations.** { *; }

# ProtoBuf
-keep public class * extends com.google.protobuf.GeneratedMessageLite {*;}

# ServiceLoader support
-keepnames class kotlinx.coroutines.internal.MainDispatcherFactory {}
-keepnames class kotlinx.coroutines.CoroutineExceptionHandler {}
-keepnames class kotlinx.coroutines.android.AndroidExceptionPreHandler {}
-keepnames class kotlinx.coroutines.android.AndroidDispatcherFactory {}

-keep class kotlinx.coroutines.internal.MainDispatcherFactory {}
-keep class kotlinx.coroutines.CoroutineExceptionHandler {}
-keep class kotlinx.coroutines.android.AndroidExceptionPreHandler {}
-keep class kotlinx.coroutines.android.AndroidDispatcherFactory {}

# Most of volatile fields are updated with AFU and should not be mangled
-keepclassmembernames class kotlinx.** {
    volatile <fields>;
}

# Guava
-dontwarn com.google.**
-dontwarn javax.inject.**
-dontwarn sun.misc.Unsafe
-dontwarn com.google.common.collect.MinMaxPriorityQueue
-dontwarn java.lang.ClassValue
-dontwarn com.google.j2objc.annotations.Weak
-dontwarn org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
-dontwarn afu.org.checkerframework.**
-dontwarn org.checkerframework.**

# Parceler library
-keep public class com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public static final *** NULL;
}

-keepnames @com.google.android.gms.common.annotation.KeepName class *
-keepclassmembernames class * {
    @com.google.android.gms.common.annotation.KeepName *;
}

-keepnames class * implements android.os.Parcelable {
    public static final ** CREATOR;
}

# Gms
-keep public class com.google.android.gms.* { public *; }
-dontwarn com.google.android.gms.**
-dontwarn org.conscrypt.**


-keep public class com.google.android.gms.** { *; }

# Clevertap
-dontwarn com.clevertap.android.sdk.**


# ExoPlayer
-keep class com.google.android.exoplayer2.ext.av1.** { *; }
-dontnote com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer
-keepclassmembers class com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer {
  <init>(long, android.os.Handler, com.google.android.exoplayer2.video.VideoRendererEventListener, int);
}
-keep class com.samsung.** { *; }
-dontwarn com.samsung.**
-dontwarn com.samsung.multiscreen.BuildConfig
-dontwarn lombok.**

#Map
-keep class com.google.maps.api.android.** {*;}

-keep class com.google.android.gms.ads.identifier.** { *; }
-keep class com.google.gson.stream.** { *; }
-keep class com.google.gson.examples.android.model.** { *; }

# FirebaseInstanceId
-keep public class com.google.firebase.iid.FirebaseInstanceIdReceiver {*;}
