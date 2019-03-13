package dynamicprogramming;



public class EditDistance {

    public int minDistance(String a, String b) {

        int aLen = a.length();
        int bLen = b.length();

        int [][] matrix = new int[aLen + 1][bLen + 1];

        initMatrix(matrix);

        int top;
        int left;
        int diag;
        int min;

        for(int x = 1; x <= aLen ; x++){
            for(int y = 1; y <= bLen ; y++){

                if(a.charAt(x - 1) == b.charAt(y - 1)){
                    matrix[x][y] = matrix[x - 1][y - 1];
                    continue;

                }

                top  = matrix[x][y - 1];
                left = matrix[x - 1][y];
                diag = matrix[x - 1][y - 1];

                min = Math.min(top, left);
                min = Math.min(min, diag);
                matrix[x][y] = min + 1;
            }
        }

        return matrix[aLen][bLen];
    }

    private void initMatrix(int [][] matrix){
        for(int i = 0 ; i < matrix.length ; i++){
            matrix[i][0] = i;
        }

        for(int j = 0 ; j < matrix[0].length ; j++){
            matrix[0][j] = j;
        }
    }
}
