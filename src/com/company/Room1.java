package com.company;

import java.util.ArrayList;

public class Room1 extends Room
{
    public Room1(boolean n, boolean e, boolean s, boolean w, String i, String hm, ArrayList<String> a)
    {
        super(n, e, s, w, i, hm, a);
    }

    public void load()
    {
        System.out.println(getIntro());
        String response = getLegalInput(true);
        while(!responseIsExit(response))
        {
            if(response.equalsIgnoreCase("cat"))
                System.out.println("That is indeed a cat.");
            else if(response.equalsIgnoreCase("dog"))
                System.out.println("That is indeed a dog.");
            else if(response.equalsIgnoreCase("test"))
                System.out.println("You found the test phrase lying on the ground!");
            response = getLegalInput(true);
        }
        analyzeExit(response);
    }
}
