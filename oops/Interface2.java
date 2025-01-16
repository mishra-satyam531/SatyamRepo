package oops;

interface ICalculators
{
//public abstract
void add(int a,int b);
void sub(int a,int b);
void mul(int a,int b);
void div(int a,int b);
}
//Which ever class is implementing an interface that class should compulsorily
//give the body for all the abstract methods present in the interface.

//if the implementation class fails to give the body for atleast one abstract
//methods then that class would become abstract class.
abstract class CalculatorImp1 implements ICalculators{
	
}