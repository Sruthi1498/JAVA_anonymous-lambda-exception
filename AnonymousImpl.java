public class AnonymousImpl {
    public static void main(String[] args) {
        int num = 10;
        Anonymous a = new Anonymous() {
            @Override
            public void show() {
                int n = 6;

                System.out.println(n + " " + num);
            }
        };
        a.show();
    }
}
