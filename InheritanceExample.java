

class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}


class Dog extends Animal {
    
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}


class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}


public class InheritanceExample {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        System.out.println("=== Demonstrating Inheritance and Overriding ===");
        a.sound();  
        d.sound();  
        c.sound();  

        
        Animal ref;  
        ref = new Dog();
        ref.sound(); 

        ref = new Cat();
        ref.sound(); 
    }
}
