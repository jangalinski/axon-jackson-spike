plugins {
  `java-gradle-plugin`
  `kotlin-dsl`
  `kotlin-dsl-precompiled-script-plugins`
}

apply {
  // repos set in /gradle
  from("../gradle/repositories.gradle.kts")
}

kotlinDslPluginOptions {
  experimentalWarning.set(false)
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$embeddedKotlinVersion")
  implementation("org.jetbrains.kotlin:kotlin-allopen:$embeddedKotlinVersion")

  implementation("org.springframework.boot:spring-boot-gradle-plugin:2.2.1.RELEASE")

  implementation("org.jetbrains.dokka:dokka-gradle-plugin:0.10.0")
  implementation("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.4")
}
