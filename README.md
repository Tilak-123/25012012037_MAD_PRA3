# MAD Practical 3 - Android Explicit & Implicit Intents

**Enrollment / Project ID:** `25012012037_MAD_PRA3`  
**Application Name:** `25012012037_MAD_PRA3`

---

## 📌 Overview

This Android application demonstrates the use of **Explicit Intents** and **Implicit Intents** in Android development using Kotlin and ConstraintLayout with Material Design UI components.

---

## ✨ Features

### 1. Explicit Intent
- **Main to Login Navigation**: Navigates from `MainActivity` to `LoginActivity`, passing extra data (`username` and `password`) via Intent extras.

### 2. Implicit Intents
- 🌐 **Browse Website**: Opens default browser with `https://www.google.com`.
- 📞 **Phone Dialer**: Launches default dialer prepopulated with entered phone number (`ACTION_DIAL`).
- 📋 **Call Log**: Displays phone call history (`CallLog.Calls.CONTENT_TYPE`).
- 🖼️ **Gallery**: Opens system gallery application for image viewing (`image/*`).
- 📷 **Camera**: Launches camera application to capture images (`ACTION_IMAGE_CAPTURE`).
- ⏰ **Alarm**: Opens system clock/alarm settings (`ACTION_SHOW_ALARMS`).

### 3. User Interface (UI)
- **Login Screen (`LoginActivity`)**: Form layout with username, password, forgot password prompt, and submit button.
- **Registration Screen (`RegisterActivity`)**: Input fields for Full Name, Phone Number, City, Email ID, Password, and Confirm Password with smooth navigation back to Login.

---

## 📁 Project Structure

```
app/src/main/
├── java/com/example/a25012012037_mad_pra3/
│   ├── MainActivity.kt      # Main dashboard with implicit/explicit intent actions
│   ├── LoginActivity.kt     # Handles login view & receives intent extras
│   └── RegisterActivity.kt  # User registration interface
└── res/
    ├── layout/
    │   ├── activity_main.xml     # Dashboard layout
    │   ├── activity_login.xml    # Login form card layout
    │   └── activity_register.xml # Registration form card layout
    ├── values/
    │   ├── colors.xml
    │   ├── strings.xml
    │   └── themes.xml
    └── drawable/
        └── guni_pink_logo_1.jpg
```

---

## 🛠️ Tech Stack & Prerequisites

- **Language:** Kotlin
- **Min SDK:** 24+ (Android 7.0)
- **Target SDK:** 34+ (Android 14)
- **UI Framework:** XML Views, Material Components, ConstraintLayout
- **IDE:** Android Studio (Ladybug / 2024.2+ / 2026.1+)
- **Build System:** Gradle (Kotlin DSL `.gradle.kts`)

---

## 🚀 Getting Started

1. **Clone or Open the Repository in Android Studio:**
   Open Android Studio and select **File > Open**, then navigate to the project directory.

2. **Sync Project with Gradle Files:**
   Allow Android Studio to sync dependencies and build index.

3. **Run the Application:**
   Select an emulator or connected Android device and click **Run** (`Shift + F10`).

---

## 👤 Developer Details

- **Name:** Tilak Pandya
- **Enrollment Number:** 25012012037
- **Class:** CE-H-1

