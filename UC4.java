public class UC4{
    public static void main(String[] args) {
        
        String[] O = {
            " ***  ",
            "*   * ",
            "*   * ",
            "*   * ",
            " ***  "
        };

        String[] P = {
            "***   ",
            "*   * ",
            "***   ",
            "*     ",
            "*     "
        };

        String[] S = {
            " ***  ",
            "*     ",
            " ***  ",
            "    * ",
            " ***  "
        };

        
        String[][] letters = {O, O, P, S};

        for (int row = 0; row < 5; row++) {
            for (String[] letter : letters) {
                System.out.print(letter[row] + "  ");
            }
            System.out.println();
        }
    }
}
