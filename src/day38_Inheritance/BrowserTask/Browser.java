package day38_Inheritance.BrowserTask;

public class Browser {
    static int a=100;
    public int b;
    private String name;
    public void openBrowser(){
        System.out.println("opening chrome browser");
    }
    public void closeBrowser(){
        System.out.println("closing chrome browser");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
