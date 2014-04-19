import sbt._
import sbt.Keys._
 
object ProjectBuild extends Build {
 
  lazy val root = Project(
    id = "root",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Scala + Akka Test",
      organization := "org.example",
      version := "0.1-SNAPSHOT",
 
      scalaVersion := "2.10.3",
      scalaHome := Some(file("F:\\Program Files (x86)\\scala")),
 
	  resolvers ++= Seq(
				"Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/",
				"Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"
				),
      libraryDependencies ++= Seq(
        "junit"             % "junit"           % "4.5"             % "test",
        "org.scalatest"     % "scalatest_2.10" % "1.9.1"           % "test"
      )
    )
  )
}

