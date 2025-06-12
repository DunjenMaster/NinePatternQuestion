package NinePatternQuestion;

public class InvertedHalfPyramid {
    public static void main(String[] args)
    {
        int n = 4;
        // Outer loop
        for(int i = n; i>=1; i--)
        {
            // Inner loop
            for(int j = 1; j<=i; j++)
            {
                System.out.print(" * ");
            }
            // New line after each row
            System.out.println();
        }
    }
}
