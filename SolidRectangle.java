package NinePatternQuestion;

public class SolidRectangle {

    public static void main(String[] args){
        // Outer Loop for rows.
        for(int i = 1; i<=4; i++)
        {
            // Inner Loop for columns.
            for(int j = 1; j<=5; j++)
            {
                System.out.print(" * ");
            }
            // Print a new line after each row.
            System.out.println("");
        }
    }
}
