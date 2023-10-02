/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice.oop;

/**
 *
 * @author hp5cd
 */
public class MallardDuck extends Duck {
    
    public MallardDuck(){
        quackbehavior = new Quack();
        flybehavior = new FlyWithWings();
    }
    @Override
    public void display(){
        System.out.println("I'am a real Mallard duck");
    }
}
