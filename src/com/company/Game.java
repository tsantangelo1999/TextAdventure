package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Game
{
    public static final String[] exitResponses = {"north", "up", "east", "right", "south", "down", "west", "left", "exit"};

    public static Map map;
    public static Player player;
    public static boolean running;

    public Game()
    {
        player = new Player(5, 5, 5, 5);
        Room[][] room = new Room[1][1];
        room[0][0] = new Room1(false, false, false, false, "Leaves are rustling in the wind. A small cave is visible to the west", "You are wondering what to do", new ArrayList<String>(Arrays.asList("dog", "cat", "test")));
        map = new Map(room);
    }

    public void start()
    {
        running = true;
        while(running)
        {
            loadRoom(player.getX(), player.getY());
        }
    }

    public void loadRoom(int x, int y)
    {
        Room loc = map.rooms[x][y];
        loc.load();
    }

    public void loadRoomInDungeon(Map m, int x, int y)
    {

    }
}
