import java.util.ArrayList;
import java.util.List;

public class fibonaci {
    public static void main(String[] args) {
        fibonaci();
    }

    public static void fibonaci() {
        List<Integer> fibonacci = new ArrayList<>();
        int n1 = 1;
        int n2 = -1;

        while (n1 < 100) {
            n1 += n2;
            n2 = n1 - n2;
            if (n1 < 100){
                fibonacci.add(n1);
            }
        }
        System.out.println(fibonacci);
    }
}
