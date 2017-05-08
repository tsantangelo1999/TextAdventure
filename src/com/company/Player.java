package com.company;

public class Player extends Character
{
    private int posX;
    public int getX()
    {
        return posX;
    }

    private int posY;
    public int getY()
    {
        return posY;
    }

    public Player(int h, int a, int d, int m)
    {
        super(h, a, d, m);
        experience = 0;
        level = 0;
    }

    private int experience;
    private int level;
}
