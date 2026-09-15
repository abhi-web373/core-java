package pratice_java;

public class Array5 {
    public static void main(String[] args) {

        int[] numbers = {45, 7, 18, 23, 50, 13, 91, 29, 40, 17};

        int i = 0;
        int sum = 0;

        while (i < numbers.length)
        {
            int num = numbers[i];
            int j = 2;
            int count = 0;

            while (j < num)
            {
                if (num % j == 0)
                {
                    count++;
                }

                j++;
            }

            if (count == 0 && num > 1)
            {
                System.out.println(num);
                sum = sum + num;
            }

            i++;
        }

        System.out.println("Sum = " + sum);
    }
}