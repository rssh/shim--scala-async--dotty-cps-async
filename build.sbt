
val dottyVersion =  "3.0.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "shim--scala-async--dotty-cps-async",
    version := "0.8.0",
    scalaVersion := dottyVersion,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",

    libraryDependencies += "com.github.rssh" %% "dotty-cps-async" % "0.8.0" 

  )

