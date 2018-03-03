plugins {
    application
    kotlin("jvm") version "1.2.10"
}

application {
    mainClassName = "cash.andrew.MainKt"
}

repositories {
    jcenter()
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(kotlin("stdlib"))
}
