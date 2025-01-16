package javaInt1Lecture.time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {

    public static void main(String[] args) {
        for (String avaiableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println("Available Zone: " + avaiableZoneId);
        }
    }
}
