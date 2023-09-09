import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        char[][] board = new char[3][3];

        for(int i=0; i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                board[i][j]=' ';
            }
        }
        
    char player = 'X';
    boolean gameOver= false; 

    while(!gameOver)
    {
        printBoard(board);
        System.out.println("Player: "+player+" enter the move : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        if(board[row][col]==' ')
        {
                board[row][col]=player;
                gameOver= haveWon(board,player);
                if(gameOver)
                {
                        System.out.println("Player : " + player + "won the game");
                }
                else
                {
                    player = (player == 'X') ? 'O' : 'X';
                }
        }
        else
        {
            System.out.println("Invalid Move!");
        }
        
    }


    }





    public static boolean haveWon(char [][] board, char player)
    {
        for(int row=0; row<3;row++)
        {
            
               if(board[row][0] == player && board[row][1] == player && board[row][2] == player)
                return true;
            if(board[0][row] == player && board[1][row] == player && board[2][row] == player)
            return true;

            if (board[0][0] == player && board [1][1] == player && board[2][2]==player)
                return true;
            if (board[0][2] == player && board [1][1] == player && board[2][0]==player)
                 return true;
              
        }

        return false;

    }

    public static void printBoard(char [][]board)
    {

        for(int i=0; i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               System.out.print(board[i][j] + " | " + " ");
              
            }
             System.out.println();
        }
    }
}
