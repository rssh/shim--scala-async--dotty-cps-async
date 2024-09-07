
ThisBuild / versionScheme := Some("early-semver")

val dottyVersion =  "3.3.3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "shim--scala-async--dotty-cps-async-lts",
    version := "0.9.22",
    scalaVersion := dottyVersion,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",

    libraryDependencies += "com.github.rssh" %% "dotty-cps-async-lts" % "0.9.22" 

  )

