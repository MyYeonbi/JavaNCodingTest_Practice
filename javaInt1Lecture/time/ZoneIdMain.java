package javaInt1Lecture.time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {

    public static void main(String[] args) {
        for (String avaiableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println("Available Zone: " + avaiableZoneId);
            ZoneId zoneId = ZoneId.of(avaiableZoneId);
            System.out.println(zoneId + " | "+ zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault(): " + zoneId);

        ZoneId shanghaiZoneId = ZoneId.of("Asia/Shanghai");
        System.out.println("shanghaiZoneId: " + shanghaiZoneId);
    }
}
