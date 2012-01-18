import sbt._
object GoogleGeoCodingApi extends Build
{
  lazy val root =
    Project("root", file(".")) dependsOn(dispatchLiftJson)
  lazy val dispatchLiftJson =
    uri("git://github.com/dispatch/dispatch-lift-json#0.1.1")
}
