/* UC7 Play the game with 2 Player. In this case if a Player gets a Ladder then plays
 again. Finally report which Player won the game
*/
package com.bridgelabz.snakeladder;
import java.util.Scanner;
import java.util.Random;
public class SnakeLadderSimulator
{
    public static final int STARTPOINT = 0;
    public static final int WINNINGPOINT = 100;
    public static int player1Position = 0;
     public static int player2Position = 0;
    static int dice = 0;
    public int countPlayer1 = 0;
    public int countPlayer2 = 0;
    public static void welCome()
    {
        System.out.println("Welcome Snake and Ladder Simulator Game");
        System.out.println("Enter the Players Name");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player 1 : ");
        String player1 = scanner.nextLine();
        System.out.print("Player 2 : ");
        String player2 = scanner.next();
    }
    void start()
    {
        if(STARTPOINT == player1Position || STARTPOINT == player2Position)
        {
            System.out.println("Start Position : " +STARTPOINT);
        }
    }
    static int rolldie()
    {
        int n = 0;
        Random r = new Random();
        n=r.nextInt(7);
        return (n==0?1:n);
    }
    static void snake()
    {
        if(player1Position == 33)
            player1Position = 3;
        if(player1Position == 93)
            player1Position = 38;
        if(player1Position == 77)
            player1Position = 18;
        if(player1Position == 67)
            player1Position = 23;
        if(player2Position == 33)
            player2Position = 3;
        if(player2Position == 93)
            player2Position = 38;
        if(player2Position == 77)
            player2Position = 18;
        if(player2Position == 67)
            player2Position = 23;
    }
    static int ladder()
    {
        if(player1Position == 5)
            player1Position = 48;
        if(player1Position == 11)
            player1Position = 58;
        if(player1Position == 37)
            player1Position = 95;
        if(player1Position == 25)
            player1Position = 75;
        if(player2Position == 5)
            player2Position = 48;
        if(player2Position == 11)
            player2Position = 58;
        if(player2Position == 37)
            player2Position = 95;
        if(player2Position == 25)
            player2Position = 75;
        return 0;
    }
    public static void ladderplay()
    {
        if(player1Position == ladder())
          SnakeLadderSimulator.ladder();
        if(player2Position == ladder())
         SnakeLadderSimulator.ladder();
    }
    static void noPlay()
    {
        if(player1Position > WINNINGPOINT)
            player1Position = player1Position - dice;
        if(player2Position > WINNINGPOINT)
            player2Position = player2Position - dice;
    }
    static void setWinningPoint()
    {
        if (player1Position > WINNINGPOINT)
            player1Position = player1Position - dice;
        if (player2Position > WINNINGPOINT)
            player2Position = player2Position - dice;
    }
    static void win()
    {
        if(player1Position == WINNINGPOINT || player2Position == WINNINGPOINT)
        {
            System.out.println("Congratulation You won the Snake and Ladder Game ");
        }

    }
    public static boolean isWin(int player2Position)
    {
        return WINNINGPOINT == player1Position || WINNINGPOINT == player2Position;
    }
    static void calculatePlayerPosition()
    {
        dice = rolldie();
        SnakeLadderSimulator.setWinningPoint();
        player1Position = player1Position + dice;
        player2Position = player2Position + dice;
        SnakeLadderSimulator.noPlay();
        SnakeLadderSimulator.snake();
        SnakeLadderSimulator.ladder();
        SnakeLadderSimulator.ladderplay();
        System.out.println("Player1 : "+player1Position);
        System.out.println("Player2 : "+player2Position);
        SnakeLadderSimulator.win();
    }
    public static void main(String[] args)
    {
        SnakeLadderSimulator sls = new SnakeLadderSimulator();
        sls.welCome();
        for (player1Position = 0; player1Position <= WINNINGPOINT; player1Position++)
        {
            sls.start();
            sls.calculatePlayerPosition();
            if(isWin(player2Position))
                return;
            sls.countPlayer1++;
            sls.countPlayer2++;
        }
        System.out.println("Number of times dice was played : "+sls.countPlayer1);
        System.out.println("Number of times dice was played : "+sls.countPlayer2);
    }
}