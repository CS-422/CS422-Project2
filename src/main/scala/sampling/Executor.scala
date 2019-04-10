package sampling

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{DataFrame, SparkSession}


object Executor {
  def execute_Q1(tables: Tables, session: SparkSession, params: List[Any]) = {
    // TODO: implement
    assert(params.size == 1)
    // For example, for Q1, params(0) is the interval from the where close
  }

  def execute_Q3(tables: Tables, session: SparkSession, params: List[Any]) = {
    // TODO: implement
    assert(params.size == 2)
    // https://github.com/electrum/tpch-dbgen/blob/master/queries/3.sql
    // using:
    // params(0) as :1
    // params(1) as :2
  }

  def execute_Q5(tables: Tables, session: SparkSession, params: List[Any]) = {
    // TODO: implement
  }

  def execute_Q6(tables: Tables, session: SparkSession, params: List[Any]) = {
    // TODO: implement
  }

  def execute_Q7(tables: Tables, session: SparkSession, params: List[Any]) = {
    // TODO: implement
  }

  def execute_Q9(tables: Tables, session: SparkSession, params: List[Any]) = {
    // TODO: implement
  }

  def execute_Q10(tables: Tables, session: SparkSession, params: List[Any]) = {
    // TODO: implement
  }

  def execute_Q11(tables: Tables, session: SparkSession, params: List[Any]) = {
    // TODO: implement
  }

  def execute_Q12(tables: Tables, session: SparkSession, params: List[Any]) = {
    // TODO: implement
  }

  def execute_Q17(tables: Tables, session: SparkSession, params: List[Any]) = {
    // TODO: implement
  }

  def execute_Q18(tables: Tables, session: SparkSession, params: List[Any]) = {
    // TODO: implement
  }

  def execute_Q19(tables: Tables, session: SparkSession, params: List[Any]) = {
    // TODO: implement
  }

  def execute_Q20(tables: Tables, session: SparkSession, params: List[Any]) = {
    // TODO: implement
  }
}
