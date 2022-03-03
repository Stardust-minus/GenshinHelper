plugins {
    val kotlinVersion = "1.6.20-M1"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.10.0"
}

group = "org.laolittle.plugin"
version = "1.0"

repositories {
    mavenCentral()
    maven("https://maven.aliyun.com/repository/central")
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

fun skikoAwt(ver: String) = "org.jetbrains.skiko:skiko-awt-runtime-$ver:0.7.12"
fun exposed(module: String) = "org.jetbrains.exposed:exposed-$module:0.37.3"

dependencies {
    compileOnly(exposed("core"))
    compileOnly(exposed("dao"))
    compileOnly(exposed("jdbc"))
    compileOnly(exposed("java-time"))
    compileOnly("org.xerial:sqlite-jdbc:3.36.0.3")
    compileOnly("com.alibaba:druid:1.2.8")
    compileOnly(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    compileOnly(skikoAwt("windows-x64"))
    compileOnly(skikoAwt("linux-x64"))
    compileOnly(skikoAwt("linux-arm64"))
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.3.2")
}