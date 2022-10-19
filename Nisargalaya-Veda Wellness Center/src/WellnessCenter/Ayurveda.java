package WellnessCenter;

class Ayurveda extends Nisargalaya{
	int Mincost=200;
	int id;
	int totalcost=0;
	Ayurveda(String Branch,int id)
	{
		super(Branch);
		this.id=id;
		totalcost = totalcost + Mincost + Regfee;
		System.out.println("Your appointment in the Ayurveda is booked."+"Your patient_id is "+(id+100));
	}
    void details() {                                       //method overriding
    	super.details();
		System.out.println("Ayurveda is the ancient science which educates on creating a long and healthy life.");
	}
    void snehapana(String date) {
		int snehapanacost = 3000;
		System.out.println("Your snehapana appointment has been fixed on "+date);
		System.out.println("Get well soon");
		totalcost = totalcost + snehapanacost;
	}
	void abhyanga(String date) {
		int abhyaganacost = 3000;
		System.out.println("Your abhyanga appointment has been fixed on "+date);
		System.out.println("Get well soon");
		totalcost = totalcost + abhyaganacost;
	}
	void swedana(String date) {
		int swedanacost = 2000;
		System.out.println("Your Swedana appointment has been fixed on "+date);
		System.out.println("Get well soon");
		totalcost = totalcost + swedanacost;
	}
	public void doctor(String date) {
		int doctorfee=1000;
		System.out.println("Your appointment with Ayurveda Doctor has been fixed on "+date);
		totalcost = totalcost + doctorfee;
	}

}