package ui;

import model.Computer;
import model.components.Keyboard;
import model.components.OperatingSystem;

public class App {
    public static void main(String[] args) {

        // To do list
        // + 1. Create packages - model, ui - completed.
        // + 2. Add some classes in the model package
        // + 2.1. Add some properties in classes
        // 3. Use the classes to create instances objects

        Computer desktop = new Computer();
        desktop.setType("Desktop");

        Keyboard fancyMechanicalKeyboard = new Keyboard();
        desktop.setKeyboard(fancyMechanicalKeyboard);

        OperatingSystem macOs = new OperatingSystem();
        macOs.setName("Mac OS version 19.4.");
        macOs.setLoadingMessage("Welcome to MacOS....");
        desktop.setOs(macOs);

        // line below turns the computer on
        desktop.turnComputerOn();
        // line below will say its already on
        desktop.turnComputerOn();


        // Computer archilsLaptop = new Computer();
        // archilsLaptop.setType("Laptop");

        // OperatingSystem windows11 = new OperatingSystem();
        // windows11.setName("Windows 11!");
        // windows11.setLoadingMessage("Welcome to Windows ");
        // archilsLaptop.setOs(windows11); 



        // archilsLaptop.turnComputerOn();
  
        
        // Computer gamingMachine = new Computer();
        // gamingMachine.setType("Desktop for gaming");

        



        // archilsLaptop.checkPower();
        // System.out.println("---------------------------");

        // archilsLaptop.turnComputerOn();
        // System.out.println("---------------------------");

        // archilsLaptop.checkPower();

        // gamingMachine.checkPower();
        // desktop.checkPower();




        
        
        
        // System.out.println("Hello, World!");
    }
}
