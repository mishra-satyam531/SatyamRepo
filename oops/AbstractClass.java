package oops;

// Exposing the set of services but hiding the internal implementation
abstract class Planes{
	public abstract void takeOff();
	public abstract void fly();
	public abstract void land();
}
class CargoPlanes extends Planes {
	public void takeOff() {
		System.out.println("Cargo Plane takes off");
	}
	public void fly() {
		System.out.println("Cargo Plane is flying");
	}
	public void land() {
		System.out.println("Cargo Plane is landing");
	}
}
class PassengerPlanes extends Planes {
	public void takeOff() {
		System.out.println("Passenger Plane takes off");
	}
	public void fly() {
		System.out.println("Passenger Plane is flying");
	}
	public void land() {
		System.out.println("Passenger Plane is landing");
	}
}
class FighterPlanes extends Planes {
	public void takeOff() {
		System.out.println("Fighter Plane takes off");
	}
	public void fly() {
		System.out.println("Fighter Plane is flying");
	}
	public void land() {
		System.out.println("Fighter Plane is landing");
	}
}
class Airports{
	public void allowPlane(Planes ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
		System.out.println();
	}
}
public class AbstractClass{
	public static void main(String[] args) {
//		new Planes(); //Planes is abstract, cannot be instantiated
//		Planes p = null; we can create refrence of an abstract class
		Airports a = new Airports();
		
		a.allowPlane(new PassengerPlanes());
		a.allowPlane(new CargoPlanes());
		a.allowPlane(new FighterPlanes());
	}
}