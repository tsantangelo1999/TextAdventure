package com.company;

import java.util.Scanner;

public class Game
{
    public static Map map;
    public static Player player;
    public static boolean running;

    public Game()
    {
        player = new Player(5, 5, 5, 5);
    }

    public void start()
    {
        while(running)
        {
            loadRoom(player.getX(), player.getY());
        }
    }

    public static void loadRoom(int x, int y)
    {
        map.rooms[x][y].getIntro();
    }

    public static void loadRoomInDungeon(Map m, int x, int y)
    {

    }
}
