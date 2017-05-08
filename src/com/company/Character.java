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
    private int defense;
    private int magic;
}
