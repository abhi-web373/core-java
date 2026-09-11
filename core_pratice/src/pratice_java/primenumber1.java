package pratice_java;

public class primenumber1 {
    public static void main(String[] args) {
        int num = 2;  
        int counter = 0;

        while (counter < 10)
        {
            int i = 2;
            int count = 0;

            while (i < num)
            {
                if (num % i == 0)
                {
                    count++;
                }

                i++;
            }

            if (count == 0)
            {
                System.out.println(num);
                counter++;
            }

            num++;
        }
    }
}
