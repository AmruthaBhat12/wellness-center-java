package WellnessCenter;

public class Yoga extends Nisargalaya{
	int Mincost=100;
	int id;
	int totalcost=0;
	Yoga(String Branch,int id)
	{
		super(Branch);
		this.id=id;
		totalcost = totalcost + Mincost + Regfee;
		System.out.println("Your appointment in the Yoga has been booked."+"Your patient_id is "+(id+100));
		
	}
    void details() {
    	super.details();
		System.out.println("Yoga is a way of living that aim towards a healthy mind in a healthy body. "
				+ "It allows in achieving physical and mental well – being of a person.");
	}
    void hathayoga(String date) {
		int hathayogacost = 3000;
		System.out.println("Your hathayoga appointment has been fixed on "+date);
		System.out.println("Get well soon");
		totalcost=totalcost+hathayogacost;
	}
	void rajayoga(String date) {
		int rajayogacost = 3000;
		System.out.println("Your rajayoga appointment has been fixed on "+date);
		System.out.println("Get well soon");
		totalcost=totalcost+rajayogacost;
	}
	void karmayoga(String date) {
		int karmayogacost = 2000;
		System.out.println("Your Karmayoga appointment has been fixed on "+date);
		System.out.println("Get well soon");
		totalcost=totalcost+karmayogacost;
	}
}