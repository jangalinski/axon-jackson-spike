import org.gradle.api.JavaVersion

object Versions {


  object Build {
    val javaVersion = JavaVersion.VERSION_1_8
    val java = javaVersion.toString()
  }
}
