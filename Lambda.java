public class Lambda {
    public static void main(String[] args) {
        int num = 100;
        Lambda_Interface l =()->{
            int a = num - 50;
            System.out.println(num);
            System.out.println(a);
        };
        l.show();
    }
}
