package com.company;

public class Map
{
    private int rows;
    private int cols;
    public Room[][] rooms;

    public Map(Room[][] r)
    {
        rooms = r;
        rows = rooms.length;
        cols = rooms[0].length;
    }
}
