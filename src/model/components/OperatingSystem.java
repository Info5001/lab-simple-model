package model.components;

public class OperatingSystem {
    String name;
    String loadingMessage;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getLoadingMessage() {
        return loadingMessage;
    }
    public void setLoadingMessage(String loadingMessage) {
        this.loadingMessage = loadingMessage;
    }

    public void loadOs(){
        System.out.println(name + loadingMessage);
    }

}
