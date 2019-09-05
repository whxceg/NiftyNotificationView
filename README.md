# QMUI for Android



## How to import

Add this to your build.gradle:

```
repositories {
    maven { url 'https://www.jitpack.io' }
}

dependencies {
    implementation 'com.github.whxceg:NiftyNotificationView:0.0.1'
}
```

## Example
```java
Configuration cfg = new Configuration.Builder()
                            .setAnimDuration(100)
                            .setDispalyDuration(300)
                            .setBackgroundColor("#F86161")
                            .setTextColor("#FFFFFF")
                            .setIconBackgroundColor("#FFFFFFFF")
                            .setTextPadding(15)
                            .setViewHeight(50 + SizeUtils.px2dp(this, BarUtils.getHeight(this)))
                            .setTextSize(20)
                            .setTextLines(2).
                            setTextGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL)
                            .build();

NiftyNotificationView.build(activity, msg, Effects.standard, R.id.nifty, cfg).show();

```

### Changelog

#### 0.0.1
* Introduce better API
