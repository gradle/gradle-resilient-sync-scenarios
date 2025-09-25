rootProject.name = "kotlin-multi-project-with-broken-project-script"

val projects = listOf("app", "services", "utils")
projects.forEach {
    include(it)
    project(":$it").projectDir = file("projects/$it")
}
