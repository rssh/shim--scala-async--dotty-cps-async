# shim--scala-async--dotty-cps-async

shim which allows to compile scala program which use scala-async on dotty with dotty-cps-async

i.e. if you want port you program to dotty without changing source code, then you can replace scala-async dependecy to this shim for building with dotty.

```Scala
   libraryDependencies += "com.github.rssh" %% "shim-scala-async-dotty-cps-async" % "0.2.1-RC1",
```

['--' in github project name changed to '-' ]

Supported dotty version is 0.27.0-RC1

Note, that if you want bug-to-bug compatibility with scala2, than you probably want wait for official port of scala-async compiler plugin.

