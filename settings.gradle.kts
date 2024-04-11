pluginManagement {
    repositories {
        maven {
            val teRepoUrl: String by settings
            val teRepoUser: String by settings
            val teRepoPassword: String by settings

            url = uri(teRepoUrl)
            credentials {
                username = teRepoUser
                password = teRepoPassword
            }
        }
    }
}

rootProject.name = "renovate-gradle-wrapper-bug-reproducer"
include("subproject")
