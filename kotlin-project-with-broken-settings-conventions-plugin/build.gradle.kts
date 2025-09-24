
tasks.register("echoHelloProject") {
    project.exec {
        commandLine("echo", "Hello from Project")
    }
}