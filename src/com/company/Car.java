package com.company;

import java.util.ArrayList;

public class Car implements Component{
  String name ;
    ArrayList<Component> cars ;
    int compositeprice  ;

    public Car(String name) {
        this.name = name;
        this.cars = new ArrayList<>() ;
    }
    public  void add (Component c) {
        this.cars.add( c) ;
    }

    @Override
    public void ShowPrice() {
      System.out.println(this.name);
for (Component item : cars) {
   item.ShowPrice();
   compositeprice += item.getprice();
    System.out.println(compositeprice);
}

    }

    @Override
    public int getprice() {
        return compositeprice ;
    }


}
