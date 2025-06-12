package NinePatternQuestion;

public class HalfPyramid {
    public static void main(String[] args){
        int n = 4;
        // Outer loop
        for(int i = 1; i<=n; i++)
        {
            // Inner Loop
            for(int j = 1; j<=i; j++)
            {
                System.out.print(" * ");
            }
            // New line after each row
            System.out.println();
        }
    }
}
