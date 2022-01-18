import org.apache.spark.sql.SparkSession

object Test {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder()
      .appName("demo")
      .config("spark.master", "local")
      .getOrCreate()

    import spark.implicits._

    val sample = Seq(
      (1, "a"),
      (2, "b")
    ).toDF("id", "val")

    sample.show(false)
  }
}