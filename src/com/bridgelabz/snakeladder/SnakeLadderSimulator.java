/* UC6 Report the number of times the dice was played to win the game and
 also the position after every die role
*/
package com.bridgelabz.snakeladder;
import java.util.Random;
public class SnakeLadderSimulator
{
    public static final int STARTPOINT = 0;
    public static final int WINNINGPOINT = 100;
    public static int player1Position = 0;
    static int dice = 0;
    public int count = 0;

    void start()
    {
        if(STARTPOINT == player1Position)
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
        {
            player1Position = 3;
        }
        if(player1Position == 93)
        {
            player1Position = 38;
        }
        if(player1Position == 77)
        {
            player1Position = 18;
        }
        if(player1Position == 67)
        {
            player1Position = 23;
        }
    }
    static void ladder()
    {
        if(player1Position == 5)
        {
            player1Position = 48;
        }
        if(player1Position == 11)
        {
            player1Position = 58;
        }
        if(player1Position == 37)
        {
            player1Position = 95;
        }
        if(player1Position == 25)
        {
            player1Position = 75;
        }
    }
    static void noPlay()
    {
        if(player1Position > WINNINGPOINT)
        {
            player1Position = player1Position - dice;
        }
    }
    static void setWinningPoint()
    {
        if (player1Position > WINNINGPOINT)
        {
            player1Position = player1Position - dice;
        }
    }
    static void win()
    {
        if(player1Position == WINNINGPOINT)
        {
            System.out.println("Congratulation 'Player1' won the Snake and Ladder Game ");
        }
    }
    static void calculatePlayerPosition()
    {
        dice = rolldie();
        SnakeLadderSimulator.setWinningPoint();
        player1Position = player1Position + dice;
        SnakeLadderSimulator.noPlay();
        SnakeLadderSimulator.snake();
        SnakeLadderSimulator.ladder();
        System.out.println(player1Position);
        SnakeLadderSimulator.win();
    }
    public static void main(String[] args)
    {
        SnakeLadderSimulator sls = new SnakeLadderSimulator();
        for (player1Position = 0; player1Position <= WINNINGPOINT; player1Position++)
        {
            sls.start();
            sls.calculatePlayerPosition();
            sls.count++;
        }
        System.out.println("Number of times dice was played : "+sls.count);
    }
}