# Kotlin Multi Project with Broken Project Script

This project is a Kotlin project that works with Gradle 8.14.3 but fails with Gradle 9.0.0+.

Main parts of this scenario:
1. A project plugin in [build-logic](./build-logic) that is applied in the [build.gradle.kts](build.gradle.kts) of the root project.
2. An error that comes from [project-conventions.gradle.kts](./build-logic/src/main/kotlin/project-conventions.gradle.kts) 
where we use an API that was removed in Gradle 9.0.0.

Changing the gradle version in the [gradle-wrapper.properties](./gradle/wrapper/gradle-wrapper.properties) file to 8.14.3 will make the project work again.

## How to use it

1. Run [gradle-client](https://github.com/gradle/gradle-client):
   ```bash
   ./gradlew run
   ```
2. Select the scenario `kotlin-multi-project-with-broken-project-script`.
3. Query the desired models, such as `GradleBuild` (Build Model), `KotlinDslBaseScriptModel` (Kotlin DSL Base Model), or `KotlinDslScriptsModel` (Kotlin DSL Scripts Model).

## Current behavior with IDE (IntelliJ 2025.2.2)
After opening the project in IntelliJ with Gradle 9.1.0 configured:
- The IDE sync fails with the error:
```
> Configure project :services
e: file:///<path>/gradle-resilient-sync-scenarios/kotlin-multi-project-with-broken-project-script/projects/services/build.gradle.kts:6:13: Unresolved reference 'exec'.
```
- There is no code completion in any script file.
- Navigation to Gradle API doesn't work in any script file.

## Expected behavior with IDE
After opening the project in IntelliJ with Gradle 9.1.0 configured:
- The IDE sync fails with the error:
```
> Configure project :services
e: file:///<path>/gradle-resilient-sync-scenarios/kotlin-multi-project-with-broken-project-script/projects/services/build.gradle.kts:6:13: Unresolved reference 'exec'.
```
- [settings.gradle.kts](./settings.gradle.kts) has full code insight (no warnings, code completion works, navigation to Gradle API works).
- [projects/app/build.gradle.kts](./projects/app/build.gradle.kts) has full code insight (no warnings, code completion works, navigation to Gradle API works).
- [projects/services/build.gradle.kts](projects/services/build.gradle.kts) has full code insight (no warnings, code completion works, navigation to Gradle API works).
- [projects/utils/build.gradle.kts](projects/utils/build.gradle.kts) has partial code insight:
    - Code completion works for standard Gradle API that matches wrapper version.
    - Navigation to Gradle API works.
    - There is a warning:
      ```Code insight is incomplete (Script configuration contains errors)```
