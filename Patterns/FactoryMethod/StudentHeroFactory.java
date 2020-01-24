package FactoryMethod;

public class StudentHeroFactory implements HeroFactory {
    @Override
    public Hero createHero(){
        return new Student();
    }
}
