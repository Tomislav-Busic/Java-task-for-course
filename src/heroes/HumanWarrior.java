
package heroes;


public class HumanWarrior extends BaseHero {

    @Override
    public void primaryFire() {
      this.mana -= 10;
      System.out.println("Primary fire!!! I did 20 damage to my enemy!!!");
    }

    @Override
    public void reciveHit() {
        this.health -= 10;
        this.dead = this.health <= 0;
        System.out.println("I was hit for 10 damage!!!");
    }
    
    public void show(){
        System.out.println("Human Warrior");
        System.out.println("Health: " + this.health);
        System.out.println("Mana: " + this.mana);
        System.out.println("Dead: " + this.dead);
    }
}
