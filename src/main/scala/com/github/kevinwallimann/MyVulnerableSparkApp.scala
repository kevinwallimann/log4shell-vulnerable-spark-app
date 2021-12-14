package com.github.kevinwallimann
import org.apache.logging.log4j.LogManager
import org.apache.spark.sql.SparkSession


object MyVulnerableSparkApp extends App {
  private val logger = LogManager.getLogger(getClass.getName)
  logger.info(args(0))
  val spark = SparkSession.builder().appName("log4shell-vulnerable-spark-app Spark Job").getOrCreate()
  spark.stop()
}
