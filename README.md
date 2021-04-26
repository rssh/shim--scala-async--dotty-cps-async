# shim--scala-async--dotty-cps-async

shim which allows to compile scala program which use [scala-async](https://github.com/scala/scala-async) on dotty with [dotty-cps-async](https://github.com/rssh/dotty-cps-async)

i.e. if you want port you program to dotty without changing source code, then you can replace scala-async dependecy to this shim for building with dotty.

```Scala
   libraryDependencies += "com.github.rssh" %% "shim-scala-async-dotty-cps-async" % "0.6.2",
```

['--' in github project name changed to '-' ]

Supported dotty version is 3.0.0-RC3 3.0.0-RC2, 3.0.0-RC1, 3.0.0-M3, 3.0.0-M2

Note, that if you want bug-to-bug compatibility with scala2, than you probably want wait for official port of scala-async compiler plugin.

