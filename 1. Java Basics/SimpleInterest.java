public class SimpleInterest {
    public static void main(String[] args) {
        int iPrincipal = 2000;
        double dRate = 2;
        int iTime = 5;

        double dSimpleInterest = (iPrincipal * dRate * iTime)/100;

        System.out.println("Simple Interest: "+dSimpleInterest);
    }
}
