package com.pluralsight;

public class PowerPuffGirl {


    // instance variables (typically hidden)
    private String name;
    private int health;
    private String outfitcolor;
    private int attackDamage;
    private int Power;


    // constructor (parameters with a _name)

     public PowerPuffGirl(String _name, String _outfitcolor) {

         this.name = _name;
         this.outfitcolor = _outfitcolor;
         this.Power = 100;  // defualt value
         this.health = 100;
         this.attackDamage = 100;


     }


     public String getName() {
         return this.name;
     }


     public int getHealth() {
         return this.health;
     }


     public void setHealth(int _NewHealth ) {
         if(_NewHealth > 0 && _NewHealth <100)
         {
             this.health = _NewHealth;

         }
         System.out.println("Come on, this is not possible");
     }


     public void Heal(int _HowMuchHealth) {
         System.out.println("Drinking Potion");
         // We Can't go over 100

         int NewHealth = this.health + _HowMuchHealth;
         if (NewHealth >= 100) {
             this.setHealth(100);
             System.out.println("Fully Recovered");
         }else {
             System.out.println("Come on, this is not possible. Try again!");
         }

         setHealth(NewHealth);



     }

}
