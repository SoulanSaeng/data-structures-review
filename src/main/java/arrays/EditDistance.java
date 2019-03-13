package arrays;



public class EditDistance {

    public int minDistance(String a, String b) {

        int [][] matrix = new int[a.length()][b.length()];
        initMatrix(matrix);

        int top;
        int left;
        int diag;

        int min;

        for(int x = 1; x < a.length() ; x++){
            for(int y = 1; y < b.length() ; y++){

                top  = matrix[x][y - 1];
                left = matrix[x - 1][y];
                diag = matrix[x - 1][y - 1];

                min = Math.min(top, left);
                min = Math.min(min, diag);

                //Case 1:
                if(a.charAt(x) == b.charAt(y)) min +=1;

                matrix[x][y] = min;
            }
        }

        return matrix[a.length() - 1][b.length() -1];
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
