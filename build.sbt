name := "fun with docker n scala"

version := "0.1"

scalaVersion := "2.12.5"

enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)
mainClass in Compile := Some("ScalaInDocker")