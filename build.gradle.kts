import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.plugin.SpringBootPlugin

plugins {
  kotlin("jvm")
  id("org.springframework.boot")
  kotlin("plugin.spring")
}

apply {
  from("gradle/repositories.gradle.kts")
}


dependencies {
  fun springBoot(module : String) = "org.springframework.boot:spring-boot-$module"

  implementation(
    platform(kotlin("bom"))
  )
  implementation(
    platform(SpringBootPlugin.BOM_COORDINATES)
  )

  implementation(springBoot("starter-web"))

  // Use the Kotlin JDK 8 standard library.
  implementation(kotlin("stdlib-jdk8"))
  implementation(kotlin("reflect"))

  testImplementation(springBoot("starter-test"))
  testImplementation("org.jetbrains.kotlin:kotlin-test")

  // Use the Kotlin JUnit integration.
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}


tasks {
  withType<KotlinCompile> {
    kotlinOptions {
      jvmTarget = Versions.Build.java
    }
  }
}
