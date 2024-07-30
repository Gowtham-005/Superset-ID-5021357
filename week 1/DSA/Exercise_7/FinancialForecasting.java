public class FinancialForecasting {
    public static void main(String[] args) {
        int[] pastValues = {100, 150, 200, 250};
        double growthRate = 1.1; // 10% growth rate

        System.out.println(predictFutureValue(pastValues, growthRate, 5));
    }

    public static double predictFutureValue(int[] pastValues, double growthRate, int years) {
        if (years == 0) return pastValues[pastValues.length - 1];
        double lastValue = predictFutureValue(pastValues, growthRate, years - 1);
        return lastValue * growthRate;
    }
}
