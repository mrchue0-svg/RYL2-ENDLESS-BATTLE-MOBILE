# RYL2 Endless Battle Mobile

Android launcher **prototype** for RYL2 Endless Battle. Separate from the Remastered project.

## Implemented
- Native Android launcher screen with six HIGH/LOW controls.
- Independent application ID `com.ryl2.endlessbattle`.
- Buttons intentionally disabled until actual Windows compatibility runtime and client integration is tested.

## Not yet implemented
- Winlator CMod Wine/Box64 runtime integration and container execution.
- `login.exe` / `clientsetup.exe` execution.
- Touch controls, HIGH/LOW performance presets.
- First-launch game client download and extraction (awaiting admin patch).

## Build
Requires JDK 17, Android SDK 35, Android Gradle Plugin 8.8.0 and Gradle 8.10.2 or compatible. Open the project in Android Studio and build the `app` module. A Gradle wrapper is not bundled in this starter ZIP.

## Source baseline
https://github.com/mrchue0-svg/Winlator-CMOD (branch `winlator_bionic`). This prototype does **not** include or redistribute its binaries. Check applicable licenses and redistribution rights before integrating runtimes or game assets.
