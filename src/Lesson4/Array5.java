package Lesson4;

    public class Array5 {
        public static void main(String args[]){
            int[] mas = new int[1000];
            for (int i = 0; i < 1000; i++) {
                mas[i] = (int) (Math.random() * 1001);
            }
            int min = 0;
            for(int i = 0;i<mas.length;i++)
            {
                min = i;
                for(int j = i + 1;j<mas.length;j++)
                {
                    if(mas[j] < mas[min]) { min = j;}
                }
                int temp = mas[i];
                mas[i] = mas[min];
                mas[min] = temp;
                System.out.println(mas[i]);
            }
        }
    }
