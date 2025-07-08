package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;


public class Main {
    public static void main(String[] args) {

        Lamp lamp = new Lamp(LampType.NORMAL, true, 80 );
        System.out.println(lamp);
        Bed bed = new Bed("Çift kişilik", 20, 10, 5, 3);
        System.out.println(bed);
        Wardrobe wardrobe = new Wardrobe(20, 10, 50.5);
        System.out.println(wardrobe);
        Carpet carpet = new Carpet(3, 4, PaintColor.GREEN);
        System.out.println(carpet);
        Ceiling ceiling = new Ceiling(5, PaintColor.RED);
        System.out.println(ceiling);
        Wall wall = new Wall("left");
        System.out.println(wall);

        Ceiling ceiling2 = new Ceiling(3, PaintColor.WHITE);
        Bed bed2 = new Bed("Queen", 2, 3, 1, 1);
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("West");

        Bedroom bedroom = new Bedroom("yatak odası", wall1, wall2, wall3, wall4, ceiling2, bed2, lamp, wardrobe, carpet);
        System.out.println(bedroom);

    }
}