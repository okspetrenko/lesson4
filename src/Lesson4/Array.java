package Lesson4;

import java.util.Arrays;
    public class Array {

        public static void main(String[] args) {
            int[] mas = new int[400];
            for (int i = 0; i < 400; i++) {
                mas[i] = (int) (Math.random() * 401);
            }
            System.out.println(Arrays.toString(mas));
            double average = 0;
            for (int i = 0; i < 400; i++) {
                average += mas[i];
            }
            average/=400;
            System.out.println("Среднее арифметическое массива равно (" + average + ")");

            long[] mas1 = new long[400];
            for (int i = 0; i < 400; i++) {
                mas1[i] = (int) (Math.random() * 401);
            }
            double gm = geometricMean(mas1);
            System.out.println("Среднее геометрическое: " + gm );
        }

        public static double geometricMean(long[] x) {
            int n = x.length;
            double GM_log = 0.0d;
            for (int i = 0; i < n; ++i) {
                if (x[i] == 0L) {
                    return 0.0d;
                }
                GM_log += Math.log(x[i]);
            }
            return Math.exp(GM_log / n);
        }
    }


