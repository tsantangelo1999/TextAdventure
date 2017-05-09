package com.company;

public class Character
{
    public Character(int h, int a, int d, int m)
    {
        health = h;
        attack = a;
        defense = d;
        magic = m;
    }

    private int health;
    public int getHealth()
    {
        return health;
    }

    private int attack;
    public int getAttack()
    {
        return attack;
    }

    private int defense;
    public int getDefense()
    {
        return defense;
    }

    private int magic;
    public int getMagic()
    {
        return magic;
    }
}
