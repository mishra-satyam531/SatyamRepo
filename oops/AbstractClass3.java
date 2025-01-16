package oops;

abstract class Bird{
	public abstract void fly();
	public abstract void eat();
}
class Sparrow extends Bird{
	public void fly() {
		System.out.println("Sparrow fly at low height");
	}
	public void eat() {
		System.out.println("Sparrows eat grains");
	}
}
//abstract class can contain concrete and abstract methods
//concrete methods : A method with implementation
//abstract methods : A method without implementation
abstract class Eagle extends Bird{
	public void fly() {
		System.out.println("Eagle fly very high");
	}
	public abstract void eat();
}
class SerpentEagle extends Eagle{
	public void eat() {
		System.out.println("Serpent eagle eats snake");
	}
}
class GoldenEagle extends Eagle{
	public void eat() {
		System.out.println("Golden eagle catches prey over the ocean");
	}
}
class Crow extends Bird{
	public void fly() {
		System.out.println("Crow fly at medium height");
	}
	public void eat() {
		System.out.println("Sparrows eat grains");
	}
}

class Sky{
	public void allowBird(Bird ref) {
		ref.fly();
		ref.eat();
		System.out.println();
	}
}
class AbstractClass3{
	public static void main(String[] args) {
		Sky s = new Sky();
		
		s.allowBird(new Sparrow());
		s.allowBird(new Crow());
		s.allowBird(new SerpentEagle());
		s.allowBird(new GoldenEagle());
	}
}