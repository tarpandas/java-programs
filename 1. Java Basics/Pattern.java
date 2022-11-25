public class Pattern {
    public static void main(String[] args) {
        System.out.println("Pyramid:");
        for (int i = 0; i< 10; i++) {
            for (int j = 0; j <= i; j ++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Inverted Pyramid:");
        for (int i=0; i<10; i++) {
            for (int j=0; j<10 - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("\n Mirrored Pyramid:");
        for (int i=0; i<10; i++) {
            for (int j=10; j>i; j--){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\n Proper pizza slice:");
        for (int i=0; i<10; i++) {
            for(int j=10; j>i; j--) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                System.out.print("*");
            }
            for(int l=0;l<=i-1;l++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
