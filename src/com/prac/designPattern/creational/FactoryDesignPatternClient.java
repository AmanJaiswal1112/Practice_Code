package com.prac.designPattern.creational;

public class FactoryDesignPatternClient {
    public static void main(String[] args) {
        FactoryTransport factoryTransport = new FactoryTransport();
        factoryTransport.createTransport("Road").trasport();
        factoryTransport.createTransport("Water").trasport();
    }
}
class FactoryTransport{

    public Transport createTransport(String type){
        switch (type){
            case "Road" :
                return new RoadTransport();
            case "Water" :
                return new WaterTransport();
        }
        return null;
    }
}

interface Transport{
    public void trasport();
}

class WaterTransport implements Transport{
    @Override
    public void trasport() {
        System.out.println("Water Transpotation");
    }
}

class RoadTransport implements Transport{
    @Override
    public void trasport() {
        System.out.println("Road Transpotation");
    }
}