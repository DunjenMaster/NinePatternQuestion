package NinePatternQuestion;

public class ZeroOne01Triangle {

    public static void main(String[] args) {
        int num = 5;

        for (int i =1; i<=num; i++){
            for(int j =1;j<=i;j++) {
                int sum = i + j;
                if (sum %2 == 0) {
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            } System.out.println();
        }
    }
}
