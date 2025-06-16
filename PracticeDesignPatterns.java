package NinePatternQuestion;

public class PracticeDesignPatterns {
    public static void main(String[] args){
        // Solid rectangle Practice
        for (int i =1; i <=4;i++)
        {
            for(int j = 1; j<=5; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }


        System.out.println("--------------------");


        // Hollow Rectangle Practice

        int n = 4;
        int m = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++)
            {
                if (i == 1 || j == 1 || i==n || j==m)
                {
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------");

        // 0-1 Triangle Pattern Practice
        for (int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                int sum = i+j;
                if(sum %2 == 0){
                    System.out.print("1 ");
                }else System.out.print("0 ");
            }System.out.println();
        }

    }
}
