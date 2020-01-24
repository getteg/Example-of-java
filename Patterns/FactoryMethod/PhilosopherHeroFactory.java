package FactoryMethod;

public class PhilosopherHeroFactory implements HeroFactory {
    @Override
    public Hero createHero(){
        return new Philosopher();
    }
}
