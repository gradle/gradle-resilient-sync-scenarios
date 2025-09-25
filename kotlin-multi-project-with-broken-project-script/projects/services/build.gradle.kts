plugins {
    id("java-library")
}

tasks.register("echoHello") {
    project.exec {
        commandLine("echo", "Hello")
    }
}