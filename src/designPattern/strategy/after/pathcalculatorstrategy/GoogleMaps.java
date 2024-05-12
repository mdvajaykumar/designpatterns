package designPattern.strategy.after.pathcalculatorstrategy;

import designPattern.strategy.before.Mode;

public class GoogleMaps {

        public void findPath(String from, String to, Mode mode) {
            PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorStrategyFactory
                    .getStrategy(mode);
            pathCalculatorStrategy.findPath(from, to);
        }


}
