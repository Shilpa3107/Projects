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
        
    char player1 , player2  ;
    System.out.print("Choose one character ('X','O') : ");
    player1 = sc.next().charAt(0);

    System.out.println();

    if(player1 == 'X')
    player2 = 'O';
    else 
    player2 = 'X';

    if(player1 == 'X')
    {
        for(int k = 0; k<9; k++){
        System.out.println("Player1, Enter your grid : ");
        int c = sc.nextInt();
        int d = sc.nextInt();
         grid[c][d] = 'X';

       griding(grid);


        System.out.println("Player2, Enter your grid : ");
    int c1= sc.nextInt();
    int d1 = sc.nextInt();
     grid[c1][d1] = 'O';

     griding(grid);

        System.out.println("Player1, Enter your grid : ");
        int c2 = sc.nextInt();
        int d2 = sc.nextInt();
         grid[c2][d2] = 'X';

         griding(grid);

         System.out.println("Player2, Enter your grid : ");
         int c3= sc.nextInt();
         int d3 = sc.nextInt();
          grid[c3][d3] = 'O';
     
          griding(grid);


          System.out.println("Player1, Enter your grid : ");
          int c4 = sc.nextInt();
          int d4 = sc.nextInt();
           grid[c4][d4] = 'X';
  
           griding(grid);

        win1(grid);
        win2(grid);
        win3(grid);
        win4(grid);
        win5(grid);
        win6(grid);
        win7(grid);
        win8(grid);

     }
    }
       
    }
    
       


    }


public static void griding(char arr[][]){
    for(int i = 0;i<3;i++){
        for(int j = 0;j<3;j++){
            System.out.print(arr[i][j]+" ");
         }
        System.out.println();
    }
}

public static void win1(char grid[][]){
    
    int c1 = 0,c2 = 0;
    for(int  i =0;i<3;i++){
        for(int j = 0;j<3;j++){
            if(i == j){
                if(grid[i][j] == 'X')
                c1++;
                else 
                c2++;
        }
        }
    }
    if(c1 == 3){
    System.out.println("1Player1 Wins");
    System.exit(0);
    }
    else if(c2 == 3){
    System.out.println("1Player2 wins");
    System.exit(0);
    }
}
public static void win2(char grid[][]){
    int c1 = 0,c2 = 0;
    for(int i = 0;i<3;i++){
        for(int j = 0;j<3;j++){
            if(j == (2-i)){
               if(grid[i][j] == 'X')
               c1++;
               else
               c2++;
            }
        }
        if(c1 == 3){
        System.out.println("2Player1 wins");
        System.exit(0);
        }
        else if(c2==3){
        System.out.println("2Player2 wins");
        System.exit(0);
        }
    }
}
public static void win3(char grid[][]){
    int c1 = 0,c2 = 0;
    for(int i = 0;i<3;i++){
        if(grid[i][0] == 'X')
        c1++;
        else
        c2++;
    }
    if(c1 == 3){
        System.out.println("3Player1 wins");
        System.exit(0);
    }
        else if(c2==3){
        System.out.println("3Player2 wins");
        System.exit(0);
        }
}
public static void win4(char grid[][]){
    int c1 = 0,c2 = 0;
    for(int i = 0;i<3;i++){
        if(grid[i][1] == 'X')
        c1++;
        else
        c2++;
    }
    if(c1 == 3){
        System.out.println("4Player1 wins");
        System.exit(0);
    }
        else if(c2==3){
        System.out.println("4Player2 wins");
        System.exit(0);
        }
}
public static void win5(char grid[][]){
    int c1 = 0,c2 = 0;
    for(int i = 0;i<3;i++){
        if(grid[i][2] == 'X')
        c1++;
        else
        c2++;
    }
    if(c1 == 3){
        System.out.println("5Player1 wins");
        System.exit(0);
    }
        else if(c2==3){
        System.out.println("5Player2 wins");
        System.exit(0);
        }
}
public static void win6(char grid[][]){
    int c1 = 0,c2 = 0;
    for(int i = 0;i<3;i++){
        if(grid[0][i] == 'X')
        c1++;
        else
        c2++;
    }
    if(c1 == 3){
        System.out.println("6Player1 wins");
        System.exit(0);
    }
        else if(c2==3){
        System.out.println("6Player2 wins");
        System.exit(0);
        }
}
public static void win7(char grid[][]){
    int c1 = 0,c2 = 0;
    for(int i = 0;i<3;i++){
        if(grid[0][i] == 'X')
        c1++;
        else
        c2++;
    }
    if(c1 == 3){
        System.out.println("7Player1 wins");
        System.exit(0);
    }
        else if(c2==3){
        System.out.println("7Player2 wins");
        System.exit(0);
        }
}
public static void win8(char grid[][]){
    int c1 = 0,c2 = 0;
    for(int i = 0;i<3;i++){
        if(grid[0][i] == 'X')
        c1++;
        else
        c2++;
    }
    if(c1 == 3){
        System.out.println("8Player1 wins");
        System.exit(0);
    }
        else if(c2==3){
        System.out.println("8Player2 wins");
        System.exit(0);
        }
    
}
    
}
