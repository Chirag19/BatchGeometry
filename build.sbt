import sbtassembly.AssemblyPlugin.defaultShellScript

lazy val hereDir:File = file(".")

lazy val root = (project in hereDir).
	settings(
		name := "BatchGeometry",
		organization := "com.geopipe",
		version := "1.0",
		scalaVersion := "2.11.8",
		libraryDependencies ++= Seq(	"org.scala-lang.modules" %% "scala-xml" % "1.0.6",
						"org.apache.spark" %% "spark-core" % "2.1.0" % "provided",
						"org.json4s" %% "json4s-native" % "3.4.2",
						"commons-io" % "commons-io" % "2.5"),
		mainClass in assembly := Some("com.geopipe.modeltools.BatchGeometrySingle"),
		assemblyOption in assembly := (assemblyOption in assembly).value.copy(prependShellScript = Some(defaultShellScript))
	)

EclipseKeys.withSource := true
