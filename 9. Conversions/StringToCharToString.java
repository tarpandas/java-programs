public class StringToCharToString {
    public static void main(String[] args) {
        String str = "Z";
        char c = str.charAt(0);

        System.out.println("String: "+str+" type: "+str.getClass().getSimpleName());
        System.out.println("Character: "+c+" type: "+((Object)c).getClass().getSimpleName());
        c = '/';
        str = c+"";

        System.out.println("\nCharacter: "+c+" type: "+((Object)c).getClass().getSimpleName());
        System.out.println("String: "+str+" type: "+str.getClass().getSimpleName());
    }
}
