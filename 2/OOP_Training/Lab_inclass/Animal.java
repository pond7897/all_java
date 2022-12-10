package Lab_inclass;

public class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void sleep() {
        System.out.printf("%s is sleep%n",name);
    }
    public void eat() {
        System.out.printf("%s is eat%n",name);
    }
    public String getName() {
        return name;
    }
}

