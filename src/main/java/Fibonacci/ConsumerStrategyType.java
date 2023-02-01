package Fibonacci;

public enum ConsumerStrategyType {
    FILE(1),
    PRINT(2);
    int id;

    private ConsumerStrategyType(int i) {
        id = i;
    }

    public int GetID() {
        return id;
    }

    public boolean Compare(int i) {
        return id == i;
    }

    public static ConsumerStrategyType GetValue(int _id) {
        ConsumerStrategyType[] As = ConsumerStrategyType.values();
        for (int i = 0; i < As.length; i++) {
            if (As[i].Compare(_id))
                return As[i];

        }
    }
}




//    FILE(1),
//    PRINT(2);
//
//    ConsumerStrategyType(int consumerStrategyType){
//    }
//
//
//    public static ConsumerStrategyType values(int i) {
//    }
//}
