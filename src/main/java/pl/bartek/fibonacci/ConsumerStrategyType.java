package pl.bartek.fibonacci;

import java.util.HashMap;
import java.util.Map;

public enum ConsumerStrategyType {


    FILE(1),
    PRINT(2);

    private int value;

    private static Map map = new HashMap<>();

    private ConsumerStrategyType( int value) {
        this.value = value;
    }

    static {
        for (ConsumerStrategyType consumerStrategyType : ConsumerStrategyType.values()) {
            map.put(consumerStrategyType.value, consumerStrategyType);
        }
    }
    public static ConsumerStrategyType valueOf(int consumerStrategyType) {
        return (ConsumerStrategyType) map.get(consumerStrategyType);
    }
    public int getValue() {
        return value;
    }
}
