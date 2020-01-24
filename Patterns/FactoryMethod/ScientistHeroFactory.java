package FactoryMethod;

public class ScientistHeroFactory implements HeroFactory {
    @Override
    public Hero createHero(){
        return new Scientist();
    }
}
