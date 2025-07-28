
public class FinacialForecasting {

    //calculate future value using recursion
    public static double calculateFutureValue(double presentValue, double interestRate, int years) {
        if(years ==0 || presentValue ==0 ) return presentValue;
        return calculateFutureValue(presentValue, interestRate, years-1) * (1 + interestRate);
    }

    //optimization using memoization
    public static double calculateFutureValueMemo(double presentValue, double interestRate, int years, double[] memo) {
        if (years == 0 || presentValue == 0) return presentValue;
        if (memo[years] != 0) return memo[years]; 
        return memo[years] = calculateFutureValueMemo(presentValue, interestRate, years - 1, memo) * (1 + interestRate);        
    }

    public static void main(String[] args) {
        double presentValue = 5000.0; 
        double interestRate = 0.05;
        int years = 10;

        // Using recursion
        double futureValue = calculateFutureValue(presentValue, interestRate, years);
        System.out.printf("Future Value using recursion: %.2f%n", futureValue);

        // Using memoization
        double[] memo = new double[years + 1];
        double futureValueMemo = calculateFutureValueMemo(presentValue, interestRate, years,memo);
        System.out.printf("Future Value using memo : %.2f%n", futureValueMemo);    
    }

}
