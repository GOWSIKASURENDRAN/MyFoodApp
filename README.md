# MyFood - Food Delivery App

A Kotlin-based Android application similar to Uber Eats, featuring a beautiful splash screen and comprehensive login/signup screen.

## Screens Implemented

### ✅ PAGE 1: SPLASH SCREEN
- **Screen Size**: 360×800 dp (portrait orientation)
- **Background**: Gradient from brand green (#06C167) to white
- **Logo**: Centered food icon (40% of screen width)
- **Tagline**: "Deliciousness at your doorstep"
- **Loader**: Fork and spoon icon at bottom center

### ✅ PAGE 2: LOGIN / SIGNUP SCREEN
- **Screen Size**: 360×800 dp (portrait orientation)
- **Background**: Light neutral (#F9F9F9) with top green strip
- **Layout**: Complete authentication flow with modern Material Design 3

#### Login Screen Features:
- **App Logo**: 100dp centered at top
- **Welcome Section**: "Welcome" + "Login to continue" text
- **Input Fields**: Email/Phone and Password with rounded corners
- **Login Button**: Full-width primary button (#06C167)
- **Social Login**: Google and Facebook buttons
- **Sign Up Prompt**: "Don't have account? Sign Up"
- **Terms & Privacy**: Bottom legal text

## Design Specifications

### Colors
- **Primary Color**: #06C167 (Brand Green)
- **Background**: #F9F9F9 (Light Neutral)
- **Text Colors**: #333333 (Dark), #777777 (Medium), #999999 (Light)
- **Input Background**: #F1F1F1 (Light Gray)
- **Facebook Blue**: #1877F2

### Typography
- **Headings**: 24sp, sans-serif-bold
- **Body Text**: 14sp-16sp, sans-serif-medium
- **Small Text**: 12sp, sans-serif

### Layout Structure
```
----------------------------------------
|          [ App Logo ]                |
|                                      |
|      [ Welcome Text: "Welcome" ]     |
|  [ Small text: "Login to continue"]  |
|                                      |
|   [ Email / Phone Input Field ]      |
|   [ Password Input Field ]           |
|                                      |
|      [ Primary Login Button ]        |
|                                      |
|  [ OR divider ]                      |
|  [ Google Button ] [ Facebook Btn ]  |
|                                      |
|  [ Don't have account? Sign Up ]     |
|                                      |
|       [ Terms & Privacy Text ]       |
----------------------------------------
```

## Project Structure

```
app/src/main/
├── java/com/example/myfood/
│   ├── MainActivity.kt          # Splash screen activity
│   └── LoginActivity.kt         # Login screen activity
├── res/
│   ├── drawable/
│   │   ├── splash_gradient.xml  # Background gradient
│   │   ├── ic_food_logo.xml     # App logo icon
│   │   ├── ic_fork_spoon.xml    # Loader icon
│   │   ├── ic_eye.xml           # Password visibility icon
│   │   ├── ic_google.xml        # Google icon
│   │   └── ic_facebook.xml      # Facebook icon
│   ├── layout/
│   │   ├── activity_main.xml    # Splash screen layout
│   │   └── activity_login.xml   # Login screen layout
│   ├── values/
│   │   ├── colors.xml           # Color definitions
│   │   └── strings.xml          # String resources
│   └── values-night/
│       └── themes.xml           # Dark theme support
```

## Technical Implementation

- **100% Kotlin**: No Java code used
- **Material Design 3**: Modern Android design components
- **ConstraintLayout**: Responsive layout system
- **Vector Drawables**: Scalable icons for all screen densities
- **Edge-to-Edge**: Full-screen immersive experience
- **TextInputLayout**: Enhanced input fields with validation support

## Building the Project

```bash
./gradlew assembleDebug
```

## Requirements

- Android Studio Hedgehog | 2023.1.1 or later
- Minimum SDK: API 24 (Android 7.0)
- Target SDK: API 36 (Android 14)
- Kotlin 1.9.0+
- Material Design 3 components

## Navigation Flow

1. **Splash Screen** → MainActivity (launcher)
2. **Login Screen** → LoginActivity (accessible from MainActivity)

## Next Steps

This foundation provides:
- ✅ Beautiful splash screen with brand identity
- ✅ Complete login/signup interface
- ✅ Modern Material Design 3 UI components

Future development can include:
- User authentication logic
- Restaurant listing and search
- Food ordering flow
- Payment integration
- User profile management
- Navigation between screens
