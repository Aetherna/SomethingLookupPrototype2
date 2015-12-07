package aethernadev.com.somethinglookupprototype2.transaction;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aetherna on 2015-12-07.
 */
public class Transaction {

    private Map<String, String> values;

    public Transaction() {
        values = new HashMap<>();
    }

    public Map<String, String> getValues() {
        return values;
    }

    public void addValue(String key, String value) {
        values.put(key, value);
    }
}
