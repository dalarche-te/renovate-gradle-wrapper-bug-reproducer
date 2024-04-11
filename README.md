# work to reproduce https://github.com/renovatebot/renovate/discussions/28159

This is a WIP.

Our current setup is using the exact renovate.json config in this repo and we have a self-hosted 
renovate deployment. It's running inside of our github organization and builds on jenkins.

I decided to not include the Jenkinsfile because none of it is minimally reproducible. It's likely
part of the problem.

I spun up an action in the reproducer on github that effectively produces the same error.

Running locally, the reported command that is failing in the logs is:
./gradlew :wrapper --gradle-distribution-url https://services.gradle.org/distributions/gradle-8.7-bin.zip

Running in the CI, the reported command that is failing is referencing the "teRepoUrl" variable we have 
defined in the settings.gradle file. (line 8)