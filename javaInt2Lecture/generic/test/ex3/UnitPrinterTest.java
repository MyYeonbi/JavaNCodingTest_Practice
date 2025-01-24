package javaInt2Lecture.generic.test.ex3;

import javaInt2Lecture.generic.test.ex3.unit.Marine;
import javaInt2Lecture.generic.test.ex3.unit.Zealot;
import javaInt2Lecture.generic.test.ex3.unit.Zerglins;

public class UnitPrinterTest {

    public static void main(String[] args) { Shuttle<Marine> shuttle1 = new Shuttle<>(); shuttle1.in(new Marine("마린", 40));
        Shuttle<Zerglins> shuttle2 = new Shuttle<>(); shuttle2.in(new Zerglins("저글링", 35));
        Shuttle<Zealot> shuttle3 = new Shuttle<>(); shuttle3.in(new Zealot("질럿", 100));
        UnitPrinter.printV1(shuttle1);
        UnitPrinter.printV2(shuttle1);
    }
}
