/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice.oop;

/**
 *
 * @author hp5cd
 */
public abstract class Duck {
     FlyBehavior flybehavior;
    QuackBehavior quackbehavior;
    
    public Duck(){
    }   
    public void setFlyBehavior(FlyBehavior fb){
        flybehavior = fb; 
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackbehavior =qb;
    }
    abstract void display();
    
    public void performFly(){
    flybehavior.fly();
    }
    public void performQuack(){
        quackbehavior.quack();
    }
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
