package com.company;

import java.util.ArrayList;

public abstract class Room
{
    private boolean hasWestExit;
    private boolean hasEastExit;
    private boolean hasNorthExit;
    private boolean hasSouthExit;

    private ArrayList<Map> dungeons;

    private ArrayList<String> actions;

    private String intro;
    public String getIntro()
    {
        return intro;
    }
}
