public class Pattern {
    public static void main(String[] args) {
        patternPrinting(4, 0);
        patternPrinting2(4, 0);
    }

    public static void patternPrinting(int row, int col){
        // base case
        if(row == 0) return;

        if(col < row){
            System.out.println("*");
            patternPrinting(row, col + 1);
        } else{
            System.out.println();
            patternPrinting(row - 1, 0);
        }
    }
    
    public static void patternPrinting2(int row, int col){
        // base case
        if(row == 0) return;

        if(col < row){
            patternPrinting2(row, col + 1);
            System.out.println("*");
        } else{
            patternPrinting2(row - 1, 0);
            System.out.println();
        }
    }

}
