name := "sbt-shell-debugging-example"

version := "0.1"

scalaVersion := "2.12.3"

val cannotDebug = taskKey[String]("can't debug this :(")

cannotDebug := {
  println("unfortuantely setting breakpoints or stepping through here won't work")

  "nope."
}