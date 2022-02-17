package com.company;

public class bil implements Component{

    String name ;
    int price ;

    public bil( String name , int price) {
        this.name = name ;
        this.price = price ;
    }

    @Override
    public void ShowPrice() {
       System.out.println("the name is "+this.name + " the price is "+ this.price);

    }

    @Override
    public int getprice() {
        return this.price;
    }


}
