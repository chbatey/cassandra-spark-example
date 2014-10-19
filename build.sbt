import AssemblyKeys._ // put this at the top of the file

net.virtualvoid.sbt.graph.Plugin.graphSettings

assemblySettings

name := "cassandra spark example"

version := "1.0"

//libraryDependencies += "com.google.guava" % "guava" % "16.0.1"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.0.0" % "provided"

libraryDependencies += "com.datastax.spark" % "spark-cassandra-connector_2.10" % "1.0.2"

libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-core" % "2.0.4" force()

libraryDependencies +=  "org.json4s" %% "json4s-native" % "3.2.10"

libraryDependencies += "org.apache.cassandra" % "cassandra-thrift" % "2.0.9"

libraryDependencies += "org.apache.cassandra" % "cassandra-clientutil" % "2.0.9"

jarName in assembly := "spark_example.jar"

assemblyOption in assembly ~= { _.copy(includeScala = false) }
