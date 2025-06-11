package NinePatternQuestion;

public class SolidRectangle {

    public static void main(String[] args)
    {
        int n = 4; // Number of rows
        int m = 5; // Number of columns

        // Outer Loop for rows.
        for(int i = 1; i<=n; i++)
        {
            // Inner Loop for columns.
            for(int j =1; j<=m; j++)
            {
                // printing asterisks for solid rectangle
                System.out.print(" * ");
            }
            // Print a new line after each row.
            System.out.println("");
        }
    }
}
