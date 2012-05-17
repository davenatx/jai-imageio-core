import sbt._
import Keys._
import sbt.Package.ManifestAttributes


object JaiImageioCoreBuild extends Build {
  val buildVersion = "1.2-pre-dr-b04-2012-05-17"
  
  lazy val jai_imageio_core = Project(
    id = "jai-imageio-core",
	base = file("."),
	settings = Project.defaultSettings ++ Seq (
	  description := "jai-imageio-core where dependencies to javax.media.jai and libJIIO C implementations have been removed.",
	  organization := "com.github.davenatx",
	  version := buildVersion,
	  parallelExecution := false,
	  publishTo := Some(Resolver.file("Github Pages", Path.userHome / "git" / "davenatx.github.com" / "maven" asFile)(Patterns(true, Resolver.mavenStyleBasePattern))),
	  publishMavenStyle := true,
	  publishArtifact in Test := false,
	  pomExtra := extraPom,
	  scalaVersion := "2.9.1",
	  crossPaths := false,
	  javacOptions ++= Seq("-source", "1.5", "-target", "1.5"),
	  // prevent javadoc generation for java sources
	  sources in (Compile, doc) ~= (_ filter (_.getName endsWith ".scala")),
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
  
  def extraPom = (
    <url>http://github.com/davenatx/jai-imageio-core</url>
    <scm>
      <url>git@github.com:davenatx/jai-imageio-core.git</url>
      <connection>scm:git:git@github.com:davenatx/jai-imageio-core.git</connection>
    </scm>
    <developers>
      <developer>
      <id>davenatx</id>
      <name>David Price</name>
      <url>http://github.com/davenatx</url>
    </developer>
  </developers>)

  
}

