package SparkSQL_HDFS;

import org.apache.spark.SparkConf;
import org.apache.spark.sql.*;
import static org.apache.spark.sql.functions.*;

public class Application {
    public static void main(String[] args) {
        System.setProperty("hadoop.home.dir", "C:\\hadoop-common-2.2.0-bin-master");

        SparkSession spark = SparkSession.builder().appName("F1AnalysisSparkSQL").master("local").getOrCreate();

        Encoder<SparkSQL_HDFS.DriverModal> driverModalEncoder = Encoders.bean(SparkSQL_HDFS.DriverModal.class);

        Dataset<SparkSQL_HDFS.DriverModal> driverData = spark.read().option("infershema",true)
                .option("header",true)
                .csv("hdfs://localhost:8020/F1Analysis/drivers.csv")
                .as(driverModalEncoder);

        Encoder<SparkSQL_HDFS.DriverStandingModal> driverStandingModalEncoder = Encoders.bean(SparkSQL_HDFS.DriverStandingModal.class);

        Dataset<SparkSQL_HDFS.DriverStandingModal> driverStandingData = spark.read().option("infershema",true)
                .option("header",true)
                .csv("hdfs://localhost:8020/F1Analysis/driver_standings.csv")
                .as(driverStandingModalEncoder);

        Encoder<SparkSQL_HDFS.RaceModal> raceModalEncoder = Encoders.bean(SparkSQL_HDFS.RaceModal.class);

        Dataset<SparkSQL_HDFS.RaceModal> raceData = spark.read().option("inferschema", true)
                .option("header", true)
                .csv("hdfs://localhost:8020/F1Analysis/races.csv")
                .as(raceModalEncoder);


        // F1 pilotlarının toplam kaç puan aldığının listesi.

        /*
        Dataset<Row> driverStandingDataCast = driverStandingData.withColumn("points", driverStandingData.col("points").cast("int"));

        Dataset<Row> joined = driverStandingDataCast.join(driverData, driverStandingDataCast.col("driverId").equalTo(driverData.col("driverId")));

        RelationalGroupedDataset points = joined.groupBy(new Column("driverId"));

        Dataset<Row> sumPoints = points.sum("points");

        Dataset<Row> result = sumPoints.orderBy(org.apache.spark.sql.functions.col("points").desc());

        result.show(100);

        */


        // En çok hangi ülke F1 pilotu yetiştirmiş

        /*
        Dataset<Row> countData = driverData.groupBy(new Column("nationality")).count();

        Dataset<Row> order = countData.orderBy(org.apache.spark.sql.functions.col("count").desc());

        order.show(100);

         */
    }
}
