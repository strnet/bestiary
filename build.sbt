name := """bestiary"""

version := "1.0"

scalaVersion := "2.11.8"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "commons-io" % "commons-io" % "2.4",
  "org.scalafx" %% "scalafx" % "8.0.92-R10",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)
// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

