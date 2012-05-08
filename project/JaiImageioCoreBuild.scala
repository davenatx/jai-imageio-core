import sbt._
import Keys._
import sbt.Package.ManifestAttributes


object JaiImageioCoreBuild extends Build {
  val buildVersion = "1.2-pre-dr-b04-2012-05-08"
  
  lazy val jai_imageio_core = Project(
    id = "jai-imageio-core",
	base = file("."),
	settings = Project.defaultSettings ++ Seq (
	  description := "jai-imageio-core where dependencies to javax.media.jai and libJIIO C implementations have been removed.",
	  organization := "net.java",
	  version := buildVersion,
	  parallelExecution := false,
	  publishMavenStyle := false,
	  scalaVersion := "2.9.1",
	  crossPaths := false,
	  javacOptions ++= Seq("-source", "1.5", "-target", "1.5"),
	  scalacOptions ++= Seq("-optimize", "-deprecation"),
	  packageOptions := Seq(ManifestAttributes(
	    ("Specification-Title", "Java Advanced Imaging Image I/O Tools"),
		("Specification-Version", buildVersion),
		("Specification-Vendor", "Sun Microsystems, Inc."),
		("Implementation-Title", "com.sun.media.imageio"),
		("Implementation-Version", buildVersion),
		("Implementation-Vendor", "Sun Microsystems, Inc."),
		("Extension-Name", "com.sun.media.imageio"))))
  )  
}

