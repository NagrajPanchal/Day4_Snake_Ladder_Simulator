// UC4 Repeat till the Player reaches the winning position 100.

package com.bridgelabz.snakeladder;
import java.util.Random;
public class SnakeLadderSimulator
{
    static final int STARTPOINT = 0;
    public static int player1Position = 0;
    static int dice = 0;

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
        if(dice != 0)
        {
            player1Position = player1Position*1;
        }
    }
    static void calculatePlayerPosition()
    {
        dice = rolldie();
        player1Position = player1Position + dice;
        SnakeLadderSimulator.noPlay();
        SnakeLadderSimulator.snake();
        SnakeLadderSimulator.ladder();
        System.out.println(player1Position);
    }
    public static void main(String[] args)
    {
        SnakeLadderSimulator sls = new SnakeLadderSimulator();
        for (player1Position = 0; player1Position <100; player1Position++)
        {
            sls.start();
            sls.calculatePlayerPosition();
        }
    }
}