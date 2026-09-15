package pratice_java;

public class Array4 {
    public static void main(String[] args) {

        int[] numbers = {10, 7, 15, 3, 22, 11, 25, 17, 30, 19};

        int i = 0;

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
            }

            i++;
        }
    }
}
