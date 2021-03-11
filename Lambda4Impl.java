public class Lambda4Impl {
    public static void main(String[] args) {
        Lambda4 l = (a, b) -> (a + b);{
            System.out.println(l.add(4, 6));
        };
        Lambda4 l1 = (a, b) -> (a + b);{
            System.out.println(l1.add(3, 6));
        };
        Lambda4 l2 = (int a,int b) -> {
            return (a+b);

        };
        System.out.println(l2.add(5, 6));
    }
}
