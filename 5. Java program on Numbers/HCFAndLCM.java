public class HCFAndLCM {
    public static void main(String[] args) {
        int iNum1 = 88;
        int iNum2 = 242;

        int minNum = iNum1>iNum2 ? iNum2 : iNum1;
        int hcf = 0;
        int lcm = 1;


        for(int i=1;i<=minNum; i++) {
            if(iNum1 % i == 0 && iNum2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF of "+iNum1+" and "+iNum2+" is "+hcf);

        lcm = iNum1 * iNum2 / hcf;
        
        System.out.println("LCM of "+iNum1+" and "+iNum2+" is "+lcm);
    }
}
