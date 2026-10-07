package pratice_java;

public class SetGet {

	public static void main(String[] args) {
		Car2 car = new Car2();
		car.setmileage(35);
		car.setname("Bmw");
		System.out.println(car.getmileage());
		System.out.println(car.getname());
		
		
	}

}
class Car2
{
	int mileage;
	String name;
	
	public void setmileage(int mil)
	{
		if(mil>50)
		{
			
		    this.mileage=mil;	
		}
		else
		{
			this.mileage=0;		
		}
	}
	public int getmileage()
	{
	     return this.mileage;	
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return this.name;
	}
}