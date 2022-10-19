package WellnessCenter;

public class Naturopathy extends Nisargalaya{                                    //inheritance
	int Mincost=200;
	public int id;
	
	int totalcost=0;
	public Naturopathy(String Branch,int id)
	{ 
		super(Branch);                                                 //super class
		this.id=id;
	    totalcost = totalcost + Mincost + Regfee;
		System.out.println("Your appointment in the Naturopathy is booked."+" Your patient_id is "+(id+100));
	}
	void details() {                                     // method overriding        //calling super class method
		super.details();
		System.out.println("Naturopathy is a system of medicine which uses natural techniques to heal the body. "
				+ "It is a holistic approach for wellness of a person.");
	}
	void MudTherapy(String date) {
		int mudtherapycost = 3000;
		System.out.println("Your mudtherapy appointment has been fixed on "+date);
		System.out.println("Get well soon");
		totalcost = totalcost + mudtherapycost;
	}
	void Hydrotherapy(String date) {
		int hydrotherapycost = 3000;
		System.out.println("Your hydrotherapy appointment has been fixed on "+date);
		System.out.println("Get well soon");
		totalcost = totalcost + hydrotherapycost;
	}
	void BodyMassage(String date) {
		int bodymassagecost=2500;
		System.out.println("Your bodymassage appointment has been fixed on "+date);
		System.out.println("Get well soon");
		totalcost = totalcost + bodymassagecost;
	}
	public void doctor(String date) {
    int doctorfee = 1500;
	System.out.println("Your appointment with Naturopathy Doctor has been fixed on "+date);
	totalcost = totalcost + doctorfee;
	}
}
