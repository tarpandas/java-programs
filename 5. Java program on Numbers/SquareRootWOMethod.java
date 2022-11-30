public class SquareRootWOMethod {
    public static void main(String[] args) {
        int num = 100;

        int temp = 0, sr = num / 2;

        do {
            temp = sr;
            sr = (temp + (num/temp))/2;
        } while (temp - sr != 0);

        System.out.println(temp);
    }
}
