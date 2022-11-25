public class CompoundInterest {
    public static void main(String[] args) {
        int iPrincipal = 2000;
        double dAnnualInterestRate = 0.08;
        int iTimesCompounded = 12;
        int iTimesInYears = 5;

        double dSimplifiedCalculation = Math.pow(1 + (dAnnualInterestRate/iTimesCompounded), (iTimesCompounded * iTimesInYears));
        double dCompoundInterest = iPrincipal * dSimplifiedCalculation - iPrincipal;

        System.out.printf("Compound Interest: Rs. %.2f",dCompoundInterest);
    }
}
