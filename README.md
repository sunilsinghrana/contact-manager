## Overview
The Contact Manager App is an Android application built with Jetpack Compose, designed to help you efficiently create, edit, delete, and search for your contacts. This app provides a seamless contact management experience.

## Features

- **Create**: Easily create new contacts with a few taps, allowing you to write their email and phone number instantly.
- **Edit**: Effortlessly edit your existing contacts, making refining and updating your content simple.
- **Delete**: Remove unwanted contacts quickly and efficiently, helping you stay organized and clutter-free.
- **Search**: Seamlessly search through your contacts using keywords, ensuring you can find what you need in a snap.
  
## Tech stack & Open-source libraries
- 100% [Kotlin](https://kotlinlang.org/) based + [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) and [Flow](https://developer.android.com/kotlin/flow) & [LiveData](https://developer.android.com/topic/libraries/architecture/livedata)
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
    -  A single-activity architecture, using the [Navigation Component](https://developer.android.com/guide/navigation) to manage fragment navigation operations.
    - [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle) - perform an action when lifecycle state changes
    - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes.
    - [UseCases](https://developer.android.com/topic/architecture/domain-layer) - Located domain layer that sits between the UI layer and the data layer.
    - [Repository](https://developer.android.com/topic/architecture/data-layer) - Located in data layer that contains application data and business logic.
- [Android Hilt](https://developer.android.com/training/dependency-injection/hilt-android) - Dependency Injection Library
- [Room](https://developer.android.com/training/data-storage/room) The Room persistence library provides an abstraction layer over SQLite to allow for more robust database access while harnessing the full power of SQLite.

## Architecture
This app uses [***MVVM (Model View View-Model)***](https://developer.android.com/jetpack/docs/guide#recommended-app-arch) architecture

![](/previews/architecture.jpg)
