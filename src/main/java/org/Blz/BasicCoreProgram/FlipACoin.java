package org.Blz.BasicCoreProgram;

public class FlipACoin
{
    public static void main(String[] args)
    {
        double DiceNum = (Math.random());

        if (DiceNum < 0.5)
        {
            System.out.println("Heads");
        }
            else
        {
            System.out.println("Tails");
        }
    }
}
