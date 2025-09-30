# Gradle Resilient Sync Scenarios
Example sync scenarios to demonstrate Gradle Build Tool resilient sync.

The idea is that with this project and [gradle-client](https://github.com/gradle/gradle-client) we can demonstrate Gradle's resilient sync capabilities.

## How to use it
1. Clone the repositories:
   ```bash
   git clone git@github.com:gradle/gradle-client.git
   git clone git@github.com:gradle/gradle-resilient-sync-scenarios.git
    ```
2. Run the `gradle-client` project:
   ```bash
   cd gradle-client
   ./gradlew run
   ```
3. Select the scenario you want to use and query desired models.
   
## Scenarios
Each scenario has its own README.md file with details about the scenario, current behavior with IDE, and expected behavior with IDE.
Currently there are three scenarios:
- [kotlin-multi-project-with-broken-project-script](./kotlin-multi-project-with-broken-project-script/README.md)
- [kotlin-project-with-broken-project-conventions-plugin](./kotlin-project-with-broken-project-conventions-plugin/README.md)
- [kotlin-project-with-broken-settings-conventions-plugin](./kotlin-project-with-broken-settings-conventions-plugin/README.md)
