public class GCD {
    public static void main(String[] args) {
        int iNum1 = 77;
        int iNum2 = 121;

        int temp=0;
        if(iNum1 < iNum2) {
            temp = iNum1;
        } else {
            temp = iNum2;
        }

        int gcd = 0;
        for(int i=1; i<=temp;i++) {
            if(iNum1 % i == 0 && iNum2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD of "+iNum1+" and "+iNum2+" is "+gcd);
    }
}
