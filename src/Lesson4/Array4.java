package Lesson4;

import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {
        int[] mas = new int[2000];
        for (int i = 0; i < 2000; i++) {
            mas[i] = (int) (Math.random() * 2001);
        }

        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            if(i%2 == 0){
                mas[i] = 0;
                break;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}


