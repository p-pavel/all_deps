Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val root = project.in(file(".")).aggregate(p3, p212, p213)
lazy val p212 = project
  .in(file("modules/212"))
  .settings(
    scalaVersion := "2.12.10",
    libraryDependencies ++= deps212only
  )
lazy val p213 = project
  .in(file("modules/213"))
  .settings(
    scalaVersion := "2.13.12",
    libraryDependencies ++= deps213only
  )
lazy val p3 = project
  .in(file("modules/3"))
  .settings(
    scalaVersion := "3.3.1",
    libraryDependencies ++= deps3
  )

lazy val deps212only = Seq(
  // THOSE ARE UNAVAILABLE FOR 2.13 AND 3
  "io.frees" %% "frees-core" % "0.8.2",
  "io.frees" %% "frees-effects" % "0.8.2",
  "io.frees" %% "frees-fetch" % "0.8.2",
  "io.frees" %% "frees-logging" % "0.8.2",
  "uk.co.callhandling" %% "freeswitch-scala-esl" % "2.1.14",
  "net.cakesolutions" %% "validated-config" % "1.1.2", // 1.1.3


  // Can be updated for 2.13
  "com.lihaoyi" %% "autowire" % "0.2.6", // -> 0.3.3
  "org.scalatest" %% "scalatest" % "3.0.5", // 3.2.17
  "com.danielasfregola" %% "random-data-generator" % "2.4", // 2.9
  "ru.pavkin" %% "dtc-cats" % "2.1.0", // 2.4.0
  "ru.pavkin" %% "dtc-core" % "2.1.0", // 2.4.0
  "com.github.pureconfig" %% "pureconfig" % "0.10.1", // 0.17.5
  "de.heikoseeberger" %% "akka-http-circe" % "1.22.0", //1.39.2
  "io.gatling" % "gatling-core" % "3.3.0", // 3.10.3
  "io.gatling.highcharts" % "gatling-charts-highcharts" % "3.3.0" // 3.10.3
)

lazy val deps213only = Seq(
  // can be updated for 3
  "org.scalatest" %% "scalatest" % "3.2.0", // 3.2.17
  "io.gatling" % "gatling-core" % "3.10.3", 
  "io.gatling.highcharts" % "gatling-charts-highcharts" % "3.10.3",
  "com.lihaoyi" %% "scalatags" % "0.7.0", // 0.12.0
  "com.lihaoyi" %% "upickle" % "0.7.5", //NOT FOR 3 cross (later version available)
  "com.danielasfregola" %% "random-data-generator" % "2.9", // NOT FOR 3, cross



  // updates that work with 2.13, NOT AVAILABLE FOR 3
  "com.lihaoyi" %% "autowire" % "0.3.3", // NOT FOR 3
  "ru.pavkin" %% "dtc-cats" % "2.4.0", //NOT FOR 3
  "ru.pavkin" %% "dtc-core" % "2.4.0", //NOT FOR 3
  "com.github.pureconfig" %% "pureconfig" % "0.17.5", // NOT FOR 3
  "de.heikoseeberger" %% "akka-http-circe" % "1.39.2", // NOT FOR 3


  // not available for 3
  "com.chuusai" %% "shapeless" % "2.3.3", // NOT FOR 3
  "com.github.andr83" %% "scalaconfig" % "0.7", // NOT FOR 3, cross

  "com.github.cb372" %% "scalacache-caffeine" % "0.28.0", //1.0.0-M6, cross
  "com.github.cb372" %% "scalacache-core" % "0.28.0", //1.0.0-M6, cross
  "com.github.cb372" %% "scalacache-redis" % "0.28.0", //1.0.0-M6, cross

  "com.lightbend.akka" %% "akka-stream-alpakka-cassandra" % "2.0.2",
  "com.lightbend.akka" %% "akka-stream-alpakka-csv" % "2.0.2",
  "com.lightbend.akka" %% "akka-stream-alpakka-elasticsearch" % "3.0.0-M1",
  "com.lightbend.akka" %% "akka-stream-alpakka-file" % "2.0.2",
  "com.lightbend.akka" %% "akka-stream-alpakka-s3" % "2.0.2",

  "com.lightbend.akka.discovery" %% "akka-discovery-kubernetes-api" % "1.0.10",
  "com.lightbend.akka.management" %% "akka-lease-kubernetes" % "1.0.10",
  "com.lightbend.akka.management" %% "akka-management" % "1.4.1", // "1.0.10",
  "com.lightbend.akka.management" %% "akka-management-cluster-bootstrap" % "1.4.1", //"1.0.10",
  "com.lightbend.akka.management" %% "akka-management-cluster-http" % "1.4.1", //"1.0.9",


  "com.sksamuel.elastic4s" %% "elastic4s-client-esjava" % "7.11.4",
  "com.sksamuel.elastic4s" %% "elastic4s-core" % "7.11.4",
  "com.sksamuel.elastic4s" %% "elastic4s-json-circe" % "7.11.4",

  "com.thesamet.scalapb" %% "scalapb-json4s" % "0.9.3",
  "com.thesamet.scalapb" %% "scalapb-runtime" % "0.9.8",

  "com.typesafe.akka" %% "akka-actor" % "2.6.12",
  "com.typesafe.akka" %% "akka-cluster" % "2.6.12",
  "com.typesafe.akka" %% "akka-cluster-sharding" % "2.6.12",
  "com.typesafe.akka" %% "akka-cluster-tools" % "2.6.12",
  "com.typesafe.akka" %% "akka-discovery" % "2.6.12",
  "com.typesafe.akka" %% "akka-http" % "10.2.3",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.2.3",
  "com.typesafe.akka" %% "akka-http-testkit" % "10.2.3",
  "com.typesafe.akka" %% "akka-http-xml" % "10.2.3",
  "com.typesafe.akka" %% "akka-persistence" % "2.6.12",
  "com.typesafe.akka" %% "akka-persistence-cassandra" % "1.0.4",
  "com.typesafe.akka" %% "akka-persistence-query" % "2.6.12",
  "com.typesafe.akka" %% "akka-persistence-tck" % "2.6.12",
  "com.typesafe.akka" %% "akka-remote" % "2.6.12",
  "com.typesafe.akka" %% "akka-slf4j" % "2.6.12",
  "com.typesafe.akka" %% "akka-stream" % "2.6.12",
  "com.typesafe.akka" %% "akka-stream-kafka" % "2.0.4",
  "com.typesafe.akka" %% "akka-testkit" % "2.6.12",

  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",

  "dev.zio" %% "zio-interop-cats" % "2.2.0.1",

  "io.circe" %% "circe-core" % "0.13.0",
  "io.circe" %% "circe-generic" % "0.13.0",
  "io.circe" %% "circe-generic-extras" % "0.12.2",
  "io.circe" %% "circe-parser" % "0.13.0",

  "io.getquill" %% "quill-cassandra" % "3.6.0-RC3",
  "io.getquill" %% "quill-jdbc" % "3.6.1",

  "io.kamon" %% "kamon-bundle" % "2.2.2",
  "io.kamon" %% "kamon-prometheus" % "2.2.2",

  "io.scalaland" %% "chimney" % "0.6.1",
  "io.suzaku" %% "boopickle" % "1.3.1",

  "org.apache.kafka" %% "kafka" % "3.6.1", //"2.6.0",  conflicts with akka actor on java8-compatibility (0.9.1 vs 1.0.0)
  "org.apache.kafka" %% "kafka-streams-scala" % "2.6.0",
  "org.mongodb.scala" %% "mongo-scala-driver" % "4.5.0",

  "org.scalacheck" %% "scalacheck" % "1.14.0",

  "org.typelevel" %% "cats-core" % "2.2.0",
  "org.typelevel" %% "cats-effect" % "2.2.0"
)

lazy val deps3 = Seq(
  "com.lihaoyi" %% "scalatags" % "0.12.0", // 0.12.0
  ("com.lihaoyi" %% "upickle" % "0.7.5").cross(CrossVersion.for3Use2_13),
  ("com.danielasfregola" %% "random-data-generator" % "2.9").cross(CrossVersion.for3Use2_13), // NOT FOR 3


  "org.scalatest" %% "scalatest" % "3.2.17",
  "io.gatling" % "gatling-core" % "3.10.3", 
  "io.gatling.highcharts" % "gatling-charts-highcharts" % "3.10.3",
  ("com.github.cb372" %% "scalacache-caffeine" % "0.28.0").cross(CrossVersion.for3Use2_13),
  ("com.github.cb372" %% "scalacache-core" % "0.28.0").cross(CrossVersion.for3Use2_13), //1.0.0-M6
  ("com.github.cb372" %% "scalacache-redis" % "0.28.0").cross(CrossVersion.for3Use2_13), //1.0.0-M6

  ("com.github.andr83" %% "scalaconfig" % "0.7").cross(CrossVersion.for3Use2_13), // NOT FOR 3


  "biz.paluch.logging" % "logstash-gelf" % "1.11.1",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.amazonaws" % "aws-java-sdk" % "1.11.845",
  "com.amazonaws" % "aws-java-sdk-core" % "1.11.226",
  "com.amazonaws" % "aws-java-sdk-s3" % "1.11.845",
  "com.chargebee" % "chargebee-java" % "3.3.0",
  "com.corundumstudio.socketio" % "netty-socketio" % "1.7.12",
  "com.datastax.cassandra" % "cassandra-driver-core" % "3.7.2",
  "com.github.kokorin.jaffree" % "jaffree" % "0.8.3",
  "com.google.guava" % "guava" % "28.1-android",
  "com.google.protobuf" % "protobuf-java-util" % "3.11.4",
  "com.googlecode.libphonenumber" % "geocoder" % "2.188",
  "com.googlecode.libphonenumber" % "libphonenumber" % "8.13.26",
  "com.microsoft.sqlserver" % "mssql-jdbc" % "11.2.1.jre11",
  "com.sun.mail" % "javax.mail" % "1.6.2",
  "com.typesafe" % "config" % "1.4.1",
  "dev.zio" %% "izumi-reflect" % "1.1.2",
  "dev.zio" %% "zio" % "1.0.9",
  "dev.zio" %% "zio-test" % "1.0.9",
  "dev.zio" %% "zio-test-sbt" % "1.0.9",
  "io.aeron" % "aeron-client" % "1.30.0",
  "io.aeron" % "aeron-driver" % "1.30.0",
  "io.dgraph" % "dgraph4j" % "20.03.1",
  "io.dropwizard.metrics" % "metrics-jmx" % "4.0.7",
  "io.grpc" % "grpc-netty-shaded" % "1.15.1",
  "io.grpc" % "grpc-protobuf" % "1.26.0",
  "io.grpc" % "grpc-stub" % "1.26.0",
  "io.netty" % "netty-handler" % "4.1.52.Final",
  "io.netty" % "netty-tcnative-boringssl-static" % "2.0.26.Final",
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
  "redis.clients" % "jedis" % "2.10.2"
)
