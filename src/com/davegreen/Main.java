package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2200", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27 inch beast", "Acer", 27, new Resolution(2540, 1440));

        MotherBoard theMotherboard = new MotherBoard("83-290", "Acer", 4, 8, "v2.64");

        PC thePc = new PC(theCase, theMonitor, theMotherboard);

//        thePc.getMonitor().drawPixelAt(1500, 1200, "red");      // These only worked whe the access modifier in the PC class was public
//        thePc.getMotherBoard().loadProgram("Windows 10");       // it was changed to private to further protect the classes methods and
//        thePc.getTheCase().pressPowerButton();                               // and so now wont work unless of course the access modifiers are changed back.

        thePc.powerUp();


        // Composition is different than inheritance in that inheritance can only extend from one class and
        // so is very limited in its function, as you can see from the example in this code composition is
        // by far superior when required to "inherit" for want of a better word from multiple classes as shown
        // above in that we have many classes each with their own specific fields (properties that make them)
        // but all of these individual classes when put together make up another class called PC, without composition
        // it would be impossible to build a PC comprising of all of the parts from the other classes namely
        // Motherboard, Monitor, Case etc etc.
    }
}
