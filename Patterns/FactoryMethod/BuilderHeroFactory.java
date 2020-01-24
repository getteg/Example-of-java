package FactoryMethod;

public class BuilderHeroFactory implements HeroFactory {
    @Override
    public Hero createHero(){
        return new Builder();
    }
}
