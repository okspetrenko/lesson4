package Lesson4;

public class Array2 {
    public static void main(String[] arg) {

        int[] mas = new int[1000];
        for (int i = 0; i < 1000; i++) {
            mas[i] = (int) (Math.random() * 1001);
        }
        int num =0;
        String  primeNumbers = "";
        for (int i = 0; i <= mas.length; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {

                primeNumbers = primeNumbers + i + " ";
            }

        }
        System.out.println("Простые числа в массиве:");
        System.out.println(primeNumbers);


    }
}

