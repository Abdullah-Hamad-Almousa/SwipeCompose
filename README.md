# This is a Kotlin Multiplatform project targeting Android, iOS, Web, Desktop (JVM).

### A simple app that show images by scrolling or clicking on buttons

### How to run it and test it:

---

### Build and Run Android Application

- on macOS/Linux
  ```shell
  ./gradlew :composeApp:assembleDebug
  ```
- on Windows
  ```shell
  .\gradlew.bat :composeApp:assembleDebug
  ```

### Build and Run Desktop (JVM) Application

- on macOS/Linux
  ```shell
  ./gradlew :composeApp:run
  ```
- on Windows
  ```shell
  .\gradlew.bat :composeApp:run
  ```

### Build and Run Web Application

- on macOS/Linux
  ```shell
  ./gradlew :composeApp:wasmJsBrowserDevelopmentRun
  ```
- on Windows
  ```shell
  .\gradlew.bat :composeApp:wasmJsBrowserDevelopmentRun
  ```
for the JS target (slower, supports older browsers):
- on macOS/Linux
  ```shell
  ./gradlew :composeApp:jsBrowserDevelopmentRun
  ```
- on Windows
  ```shell
  .\gradlew.bat :composeApp:jsBrowserDevelopmentRun
  ```