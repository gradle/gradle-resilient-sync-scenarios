# Kotlin Multi Project with Broken Project Script

This project is a Kotlin project that works with Gradle 8.14.3 but fails with Gradle 9.0.0.

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
