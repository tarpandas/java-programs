public class CheckLeapYear {
    public static void main(String[] args) {
        int iRandomYear = 1900;
        boolean leapYear = false;
        
        if(iRandomYear % 4 == 0) {
            if(iRandomYear % 100 == 0) {
                if(iRandomYear % 400 == 0) {
                    leapYear = true;
                }else{
                    leapYear = false;
                }
            }else {
                leapYear = true;
            }
        }else{
            leapYear = false;
        }

        if(leapYear) {
            System.out.println("Leap year.");
        }else{
            System.out.println("Not a leap year.");
        }
    }
}
