public class MagicSquare {

    /**
     *
     * @param array2d
     * @return the sum of the first row in array2d.
     */
    public static int calculateCheckSum(int[][] array2d) {
        int sum = 0;
        for(int integer:array2d[0]){
            sum = sum + integer;
        }
        return sum;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     *         Because we have already determined the sum of the first row
     *         via the method 'calculateCheckSum', this method can begin
     *         iterating from the second row.
     */
    public static boolean magicRows(int[][] array2d, int checkSum) {
        boolean magic = true;
        int rowSum;
        for (int row = 1; row < array2d.length; row++) {
            rowSum = 0;
            for (int col = 0; col < array2d[row].length; col++) {
                rowSum += array2d[row][col];
            }
            if (rowSum != checkSum){
                magic = false;
            }
        }
        return magic;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */
    public static boolean magicColumns(int[][] array2d, int checkSum) {
        boolean isEqual = true;
        int colSum;
        for (int col = 0; col < array2d[0].length; col++) {
            colSum = 0;
            for (int row = 0; row < array2d.length; row++) {
                colSum += array2d[row][col];
            }
            if (colSum != checkSum){
                isEqual = false;
            }
        }
        return isEqual;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */
    public static boolean magicDiagonals(int[][] array2d, int checkSum) {
        boolean isDiagonal = true;
        int row = 0;
        int col = 0;
        int sum = 0;
        for (row = 0; row < array2d.length; row++){
            sum = sum + array2d[row][col];
            col ++;
        }
        if (sum != checkSum) return false;
        row = 0;
        col = array2d[row].length-1;
        sum = 0;
        for (row = 0; row < array2d.length; row++){
            sum = sum + array2d[row][col];
            col --;
        }
        if (sum != checkSum){
            isDiagonal = false;
        }
        return isDiagonal;
    }

    /**
     *
     * @param array2d
     * @return whether array2d is magic or not.
     */
    public static boolean isMagic(int[][] array2d) {
        boolean isMagic = true;
        int sum = 0;
        for(int integer:array2d[0]){
            sum = sum + integer;
        }
        if (magicRows(array2d, sum)==true && magicColumns(array2d, sum)==true && magicDiagonals(array2d, sum)==true){
            isMagic = true;
        }
        else isMagic = false;
        return isMagic;
    }

}
