
val dottyVersion =  "0.27.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "shim--scala-async--dotty-cps-async",
    version := "0.2.0-RC1",
    organization := "com.github.rssh",
    scalaVersion := dottyVersion,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",

    libraryDependencies += "com.github.rssh" %% "dotty-cps-async" % "0.2.0-RC1" 

  )

