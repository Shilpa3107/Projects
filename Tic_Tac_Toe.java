import java.util.Scanner;

public class Tic_Tac_Toe {
    public static void main(String[] args){
      try(Scanner sc = new Scanner(System.in);){

        char[][] grid = new char[3][3];
        for(int  i =0;i<3;i++){
            for(int j = 0;j<3;j++){
                grid[i][j] = ' ';
            }
        }
        
    char player1 , player2 ;
    System.out.print("Choose one character ('X','O') : ");
    player1 = sc.next().charAt(0);

    System.out.println();

    if(player1 == 'X')
    player2 = 'O';
    else 
    player2 = 'X';

    if(player1 == 'X')
    {
        System.out.println("Player1, Enter your grid : ");
        int c = sc.nextInt();
        int d = sc.nextInt();
        grid[c][d] = 'X';
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(grid[i][j]+"|");

            }
            System.out.println("_");
        }

        System.out.println("Player2, Enter your grid : ");
        int c1 = sc.nextInt();
        int d1= sc.nextInt();
        grid[c1][d1] = 'O';
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(grid[i][j]+"|");

            }
            System.out.println("_");
        }

        System.out.println("Player1, Enter your grid : ");
        int c2 = sc.nextInt();
        int d2= sc.nextInt();
        grid[c2][d2] = 'X';
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(grid[i][j]+"|");

            }
            System.out.println("_");
        }
    }


    }
}
    
}
