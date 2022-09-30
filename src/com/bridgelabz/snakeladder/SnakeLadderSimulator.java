// UC1 Snake and Ladder Simulator Game Starting Position 0

package com.bridgelabz.snakeladder;
public class SnakeLadderSimulator
{
    static final int STARTPOINT = 0;
    public static int player1Position = 0;
    void start()
    {
        if(STARTPOINT == player1Position)
        {
            System.out.println("Start Position : " +STARTPOINT);
        }
    }
    public static void main(String[] args)
    {
        SnakeLadderSimulator sls = new SnakeLadderSimulator();
        sls.start();
    }
}