public class VowelOrConsonant {
    public static void main(String[] args) {
        char charChar = 'a';
        boolean isVowel = true;
        if(charChar =='A'|| charChar == 'E'|| charChar=='I'||charChar=='O'||charChar=='U') {
            isVowel = true;
        }else if (charChar =='a'|| charChar == 'e'|| charChar=='i'||charChar=='o'||charChar=='u') {
            isVowel = true;
        }else{
            isVowel = false;
        }

        if(isVowel) {
            System.out.println("Is Vowel.");
        }else {
            System.out.println("Is Consonant.");
        }
    }
}
