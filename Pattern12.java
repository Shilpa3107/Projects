public class Pattern12 {
   
        public static void main(String[] args) {
            int n = 5;
            int[][] arr = new int[n][n];
    
            // initialize the array with values 11 to 15
            int num = 11;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = num;
                    num++;
                }
            }
    
            // print the array in the given pattern
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][(i + j) % n] + " ");
                }
                System.out.println();
            }
        }
    }
    

