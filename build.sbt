name := "Sample"
 
version := "1.0"
 
scalaVersion := "2.10.1"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"

libraryDependencies += "com.novocode" % "junit-interface" % "0.8" % "test->default"

// Read here for optional dependencies:
// http://etorreborre.github.com/specs2/guide/org.specs2.guide.Runners.html#Dependencies
 
testOptions in Test += Tests.Argument("junitxml", "html", "console")
 
resolvers ++= Seq(
	"snapshots" at "http://oss.sonatype.org/content/repositories/snapshots"
)
