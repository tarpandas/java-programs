import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        double num = Math.random() * 100;
        System.out.println(num);


        Random randInt = new Random();
        System.out.println(randInt.nextInt(200));
    }
}
