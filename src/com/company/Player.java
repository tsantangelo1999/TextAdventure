package com.company;

public class Player extends Character
{
    private int posX;
    public int getX()
    {
        return posX;
    }
    public void west()
    {
        posX--;
    }
    public void east()
    {
        posX++;
    }

    private int posY;
    public int getY()
    {
        return posY;
    }
    public void north()
    {
        posY++;
    }
    public void south()
    {
        posY--;
    }

    public Player(int h, int a, int d, int m)
    {
        super(h, a, d, m);
        experience = 0;
        level = 0;
        posX = 0;
        posY = 0;
    }

    private int experience;
    private int level;
}
