name := "NetworkWordCountExample"

version := "1.0"

scalaVersion := "2.10.5"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.6.3",
  "org.apache.spark" %% "spark-streaming" % "1.6.3"
)