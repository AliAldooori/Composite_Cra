package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Facade facade = new Facade() ;
        facade.tyers.add(facade.rubber);
        facade.tyers.add(facade.wheel);

        facade.gear.add(facade.gearbody);
        facade.gear.add(facade.gearcover);

        facade.motor.add(facade.battry);
        facade.motor.add(facade.gear);
        facade.motor.add(facade.ac);

        facade.carr.add(facade.motor);
        facade.carr.add(facade.tyers);

      //  facade.motor.ShowPrice();
    //    facade.motor.getprice() ;

   System.out.println("=====================================");
        facade.carr.ShowPrice();
        facade.carr.getprice() ;



    }
}
