public class Lambda3Impl {
    public static void main(String[] args) {
        Lambda3 l = (n)->{
            return n;
        };
        Lambda3 l1 = n->{
            return "hi "+n;
        };
        System.out.println(l.name("alice"));
        System.out.println(l1.name("bob"));
    }
}
