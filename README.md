# Huawei HMS SDK / AppConnect Test App

> Test app for FCM / HCM and stuff from Huawei App Gallery

## Prerequisites

[Make sure to have Android Studio](https://developer.android.com/studio/preview/)
[Make sure you have an approved account in Huawei AppGallery](https://developer.huawei.com/consumer/en/console/)
[Firebase Account / Project for your app](https://console.firebase.google.com/)

## Problem
* Some features being used in GooglePlayServices such as FCM, Location, IAP might / will not work on Huawei Devices without it
* [Huawei Android Ban Status](https://www.xda-developers.com/google-revoke-huawei-android-ban-blacklist/)

## Findings
* Huawei App Gallery depends Huawei Mobile Services similar to (Google GMS).
* As of this writing (12-04-2019) Huawei AppGallery doesn't support .aab only .apk / .rpk files.
* Huawei AppConnectServices and GooglePlayServices can co-exist for as long as both of their dependecies are installed on the Android device.

## Early Solutions
* Separate integration of GooglePlayServices and Huawei Mobile Services by Build Flavors
* Contain both integration but add condition statements, which should prioritize GooglePlayServices

## TBD
* Huawei devices w/o GooglePlayServices behavior
* Google PlayStore approval if Huawei HMS / AppConnect SDK is packaged inside the application

### Author:
[Mike Lau](https://mike14u.github.io)