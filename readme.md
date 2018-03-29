A simple example to create a docker image from scala code.

Note:
Add the following into project/plugin.sbt

      ```
      addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.3")
      ```
Add the following into build.sbt

      ```
      enablePlugins(JavaAppPackaging)
      enablePlugins(DockerPlugin)
      mainClass in Compile := Some("ScalaInDocker")
      ```

Usage:
To build the docker image type:

      ```
      sbt docker:publishLocal
      ```
To run the docker image:

      ```
      docker run -it fun-with-docker-n-scala:0.1
      ```
