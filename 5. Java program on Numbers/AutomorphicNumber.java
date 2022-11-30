public class AutomorphicNumber {
    public static void main(String[] args) {
        int num = 25;

        int squareNum = (int) Math.pow(num,2);

        int tempNum = num, count = 0;
        int tempSquareNum = squareNum;

        while(tempNum != 0) {
            tempNum/= 10;
            count++;
        }

        for(int i=0; i<count; i++) {
            tempSquareNum /= 10;
        }

        tempSquareNum = tempSquareNum * (int)Math.pow(10 , count);

        if(tempSquareNum + num == squareNum) {
            System.out.println("Automorphic Number.");
        } else {
            System.out.println("Not an automorphic");
        }
    }
}
