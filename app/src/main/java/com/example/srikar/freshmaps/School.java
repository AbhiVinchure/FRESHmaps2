package com.example.srikar.freshmaps;

import com.example.srikar.freshmaps.Room;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class School {
    private ArrayList<Room> totalSchool = new ArrayList<Room>();

    public School(InputStream fName) {
        Scanner scan = new Scanner(fName);
        while (scan.hasNext()) {
            String name = scan.next() + " " + scan.next();
            String room = scan.next();
            totalSchool.add(new Room(name, room));
        }

    }

    public ArrayList<Room> getTotalSchool() {
        return totalSchool;
    }
}
