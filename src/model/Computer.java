package model;

import model.components.Keyboard;
import model.components.Monitor;
import model.components.Mouse;
import model.components.OperatingSystem;

public class Computer {
    String type;
    boolean isOn;
    Keyboard keyboard;
    Monitor monitor;
    Mouse mouse;
    OperatingSystem os;

    public void setKeyboard(Keyboard k){
        keyboard = k;
    }
    
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String t){
        type = t;
    }

    public OperatingSystem getOs() {
        return os;
    }

    public void setOs(OperatingSystem os) {
        this.os = os;
    }

    public void turnComputerOn(){
        if (isOn) {
            System.out.println("Your computer is already on.");
            return; // breaks here
        }
        
        isOn = true;
        System.out.println(type + ".Booting up.....");

        if (os == null) System.out.println("Oops. could not find an OS to load...");
        else {
            os.loadOs();
        }
    }

    public void checkPower(){
        if (isOn) {
            System.out.println(type + " - Power in on.");
        } else {
            System.out.println(type + " - Power in off.");
        }
    }    
}
