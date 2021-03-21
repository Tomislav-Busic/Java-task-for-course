
package heroes;


public abstract class BaseHero {
    
    public double health;
    public double mana;
    public boolean dead;
    
    public abstract void primaryFire();
    public abstract void reciveHit();
}
