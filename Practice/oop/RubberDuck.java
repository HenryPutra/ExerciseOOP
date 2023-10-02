/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice.oop;

/**
 *
 * @author hp5cd
 */
public class RubberDuck extends Duck {
    
    public RubberDuck(){
        flybehavior = new FlyNoWay();
        //quackbehavior = new Squeak();
        quackbehavior = () -> System.out.println("Squeak");
    }
    public RubberDuck(FlyBehavior flybehavior,QuackBehavior quackbehavior){
        this.flybehavior = flybehavior;
        this.quackbehavior = quackbehavior;
    }

    @Override
    public void display() {
       System.out.println("I'am a rubber duckie");
    }
}
