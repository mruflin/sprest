import sbt._

object Dependencies {
  val resolutionRepos = Seq(
    "spray repo" at "http://repo.spray.io",
    "spray nightlies" at "http://nightlies.spray.io",
    "Mark Schaake" at "http://markschaake.github.com/snapshots",
    "Typesafe releases" at "http://repo.typesafe.com/typesafe/releases",
    "Sonatype snapshots" at "https://oss.sonatype.org/service/local/repositories/snapshots/content")

  def compile(deps: ModuleID*): Seq[ModuleID] = deps map (_ % "compile")
  def provided(deps: ModuleID*): Seq[ModuleID] = deps map (_ % "provided")
  def test(deps: ModuleID*): Seq[ModuleID] = deps map (_ % "test")
  def testAndIt(deps: ModuleID*): Seq[ModuleID] = deps map (_ % "test,it")
  def runtime(deps: ModuleID*): Seq[ModuleID] = deps map (_ % "runtime")
  def container(deps: ModuleID*): Seq[ModuleID] = deps map (_ % "container")

  val sprayVersion = "1.3.2"
  def sprayModule(id: String) = "io.spray" %% id % sprayVersion

  val akkaVersion = "2.3.7"
  def akkaModule(id: String) = "com.typesafe.akka" %% id % akkaVersion

  val sprayCan = sprayModule("spray-can")
  val sprayRouting = sprayModule("spray-routing")
  val sprayTestKit = sprayModule("spray-testkit")
  val sprayJson = "io.spray" %% "spray-json" % "1.3.1"
  val logback = "ch.qos.logback" % "logback-classic" % "1.1.2"
  val joda = "joda-time" % "joda-time" % "2.3"
  val jodaConvert = "org.joda" % "joda-convert" % "1.6"
  val specs2 = "org.specs2" %% "specs2" % "2.3.11"
  val akkaActor = akkaModule("akka-actor")
  val akkaTestKit = akkaModule("akka-testkit")
  val reactiveMongo = "org.reactivemongo" %% "reactivemongo" % "0.10.5.0.akka23"
}
