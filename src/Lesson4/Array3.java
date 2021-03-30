package Lesson4;

public class Array3 {
        public static void main(String[] arg) {
            int k = 0;
            int j;
            int[] mas = new int[1000];
            for (int i = 0; i < 1000; i++) {
                mas[i] = (int) (Math.random() * 1001);
            }
            int num = 0;
            String primeNumbers = "";
            for (int i = 0; i <= mas.length; i++) {
                for (j = 2; j <= i; j++) {
                    if ((i % j) == 0)
                        k++;
                }
                if (k > 2)

                    primeNumbers = primeNumbers + i + " ";
                System.out.println("Простые числа в массиве:");
                System.out.println(primeNumbers);
            }
        }
        } //тут не работает ничего