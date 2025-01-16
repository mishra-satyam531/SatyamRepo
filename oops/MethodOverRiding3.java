package oops;

class Animals{
	public void eat() {
		System.out.println("Animal is eating");
	}
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
}
class Monkeys extends Animals{
	public void eat() {
		System.out.println("Monkey steals and eats");
	}
	public void sleep() {
		System.out.println("Monkey is sleeping");
	}
}
class Deer extends Animals{
	public void eat() {
		System.out.println("Deer grazes and eats");
	}
	public void sleep() {
		System.out.println("Deer is sleeping");
	}
}
class Lion extends Animals{
	public void eat() {
		System.out.println("Lion hunts and eats");
	}
	public void sleep() {
		System.out.println("Lion is sleeping");
	}
}
class Forest extends Animals{
	public void allowAnimal(Animals animal) {
		animal.eat();
		animal.sleep();
	}
}
class MethodOverRiding3{
	public static void main(String[] args) {
		Forest f = new Forest();
		f.allowAnimal(new Deer());
		System.out.println();
		
		f.allowAnimal(new Monkeys());
		System.out.println();
		
		f.allowAnimal(new Lion());
	}
}