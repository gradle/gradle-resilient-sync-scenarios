tasks.register("echoHello") {
    project.exec {
        commandLine("echo", "Hello")
    }
}