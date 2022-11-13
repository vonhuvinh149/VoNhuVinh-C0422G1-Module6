import java.util.Arrays;
import java.util.Scanner;

public class lama {

//    Cho một chuổi string nhập vào là các ký tự số la mã, convert thành số nguyên.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0 ;
        int b = 0 ;
        System.out.println("nhập vào 1 chuỗi số la mả");
        String str = scanner.nextLine();
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "I":
                    arr[i] = "1";
                    break;
                case "V":
                    arr[i] = "5";
                    break;
                case "X":
                    arr[i] = "10";
                    break;
                case "L":
                    arr[i] = "50";
                    break;
                case "C":
                    arr[i] = "100";
                    break;
                case "D":
                    arr[i] = "500";
                    break;
                case "M":
                    arr[i] = "1000";
                    break;
                default:
                    System.out.println("nhập sai");
            }
            if (Integer.parseInt(arr[i]) == 1 && Integer.parseInt(arr[i+1]) != 1){
                b = -2 ;
            }
            a += b + Integer.parseInt(arr[i]) ;
        }
        System.out.println(a);
    }
}
