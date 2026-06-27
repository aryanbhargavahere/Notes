Notes App

A lightweight, modern Android notes application built using Jetpack Compose, Kotlin Coroutines, and architecture components following standard MVVM practices. The application manages state reactively using unidirectional data flow pipelines via StateFlow.
🚀 Features & Architecture

    Modern UI: Built entirely using Jetpack Compose Declarative layouts and Material Design 3 elements (Scaffold, TopAppBar, Card, LazyColumn).

    Unidirectional Data Flow: State management engineered using clean ViewModel boundaries and state emissions managed by immutable state streams.

    Reactive Pipeline: Auto-updating list updates leveraging MutableStateFlow arrays backboned by state collections inside Composables.

🛠️ Installation & Setup
Prerequisites

    Android Studio (Ladybug or newer recommended)

    Android SDK (Target API Level 34+)

    Gradle Version JDK 17+ compatible

Running the Project Locally

    Clone the repository:

Bash

git clone https://github.com/YOUR_USERNAME/YOUR_REPOSITORY_NAME.git
cd YOUR_REPOSITORY_NAME

    Open with Android Studio:
    Launch Android Studio, select File > Open, and choose the project root folder.

    Sync Gradle:
    Let the IDE download the background dependencies and finish building index targets.

    Run the app:
    Connect a physical device via ADB debugging or start an Android Emulator instance, then click the Run button (or press Shift + F10).
