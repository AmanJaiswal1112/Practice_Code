package com.prac.designPattern.structual;

 interface Coffee {
    String getDescription();
    double getCost();
}

abstract class CoffeeDecorator implements Coffee {
    protected final Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}

 class SimpleCoffee implements Coffee{

    @Override
    public String getDescription() {
        return "SimpleCoffe";
    }

    @Override
    public double getCost() {
        return 10;
    }
}


class MilkCoffeeDecorator extends CoffeeDecorator {
    public MilkCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", with milk";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }
}


public class DecoratorDesignPatternClient {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        MilkCoffeeDecorator milkCoffeeDecorator = new MilkCoffeeDecorator(coffee);
        System.out.println(milkCoffeeDecorator.getCost());
        System.out.println(milkCoffeeDecorator.getDescription());


        SimpleCoffee simpleCoffe = new SimpleCoffee();
        System.out.println(simpleCoffe.getCost());
        System.out.println(simpleCoffe.getDescription());
    }
}
