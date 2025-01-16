package oops;

class Animal{}
class Monkey extends Animal{}
class AnimalApp{
	public void m1(Monkey m) {
		System.out.println("Monkey version");
	}
	public void m1(Animal a) {
		System.out.println("Animal version");
	}
}
class MethodOverLoading5{
	public static void main(String[] args) {
		AnimalApp a = new AnimalApp();
		
		Monkey m = new Monkey();
		a.m1(m);
		
		Animal animal = new Animal();
		a.m1(animal);
		
//		In case of methodoverloading,compiler will bind the method
//		call based on the reference type but not on the runtime object
		Animal an = new Monkey();
		a.m1(an);
	}
}