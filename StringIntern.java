public class StringIntern {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = s1.intern();
        String s3 = "hello";
        System.out.println(s1==s2);
        System.out.println(s2==s3);
    }
}
