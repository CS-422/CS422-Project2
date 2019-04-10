package sampling

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.mllib.random.RandomRDDs
import org.apache.spark.sql.types._
import org.apache.spark.sql.{Row, SparkSession}

object Main {
  def main(args: Array[String]) {

    val conf = new SparkConf().setAppName("app").setMaster("local[*]")
    val sc = SparkContext.getOrCreate()
    val session = SparkSession.builder().getOrCreate();

    val rdd = RandomRDDs.uniformRDD(sc, 100000)
    val rdd2 = rdd.map(f => Row.fromSeq(Seq(f * 2, (f*10).toInt)))

    val table = session.createDataFrame(rdd2, StructType(
      StructField("A1", DoubleType, false) ::
      StructField("A2", IntegerType, false) ::
      Nil
    ))

    var tables = new Tables
    tables.lineitem = table
    tables.e = 0.1
    tables.ci = 0.95

    tables.samples = Sampler.sample(tables.lineitem, 1000000, tables.e, tables.ci)

    // check storage usage for samples

    // Execute first query
    Executor.execute_Q1(tables, session, List("3 months"))
  }     
}
