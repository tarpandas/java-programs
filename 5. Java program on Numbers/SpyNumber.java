class SpyNumber {
    public static void main(String[] args) {
        int iNum1 = 123;

        int temp = iNum1;

        int remainder, sum=0, product = 1;

        while (temp != 0) {
            remainder = temp % 10;
            sum += remainder;
            product *= remainder;
            temp /= 10;
        }

        System.out.println("Original Number: "+ iNum1);
        System.out.println("Sum of digits: "+sum+"\nProduct of digits: "+product);

        if(sum == product) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not a spy Number.");
        }
    }
}