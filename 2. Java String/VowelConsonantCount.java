public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = new String("Hello World");
        int vowelCount=0, consonantCount=0;
        for(int i=0; i<str.length(); i++) {
            Character a = str.charAt(i);
            if(a == 'A' || a == 'E'|| a == 'I' || a == 'O' || a == 'U') {
                vowelCount++;
            }else if(a == 'a' || a == 'e'|| a == 'i' || a == 'o' || a == 'u') {
                vowelCount++;
            }else if( (a >= 'A' && a <= 'Z') || (a >= 'a' && a<= 'z')) {
                consonantCount++;
            }
        }
        System.out.println("Vowel Count: "+ vowelCount);
        System.out.println("Consonant Count: "+ consonantCount);
    }
}
