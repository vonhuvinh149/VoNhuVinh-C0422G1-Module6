import java.util.Scanner;

public class algrothms {
//    Cho một mảng số nguyên và một số nguyên N bất kỳ, output : vị trí của
//    2 số bất kỳ trong mảng có tổng bằng N.Cho một mảng số nguyên và một số
//    nguyên N bất kỳ, output : vị trí của 2 số bất kỳ trong mảng có tổng bằng N.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {0,1,2,3,4,5,6,7,8,9,11};
        System.out.println("nhập vào số nguyên bất kì");
        int a = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == a && i!= j){
                    System.out.println("2 số "+ arr[i] +" và " + arr[j] + " tại 2 vị trí tương ứng "+i+" và "+j);
                }
            }
        }
    }
}
