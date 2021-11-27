name := "SBT-Scala"
version := "0.1"
scalaVersion := "2.11.12"


lazy val persistance = project
		.settings(
			name := "persistance",
			libraryDependencies ++= Seq(
				"mysql" % "mysql-connector-java" % "5.1.21",
				"com.typesafe.slick" %% "slick" % "3.3.3",
				"org.scalatest" %% "scalatest" % "3.2.1" % "test",
				"org.mockito" %% "mockito-scala" % "1.15.0" % "test",
				"com.h2database" % "h2" % "1.4.192" % "test"
			)
		)

lazy val http = project
		.settings(
			name := "http",
			libraryDependencies ++= Seq(
				"com.typesafe.akka" %% "akka-http" % "10.2.7",
				"com.typesafe.akka" %% "akka-actor" % "2.3.16",
				"com.typesafe.akka" %% "akka-stream" % "2.4.2",
				"com.typesafe.akka" %% "akka-http-testkit" % "2.4.2" % "test",
				"com.typesafe.akka" %% "akka-stream-testkit" % "2.6.17" % "test",
				"com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.17" % "test"
			)
		)
		.dependsOn(
			persistance
		)

//lazy val root = project.in(file(".")).aggregates(persistance, http)