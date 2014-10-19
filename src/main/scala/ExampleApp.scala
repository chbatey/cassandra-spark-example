import org.apache.spark.{SparkContext, SparkConf}

import com.datastax.spark.connector._

object ExampleApp {
  def main(args: Array[String]) = {
    val conf = new SparkConf().setAppName("Simple Application").set("spark.cassandra.connection.host", "192.168.10.10")
    val sc = new SparkContext("spark://192.168.10.10:7077", "Simple Application", conf)
    val rdd = sc.cassandraTable("test", "words")

    rdd.collect().toList.foreach(println)
  }
}
