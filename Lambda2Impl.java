public class Lambda2Impl {
    public static void main(String[] args) {
        Lambda2 l = ()->{
            return "hello world";
        };
        System.out.println(l.display());
    }
}
