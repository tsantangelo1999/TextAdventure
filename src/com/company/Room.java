package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Room
{
    private boolean hasWestExit;
    public boolean getHasWestExit()
    {
        return hasWestExit;
    }

    private boolean hasEastExit;
    public boolean getHasEastExit()
    {
        return hasEastExit;
    }

    private boolean hasNorthExit;
    public boolean getHasNorthExit()
    {
        return hasNorthExit;
    }

    private boolean hasSouthExit;
    public boolean getSouthExit()
    {
        return hasSouthExit;
    }

    private ArrayList<String> actions;
    public ArrayList<String> getActions()
    {
        return actions;
    }

    private String intro;
    public String getIntro()
    {
        return intro;
    }

    public Room(boolean n, boolean e, boolean s, boolean w, String i, ArrayList<String> a)
    {
        hasNorthExit = n;
        hasEastExit = e;
        hasSouthExit = s;
        hasWestExit = w;
        intro = i;
        actions = a;
    }

    public abstract void load();

    public String getLegalInput(boolean includeStandardPhrases)
    {
        Scanner input = new Scanner(System.in);
        String r = "";
        boolean legal = false;
        while(!legal)
        {
            r = input.nextLine();
            for(String s : getActions())
            {
                if(r.equalsIgnoreCase(s))
                {
                    legal = true;
                    break;
                }
            }
            if(includeStandardPhrases)
            {
                legal = responseIsExit(r);
            }
            if(!legal)
                System.out.println("That didn't make any sense. (Literally this irl)");
        }
        return r;
    }

    public boolean responseIsExit(String r)
    {
        for(String s : Game.exitResponses)
        {
            if(r.equalsIgnoreCase(s))
                return true;
        }
        return false;
    }
}
