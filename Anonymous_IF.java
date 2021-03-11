public class Anonymous_IF {
    public static void main(String[] args) {

        Interface_Anonymous i = new Interface_Anonymous() {
            @Override
            public void display() {
                int num = 10;
                System.out.println(num);
            }
        };
        i.display();
    }
}
