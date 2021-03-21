
package heroes;

public class Heroes {

    
    public static void main(String[] args) {
       HumanWarrior humanWarrior = new HumanWarrior();
       UndeadMage undeadMage = new UndeadMage();
       
       humanWarrior.dead = false;
       humanWarrior.health = 20;
       humanWarrior.mana = 20;
       humanWarrior.show();
       
       System.out.println("");
       
       humanWarrior.primaryFire();
       humanWarrior.reciveHit();
       humanWarrior.show();
       
       System.out.println("");
       
       undeadMage.healMe();
       undeadMage.show();
       
       System.out.println("");
       
       undeadMage.healMe();
       undeadMage.show();
       
       System.out.println("");
       
       undeadMage.healMe();
       undeadMage.show();
       
       System.out.println("");
       
       humanWarrior.primaryFire();
       humanWarrior.reciveHit();
       humanWarrior.show();
    }
    
}
