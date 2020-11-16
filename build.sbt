ThisBuild / scalaVersion := "2.13.3"

inThisBuild(
  List(
    semanticdbEnabled := true,
    semanticdbVersion := scalafixSemanticdb.revision,
    scalafixDependencies ++= Seq("com.github.liancheng" %% "organize-imports" % "0.4.3")
  )
)

lazy val root = (project in file("."))
  .aggregate(server)

lazy val server = (project in file("server"))
  .settings(commonSettings)
  .settings(
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http"           % "10.2.1",
      "com.typesafe.akka" %% "akka-stream"         % "2.6.10",
      "com.typesafe.play" %% "play-json"           % "2.9.1",
      "de.heikoseeberger" %% "akka-http-play-json" % "1.35.2",
      "org.typelevel"     %% "cats-core"           % "2.2.0",
      "ch.qos.logback"     % "logback-classic"     % "1.2.3"
    )
  )

lazy val commonSettings = Seq(
  scalacOptions := Seq(
    "-encoding",
    "utf-8",
    "-Ybackend-parallelism",
    "8",
    "-explaintypes",
    "-feature",
    "-unchecked",
    "-Xcheckinit",
    "-Yrangepos", // Use range positions for syntax trees. (Enabled for SemanticDB)
    "-language:existentials",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-language:experimental.macros",
    "-Werror",
    "-Wextra-implicit",
    "-Wnumeric-widen",
    "-Woctal-literal",
    "-Wunused:imports",
    "-Wunused:patvars",
    "-Wunused:privates",
    "-Wunused:locals",
    "-Wunused:explicits",
    "-Wunused:implicits",
    "-Wunused:params",
    "-Wvalue-discard",
    "-Xlint",
    "-release",
    "8"
  )
)
