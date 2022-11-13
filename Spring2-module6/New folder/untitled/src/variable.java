import java.util.HashMap;
import java.util.Map;

public class variable {
    public static void main(String[] args) {
        String str = "aabcacbd";
        Map<Character, Integer> map = solution(str);
        for (Map.Entry<Character , Integer> key : map.entrySet()) {
            System.out.println("kí tự "+ key.getKey() + " xuất hiện "+ key.getValue() + " lần");
        }
    }

    public static Map<Character, Integer> solution(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Integer n = map.get(str.charAt(i));
            if (n == null) {
                n = 0;
            }
            map.put(str.charAt(i), n + 1);
        }
        return map;
    }
}
