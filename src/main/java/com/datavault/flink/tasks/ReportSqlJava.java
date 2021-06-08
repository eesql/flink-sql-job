package com.datavault.flink.tasks;

import com.datavault.flink.udf.TruncateDateToHour;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

public class ReportSqlJava {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        StreamTableEnvironment tableEnv = StreamTableEnvironment.create(env);

        tableEnv.registerFunction("truncateDateToHour", new TruncateDateToHour());

        TableResult result = tableEnv.sqlQuery(
                "SELECT 1").execute();
        result.print();
    }
}
