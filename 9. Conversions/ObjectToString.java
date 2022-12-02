class DummyClass{

}
public class ObjectToString {
    public static void main(String[] args) {
        DummyClass dummy = new DummyClass();

        String str = dummy.toString();

        System.out.println(str+" "+str.getClass().getSimpleName());
    }
}
