package com.prac.designPattern.creational;

public class AbstractFacrotyDesignPatternClient {
    public static void main(String[] args) {
        FurnitureFactory abstractFurniture = FurnitureFactory.createFurnitureFactory("ART");
        abstractFurniture.createSofa();
        abstractFurniture.createChair();
    }
}
abstract class FurnitureFactory {
    public static FurnitureFactory createFurnitureFactory(String mode) {
        if(mode.equals("Modern")){
            return new ModernFurnitureFactory();
        }else{
            return new ArtFurnitureFactory();
        }
    }

    public abstract void createSofa() ;
    public abstract void createChair() ;
}
class ModernFurnitureFactory extends FurnitureFactory
{
    public void createSofa(){
        System.out.println("Created Modern sofa");
    }

    public void createChair(){
        System.out.println("Created Modern chair");
    }
}
class ArtFurnitureFactory extends FurnitureFactory
{
    public void createSofa(){
        System.out.println("Created ART sofa");
    }

    public void createChair(){
        System.out.println("Created ART chair");
    }

}
