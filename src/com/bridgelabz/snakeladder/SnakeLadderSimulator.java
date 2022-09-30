// UC2 Player rolls the die to get a number between 1 to 6.

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
    int rolldie()
    {
        int n = 0;
        Random r = new Random();
        n=r.nextInt(7);
        return (n==0?1:n);
    }
    public static void main(String[] args)
    {
        SnakeLadderSimulator sls = new SnakeLadderSimulator();
        sls.start();
        dice = sls.rolldie();
        System.out.println(dice);

    }
}