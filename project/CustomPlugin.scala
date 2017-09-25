import sbt._
import sbt.plugins.JvmPlugin

object CustomPlugin extends AutoPlugin {

  override def requires: Plugins = JvmPlugin
  override def trigger: PluginTrigger = allRequirements

  object autoImport {
    val debugme = taskKey[String]("debug me")
  }

  import autoImport._

  override def projectSettings = Seq(
    debugme := {
      println("debugging this task definition from sbt shell is possible")
      val str = Keys.name.value
      val a = 17
      val b = 4
      val c = a+b

      str + " calculated " + c
    }
  )

}
