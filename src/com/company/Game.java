package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Game
{
    public static Map map;
    public static Player player;
    public static boolean running;
    public static final String[] exitResponses = {"north", "up", "east", "right", "south", "down", "west", "left"};

    public Game()
    {
        player = new Player(5, 5, 5, 5);
        Room[][] room = new Room[1][1];
        room[0][0] = new Room1(false, false, false, false, "Leaves are rustling in the wind. A small cave is visible to the west", new ArrayList<String>(Arrays.asList("dog", "cat", "test")));
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
        Room loc = map.rooms[x][y];
        loc.load();
    }

    public static void loadRoomInDungeon(Map m, int x, int y)
    {

    }
}
