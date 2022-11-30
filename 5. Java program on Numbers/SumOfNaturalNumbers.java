public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int minNum = 1;
        int maxNum = 10;

        int sum = 0;
        for(int i=minNum ;i <= maxNum; i++) {
            sum += i;
        }

        System.out.println("Sum of numbers from "+minNum+" to "+maxNum+" is "+sum);
    }
}
