import java.util.*;

public class LambdaList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        list.forEach((n)->System.out.println(n));
    }
}
