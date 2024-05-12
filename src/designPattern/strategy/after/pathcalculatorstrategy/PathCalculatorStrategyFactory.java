package designPattern.strategy.after.pathcalculatorstrategy;

import designPattern.strategy.before.Mode;

public class PathCalculatorStrategyFactory {

    public static PathCalculatorStrategy getStrategy(Mode mode){
        switch (mode) {
            case CAR:
                return new CarPathCalculatorStrategy();
            case WALK:
                return new WalkPathCalculatorStrategy();
            case BIKE:
                return new BikePathCalculatorStrategy();
            case PUBLIC:
                return new PublicPathCalculatorStrategy();
            default:
                return new PublicPathCalculatorStrategy();
        }
    }
}
