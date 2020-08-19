# Huawei HMS SDK / AppGalleryConnect Test App

> Reference / test app for integrating push notification via Firebase Cloud Messaging and/or Huawei Push Kit

## Prerequisites

* [Make sure to have Android Studio](https://developer.android.com/studio/preview/)
* [Make sure you have an approved account in Huawei AppGallery](https://developer.huawei.com/consumer/en/console/)
* [Firebase Account / Project for your app](https://console.firebase.google.com/)

## Update
* Huawei SDK Libraries no longer work in devices that have GooglePlayServices. Most likely, you will receive a 907135003 code error.
* FCM and some other Google APIs no longer work in Huawei standalone devices.
* AppGallery is consistently being updated and now have features such as Remote Config, Crash Reports, Cloud Debug, support for .aab and signing it.
* [Huawei Android Ban Status](https://www.xda-developers.com/google-revoke-huawei-android-ban-blacklist/)
* Integration of GooglePlayServices and HuaweiMobileServices should be separate (by having build variants or flavors) as they are both unnecessary to their counterparts.
* As of this writing approval for Google Play or Huawei AppGallery won't matter even if you have their SDKs integrated, it will not work anyway.
* If you want to test on Huawei Devices without GooglePlayServices, you can head over to [Cloud Debug](https://developer.huawei.com/consumer/en/doc/development/AppGallery-connect-Guides/agc-clouddebug-introduction) if you have an AppGallery account.

## References
* [Huawei Developer Documentation](https://developer.huawei.com/consumer/en/doc/development)
* [Fastlane CI/CD for Huawei AppGallery Deployment](https://github.com/shr3jn/fastlane-plugin-huawei_appgallery_connect)


### Author:
[Mike Lau](https://mike14u.github.io)