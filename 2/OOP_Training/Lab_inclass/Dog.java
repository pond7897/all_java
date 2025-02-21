package lab_inclass;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
		super.eat();
		super.sleep();
		bark();
	}

	public void bark() {
		System.out.printf("%s is bark", super.getName());
	}

	public static void main(String[] args) {
		Dog dog = new Dog("Pond");

		System.err.println(dog.getName());
	}
}
