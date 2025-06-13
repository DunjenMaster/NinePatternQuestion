package NinePatternQuestion;
// Floyd's Triangle is a right-angled triangular array of natural numbers, where the first row contains one number, the second row contains two numbers, and so on.

public class FlyodsTriangle {
    public static void main(String[] args)
    {
        int n =5;
        int number = 1;

        for(int i =1; i<=n; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
