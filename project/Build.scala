import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "lanmatchmaker2000"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    "com.typesafe" %% "play-plugins-mailer" % "2.1.0",
    "mysql" % "mysql-connector-java" % "5.1.18"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
