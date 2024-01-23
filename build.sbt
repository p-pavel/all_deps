Global / onChangedBuildSource := ReloadOnSourceChanges
ThisBuild / scalaVersion := "3.3.1"

lazy val root = project.in(file(".")).aggregate(p3)
// lazy val p212 = project
//   .in(file("modules/212"))
//   .settings(
//     scalaVersion := "2.12.10",
//     libraryDependencies ++= deps212only
//   )
// lazy val p213 = project
//   .in(file("modules/213"))
//   .settings(
//     scalaVersion := "2.13.12",
//     libraryDependencies ++= deps213only
//   )
lazy val p3 = project
  .in(file("modules/3"))
  .settings(
    scalaVersion := "3.3.1",
    libraryDependencies ++= deps3
  )

lazy val deps3 = Seq(
"biz.paluch.logging" % "logstash-gelf" % "1.11.1",
"ch.qos.logback" % "logback-classic" % "1.2.3",
"com.amazonaws" % "aws-java-sdk" % "1.11.845",
"com.amazonaws" % "aws-java-sdk-core" % "1.11.226",
"com.amazonaws" % "aws-java-sdk-s3" % "1.11.845",
"com.chargebee" % "chargebee-java" % "3.3.0",
"com.corundumstudio.socketio" % "netty-socketio" % "1.7.12",
"com.datastax.cassandra" % "cassandra-driver-core" % "3.7.2",
"com.github.kokorin.jaffree" % "jaffree" % "0.8.3",
"com.googlecode.libphonenumber" % "geocoder" % "2.188",
"com.googlecode.libphonenumber" % "libphonenumber" % "8.13.26",
"com.google.guava" % "guava" % "28.1-android",
"com.google.protobuf" % "protobuf-java-util" % "3.11.4",
"com.microsoft.sqlserver" % "mssql-jdbc" % "11.2.1.jre11",
"com.sun.mail" % "javax.mail" % "1.6.2",
"com.typesafe" % "config" % "1.3.4",
"com.typesafe" % "config" % "1.4.0",
"com.typesafe" % "config" % "1.4.1",
"dev.zio" %% "izumi-reflect" % "1.1.2",
"dev.zio" %% "zio" % "1.0.9",
"dev.zio" %% "zio-test" % "1.0.9",
"dev.zio" %% "zio-test-sbt" % "1.0.9",
"io.aeron" % "aeron-client" % "1.30.0",
"io.aeron" % "aeron-driver" % "1.30.0",
"io.dgraph" % "dgraph4j" % "20.03.1",
"io.dropwizard.metrics" % "metrics-jmx" % "4.0.7",
//TODO:  "io.gatling" % "gatling-core" % "3.3.0",
//TODO: "io.gatling.highcharts" % "gatling-charts-highcharts" % "3.3.0",
"io.grpc" % "grpc-netty-shaded" % "1.15.1",
"io.grpc" % "grpc-protobuf" % "1.26.0",
"io.grpc" % "grpc-stub" % "1.26.0",
"io.netty" % "netty-handler" % "4.1.52.Final",
"io.netty" % "netty-tcnative-boringssl-static" % "2.0.26.Final",
"io.netty" % "netty-transport-native-epoll" % "4.1.42.Final",
"io.netty" % "netty-transport-native-epoll" % "4.1.48.Final",
"io.spray" %% "spray-json" % "1.3.6",
"joda-time" % "joda-time" % "2.9.9",
"org.apache.kafka" % "connect-api" % "2.6.0",
"org.apache.kafka" % "connect-runtime" % "2.6.0",
"org.apache.kafka" % "kafka-clients" % "2.6.0",
"org.apache.kafka" % "kafka-streams" % "2.6.0",
"org.bitbucket.b_c" % "jose4j" % "0.6.4",
"org.mockito" % "mockito-all" % "1.10.19",
"org.postgresql" % "postgresql" % "42.2.8",
"org.typelevel" %% "cats-core" % "2.10.0",
"redis.clients" % "jedis" % "2.10.2",
// Versions to update:
"com.lightbend.akka" %% "akka-stream-alpakka-cassandra" % "5.1.0-M1" ,// versions: 6.0.0, ..., 6.0.2)
"com.lightbend.akka" %% "akka-stream-alpakka-csv" % "5.1.0-M1" ,// versions: 6.0.0, ..., 6.0.2)
"com.lightbend.akka" %% "akka-stream-alpakka-s3" % "6.0.0" ,// versions: 6.0.1, 6.0.2)
("com.lightbend.akka.discovery" %% "akka-discovery-kubernetes-api" % "1.3.0") ,// versions: 1.4.0, ..., 1.5.0-M1)
"com.lightbend.akka.management" %% "akka-lease-kubernetes" % "1.3.0" ,// versions: 1.4.0, ..., 1.5.0-M1)
"com.lightbend.akka.management" %% "akka-management" % "1.3.0" ,// versions: 1.4.0, ..., 1.5.0-M1)
"com.lightbend.akka.management" %% "akka-management-cluster-bootstrap" % "1.3.0" ,// versions: 1.4.0, ..., 1.5.0-M1)
"com.lightbend.akka.management" %% "akka-management-cluster-http" % "1.3.0" ,// versions: 1.4.0, ..., 1.5.0-M1)
"com.lihaoyi" %% "scalatags" % "0.11.0" ,// versions: 0.11.1, 0.12.0)
"com.lihaoyi" %% "upickle" % "1.3.13" ,// versions: 1.3.14, ..., 3.1.4)
"com.sksamuel.elastic4s" %% "elastic4s-client-esjava" % "5.7.0" ,// versions: 8.4.4, ..., 8.11.5)
"com.sksamuel.elastic4s" %% "elastic4s-core" % "5.7.0" ,// versions: 8.4.4, ..., 8.11.5)
"com.sksamuel.elastic4s" %% "elastic4s-json-circe" % "5.7.0" ,// versions: 8.4.4, ..., 8.11.5)
"com.thesamet.scalapb" %% "scalapb-json4s" % "0.12.0" ,// version: 0.12.1)
"com.thesamet.scalapb" %% "scalapb-runtime" % "0.11.3" ,// versions: 0.11.4, ..., 0.11.15)
"com.typesafe.akka" %% "akka-actor" % "2.6.17" ,// versions: 2.6.18, ..., 2.9.0-M2)
"com.typesafe.akka" %% "akka-cluster" % "2.6.17" ,// versions: 2.6.18, ..., 2.9.0-M2)
"com.typesafe.akka" %% "akka-cluster-sharding" % "2.6.17" ,// versions: 2.6.18, ..., 2.9.0-M2)
"com.typesafe.akka" %% "akka-cluster-tools" % "2.6.17" ,// versions: 2.6.18, ..., 2.9.0-M2)
"com.typesafe.akka" %% "akka-discovery" % "2.6.17" ,// versions: 2.6.18, ..., 2.9.0-M2)
"com.typesafe.akka" %% "akka-http" % "10.5.0-M1" ,// versions: 10.5.0, ..., 10.6.0-M1)
"com.typesafe.akka" %% "akka-http-spray-json" % "10.5.0-M1" ,// versions: 10.5.0, ..., 10.6.0-M1)
"com.typesafe.akka" %% "akka-http-testkit" % "10.5.0-M1" ,// versions: 10.5.0, ..., 10.6.0-M1)
"com.typesafe.akka" %% "akka-http-xml" % "10.5.0-M1" ,// versions: 10.5.0, ..., 10.6.0-M1)
"com.typesafe.akka" %% "akka-persistence" % "2.6.17" ,// versions: 2.6.18, ..., 2.9.0-M2)
//TODO:  "com.typesafe.akka" %% "akka-persistence-cassandra" % "1.1.1",
"com.typesafe.akka" %% "akka-persistence-query" % "2.6.17" ,// versions: 2.6.18, ..., 2.9.0-M2)
"com.typesafe.akka" %% "akka-persistence-tck" % "2.6.17" ,// versions: 2.6.18, ..., 2.9.0-M2)
"com.typesafe.akka" %% "akka-remote" % "2.6.17" ,// versions: 2.6.18, ..., 2.9.0-M2)
"com.typesafe.akka" %% "akka-slf4j" % "2.6.17" ,// versions: 2.6.18, ..., 2.9.0-M2)
"com.typesafe.akka" %% "akka-stream" % "2.6.17" ,// versions: 2.6.18, ..., 2.9.0-M2)
"com.typesafe.akka" %% "akka-stream-kafka" % "4.0.1" ,// version: 4.0.2)
"com.typesafe.akka" %% "akka-testkit" % "2.6.17" ,// versions: 2.6.18, ..., 2.9.0-M2)
"com.typesafe.scala-logging" %% "scala-logging" % "3.9.4" ,// version: 3.9.5)
"com.typesafe.scala-logging" %% "scala-logging" % "3.9.4" ,// version: 3.9.5)
"dev.zio" %% "zio-interop-cats" % "2.5.1.0" ,// versions: 2.5.1.1, ..., 23.1.0.0)
"io.circe" %% "circe-core" % "0.14.0-M7" ,// versions: 0.14.0, ..., 0.15.0-M1)
"io.circe" %% "circe-generic" % "0.14.0-M7" ,// versions: 0.14.0, ..., 0.15.0-M1)
"io.circe" %% "circe-parser" % "0.14.0-M7" ,// versions: 0.14.0, ..., 0.15.0-M1)
// //TODO: "io.getquill" %% "quill-cassandra" % "3.10.0.Beta1.6" ,// versions: 3.12.0.Beta1.7, ..., 4.8.1)
// //TODO: "io.getquill" %% "quill-jdbc" % "3.7.1.Beta1.0" ,// versions: 3.7.1.Beta1.1, ..., 4.8.1)
"io.kamon" %% "kamon-bundle" % "2.7.0",
"io.kamon" %% "kamon-prometheus" % "2.3.0" ,// versions: 2.3.1, ..., 2.7.0)
//TODO: "io.scalaland" %% "chimney" % "0.8.0-M1" ,// versions: 0.8.0-RC1, ..., 1.0.0-M1)
"io.suzaku" %% "boopickle" % "1.4.0",
"org.scalacheck" %% "scalacheck" % "1.15.3" ,// versions: 1.15.4, ..., 1.17.0)
"org.scalatest" %% "scalatest" % "3.2.9" ,// versions: 3.2.10, ..., 3.3.0-SNAP4)

//TODO "org.typelevel" %% "cats-effect" % "2.5.1" ,// versions: 2.5.2, ..., 3.6-623178c)

// For Scala 3 use 2.13:
("com.github.cb372" %% "scalacache-caffeine" % "0.28.0").cross(CrossVersion.for3Use2_13) ,// versions: 1.0.0-M5, 1.0.0-M6)
("com.github.cb372" %% "scalacache-core" % "0.28.0").cross(CrossVersion.for3Use2_13) ,// versions: 1.0.0-M5, 1.0.0-M6)
("com.github.cb372" %% "scalacache-redis" % "0.28.0").cross(CrossVersion.for3Use2_13) ,// versions: 1.0.0-M5, 1.0.0-M6)

//TODO: ("com.chuusai" %% "shapeless" % "2.3.3").cross(CrossVersion.for3Use2_13),
//TODO: ("com.danielasfregola" %% "random-data-generator" % "2.9").cross(CrossVersion.for3Use2_13),
//TODO: ("com.github.andr83" %% "scalaconfig" % "0.7").cross(CrossVersion.for3Use2_13),
//TODO ("com.lightbend.akka" %% "akka-stream-alpakka-elasticsearch" % "3.0.0-M1").cross(CrossVersion.for3Use2_13),
//TODO ("com.lightbend.akka" %% "akka-stream-alpakka-file" % "2.0.2").cross(CrossVersion.for3Use2_13),
("com.lihaoyi" %% "autowire" % "0.3.3").cross(CrossVersion.for3Use2_13),
//TODO ("de.heikoseeberger" %% "akka-http-circe" % "1.39.2").cross(CrossVersion.for3Use2_13),
//TODO: ("io.circe" %% "circe-generic-extras" % "0.12.2").cross(CrossVersion.for3Use2_13),
//TODO:  ("org.apache.kafka" %% "kafka" % "3.0.0").cross(CrossVersion.for3Use2_13),
//TODO: ("org.apache.kafka" %% "kafka-streams-scala" % "2.6.0").cross(CrossVersion.for3Use2_13),
("org.mongodb.scala" %% "mongo-scala-driver" % "4.5.0").cross(CrossVersion.for3Use2_13),
//TODO: ("ru.pavkin" %% "dtc-cats" % "2.6.0").cross(CrossVersion.for3Use2_13),
//TODO: ("ru.pavkin" %% "dtc-core" % "2.6.0").cross(CrossVersion.for3Use2_13),

//("net.cakesolutions" %% "validated-config" % "1.1.2").cross(CrossVersion.for3Use2_13),
//("uk.co.callhandling" %% "freeswitch-scala-esl" % "2.1.14").cross(CrossVersion.for3Use2_13)
)
