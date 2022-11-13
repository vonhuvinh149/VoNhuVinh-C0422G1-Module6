package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);

        int[] arr = [1,2,3,4,5,6,7,8,9]
        int a = num.nextInt();
        boolean flag = true ;
        int i;
        int sum ;

//        if (flag) {
//            System.out.println(a + " là số nguyên tố ");
//        } else {
//            System.out.println(a + " ko là số nguyên tố");
//        }

        for (int j = 0; j <arr.length ; j++) {
            if (check(arr[i])){
                sum += arr[i];
            }
        }
        System.out.println(sum);

        check(int a){
            if (a < 2) {
                flag = false;
            } else {
                for (i = 2; i < a; i++) {
                    if(a % i == 0) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                        break;
                    }
                }
            }
        }
    }

}
