name := "$name_hyphen$"

version := "$version$"

scalaVersion := "2.10.4"

resolvers += DefaultMavenRepository

resolvers += Resolver.sonatypeRepo("public")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

seq(bintrayResolverSettings:_*)

libraryDependencies ++= Seq(
	"org.springframework.boot" % "spring-boot-starter-jdbc" % "1.1.6.RELEASE",
	"org.springframework.boot" % "spring-boot-starter-web" % "1.1.6.RELEASE",
	"org.springframework.boot" % "spring-boot-starter-thymeleaf" % "1.1.6.RELEASE",
	"org.springframework" % "spring-test" % "4.0.7.RELEASE",
	"com.h2database" % "h2" % "1.4.181",
	"org.flywaydb" % "flyway-core" % "3.0",
	"org.springframework.data" % "spring-data-commons" % "1.8.4.RELEASE",
	"org.springframework.data" % "spring-data-jdbc-core" % "1.0.0.RELEASE",
	"com.mangofactory" % "swagger-springmvc" % "0.8.8",
	"com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.4.3",
	"com.fasterxml.jackson.dataformat" % "jackson-dataformat-xml" % "2.4.3",
  "com.fasterxml.jackson.datatype" % "jackson-datatype-joda" % "2.4.3",
	"org.springframework.scala" %% "spring-scala" % "1.0.0.RC1",
	"org.postgresql" % "postgresql" % "9.3-1102-jdbc4"
)

//	"org.springframework.boot" % "spring-boot-starter-actuator" % "1.1.6.RELEASE",
//	"org.springframework.boot" % "spring-boot-starter-remote-shell" % "1.1.6.RELEASE",

// "org.springframework" % "springloaded" % "1.2.0.RELEASE",
//	"io.github.jhipster.loaded" % "agent" % "0.12" exclude("org.springframework", "springloaded")

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.6"



//javaOptions += "-javaagent:/home/user/.ivy2/cache/org.springframework/springloaded/jars/springloaded-1.2.0.RELEASE.jar -noverify"

//EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

//EclipseKeys.withSource := true

packAutoSettings
