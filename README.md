<img src="https://bluemixassets.eu-gb.mybluemix.net/api/Products/image/logos/basic.svg?key=[starter-basic]&event=readme-image-view" alt="Basic Logo" width="200px"/>

## Empty Starter
Empty IBM Cloud Mobile Starter in Java

[![](https://img.shields.io/badge/ibmcloud-powered-blue.svg)](https://bluemix.net)
[![](https://img.shields.io/badge/platform-android-lightgrey.svg?style=flat)](https://developer.android.com/index.html)

### Table of Contents
* [Summary](#summary)
* [Requirements](#requirements)
* [Configuration](#configuration)
* [Run](#run)
* [License](#license)

### Summary

The Empty mobile starter is an empty project that has integration points for each of the IBM Cloud Mobile services.

### Requirements

* A [IBM Cloud](http://bluemix.net) Account
* [Android Studio](https://developer.android.com/studio/index.html) and [Gradle](https://gradle.org/gradle-download/)

### Configuration

* Open the project in Android Studio and perform a Gradle Sync.
* Incase Mobile Foundation and/or AppLaunch servcies are added then follow the below pre steps.

  ##### Steps (IBM Cloud Mobile Foundation (Optional)):

  * Goto the project folder and find a shell script by name **mfpregisterapp.sh** and ensure that you have execute and write permissions in order to run the script.
  * run **mfpregisterapp.sh**. This should setup the Mobile Foundation prereqs for running the starter
  
  ##### Steps (IBM Cloud AppLaunch (Optional)):
  
  * Goto the project folder and find a shell script by name **applnchimportsample.sh** and ensure that you have execute and write permissions in order to run the script.
  * run **applnchimportsample.sh**. This should setup the Mobile Foundation prereqs for running the starter
  * [AppLaunch Client SDK Git Repo](https://github.com/ibm-bluemix-mobile-services/bms-clientsdk-android-applaunch)


### Run

Click **Run** to start the app in Android Studio.

<img src="README_Images/basic.png" alt="Empty App Screenshot" width="250px"/>

The application has built in integration points for the Mobile Analytics, Push Notifications, AppLaunch and Mobile Foundation services. If you have added these services then the basic code is automatically generated for the services.

### License
This package contains code licensed under the Apache License, Version 2.0 (the "License"). You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 and may also view the License in the LICENSE file within this package.
