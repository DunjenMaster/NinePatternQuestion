package NinePatternQuestion;

public class HollowRectangle {

    public static void main(String[] args)
    {
        int n = 4;
        int m = 5;

        // Outer Loop for rows.
        for(int i = 1; i<=n;i++)
        {
            //Inner loop for columns
            for(int j = 1; j<=m;j++)
            {
                //Check if we are at the first row, first column, last row or last column
                if(i == 1 || j ==1 || i == n || j == m)
                {
                    // Print the asterik for the hollow rectangle
                    System.out.print(" * ");
                }
                else {
                    // Print space for the hollow part
                    System.out.print("   ");
                }
            }
            // Print a new line after each row.
            System.out.println("  ");
        }
    }
}
