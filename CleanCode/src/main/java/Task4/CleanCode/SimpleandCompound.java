package Task4.CleanCode;

public class SimpleandCompound {
	public double calculateSimpleInterest(int principle,double rate,int time)
	{
		return (principle*rate*time)/100;
	}
	public double calculateCompoundInterest(int principle,double rate,int time,int n)
	{
		return (principle*(1+Math.pow((rate/n),(time*n))));
	}
}
