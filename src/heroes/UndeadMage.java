
package heroes;


public class UndeadMage extends BaseHero {

    @Override
    public void primaryFire() {
        
    }

    @Override
    public void reciveHit() {
        
    }
    public void healMe() {

    this.health += 10;

    System.out.println("10 health has been added");
    }
    public void show(){
        System.out.println("Human Warrior");
        System.out.println("Health: " + this.health);
        System.out.println("Mana: " + this.mana);
        System.out.println("Dead: " + this.dead);
    }
}
