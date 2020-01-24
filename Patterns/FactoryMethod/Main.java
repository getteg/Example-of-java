package FactoryMethod;

public class Main {

    public static void main(String[] args) {
        HeroFactory heroFactory = new StudentHeroFactory();
        Hero hero = heroFactory.createHero();

        hero.sayHero();

       
    }

}
