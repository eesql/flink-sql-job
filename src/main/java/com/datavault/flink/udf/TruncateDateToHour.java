package com.datavault.flink.udf;

import org.apache.flink.annotation.PublicEvolving;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.table.functions.ScalarFunction;

@PublicEvolving
public class TruncateDateToHour extends ScalarFunction {
    private static final long serialVersionUID = 1L;
    private static final long ONE_HOUR = 3600000L;

    public TruncateDateToHour() {
    }

    public long eval(long timestamp) {
        return timestamp - timestamp % 3600000L;
    }

    public TypeInformation<?> getResultType(Class<?>[] signature) {
        return Types.SQL_TIMESTAMP;
    }
}
