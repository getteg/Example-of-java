package FactoryMethod;

public class Builder implements Hero {
    @Override
    public void sayHero(){
        System.out.println("Я строитель!");
    }
}
