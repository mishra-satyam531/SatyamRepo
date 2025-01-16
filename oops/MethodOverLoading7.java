package oops;

//Var-Arg vs Overloaded method
class Demo{
	//Exact Match : One-Argument
	public void methodOne(int i) {
		System.out.println("General Method");
	}
	public void methodOne(int... i) {
		System.out.println("Var-Arg Method");
	}
}
class MethodOverLoading7{
	public static void main(String[] args) {
		Demo d1 = new Demo();
		
		d1.methodOne();//Var-Arg
		d1.methodOne(10);//General method
		d1.methodOne(10, 20);//Var-Arg method
	}
}