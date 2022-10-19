package WellnessCenter;

public class Nisargalaya implements treatments{
	 public String Branch;
	 public int Regfee; 
	public Nisargalaya()                                       //default constructor
	{
		Branch="Mysore";
		Regfee=50;
	}
	public Nisargalaya(String Branch)                          //constructor overloading
	{
		this.Branch=Branch;                             //usage of this keyword
		this.Regfee=50;
	}
	void details()
	{
		System.out.println("Nisargalaya, a unique wellness centre surrounded by spellbinding nature gives you a new experience"
				+ " of being in nature while curing your health problems.");          
	}
	public void doctor(String date)
	{
		System.out.println("Nisargalaya has experienced set of hands to cure your health problems");
	}
}