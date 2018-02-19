# KotlinLearning [part1]
This project presents the first part of an [Android tutorials/samples series](http://www.amalhichri.net) I am currently sharing.
It's also the first part of the [KotlinLearning Android app](http://www.amalhichri.net) recently published.

## Description

KotlinLearning [part1] implements the following functionalities:

* ### User registration management with Firebase
    * user signup | user signin
    * password recovery
    * email verification
    * user session management

* ### Linkedin Mobile SDK for Android integration
Easy and clear implementation of LinkedIn SDK for Android to ask for user's permission to retrieve their data and create/signin a firebase user with it.

![linkedInLogin](https://raw.githubusercontent.com/AmalH/KotlinLearning-Part1-/master/screenshots/linkedInRegistration.png)

* ### Facebook SDK for Android integration
Use of the Facebook sdK for Android to log user in through their facebook account.
User registration or signin through Firebase after getting user permission to get their data.

* ### Facebook Graph API integration/manipulation
Use of the Graph API to get user's profile picture and basic data for the moment.
In following parts we'll be consuming user's shares, news feed and more.

![loginUi](https://raw.githubusercontent.com/AmalH/KotlinLearning-Part1-/master/screenshots/loginUI.png)

* ### A set of valuable user interface components/libraries usage

Libraries usage
* Material text fields and other ui components using [Material library](https://github.com/rey5137/Material/wiki/Text-Field)
* Custom fonts using [Calligraphy library](https://github.com/chrisjenx/Calligraphy)
* CirclePageIndicator usage from [CircleIndicator library](https://github.com/ongakuer/CircleIndicator)

![circularIndicator](https://raw.githubusercontent.com/AmalH/KotlinLearning-Part1-/master/screenshots/circularPageIndicator.gif)

* CircularImageView in user profile from [CircleImageView library](https://github.com/hdodenhof/CircleImageView)

![circularImageView](https://raw.githubusercontent.com/AmalH/KotlinLearning-Part1-/master/screenshots/circularImageView.png)

UIs created:
* Custom TabLayout

![tabLayout](https://raw.githubusercontent.com/AmalH/KotlinLearning-Part1-/master/screenshots/tabLayout.gif)

* Custom listViews
    *  Sectionned listView

![sectionnedListView](https://raw.githubusercontent.com/AmalH/KotlinLearning-Part1-/master/screenshots/sectionnedListView.png)

## Getting started
Clone this repository and import into Android Studio
```javascript
git clone https://github.com/AmalH/KotlinLearning-Part1-.git
```
### Pre-requisites
* Android SDK 27
* Android Build Tools v27.0.0
* Android Support Repository
