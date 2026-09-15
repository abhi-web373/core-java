package pratice_java;
public class Array7{
    public static void main(String[] args) {

        int[] numbers = {45, 7, 18, 23, 50, 13, 91, 29, 40, 17};

        int i = 0;
        int sum = 0;
        int highest = numbers[0];
        int lowest = numbers[0];

        while (i < numbers.length)
        {
            int num = numbers[i];

            // Find highest value
            if (num > highest)
            {
                highest = num;
            }

            // Find lowest value
            if (num < lowest)
            {
                lowest = num;
            }

            // Check prime number
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

            // Print prime and calculate sum
            if (count == 0 && num > 1)
            {
                System.out.println(num);
                sum = sum + num;
            }

            i++;
        }

        System.out.println("Sum of Prime Numbers = " + sum);
        System.out.println("Highest Value = " + highest);
        System.out.println("Lowest Value = " + lowest);
    }
}
