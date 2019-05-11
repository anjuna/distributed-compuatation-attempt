import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "distributed-compuatation-attempt",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "com.typesafe.akka" %% "akka-typed" % "2.5.6",
    libraryDependencies += "co.fs2" %% "fs2-core" % "1.0.4", // For cats 1.5.0 and cats-effect 1.2.0
    libraryDependencies += "co.fs2" %% "fs2-io" % "1.0.4",
    libraryDependencies += "co.fs2" %% "fs2-reactive-streams" % "1.0.4"
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
