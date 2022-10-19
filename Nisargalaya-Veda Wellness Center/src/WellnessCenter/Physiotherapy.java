package WellnessCenter;

class Physiotherapy extends Nisargalaya{
	int Mincost=100;
	int id;
	int totalcost=0;
	Physiotherapy(String Branch,int id)
	{
		super(Branch);
		this.id=id;
		totalcost = totalcost + Mincost + Regfee;
		System.out.println("Your appointment in the Physiotherapy is booked. "+" Your patient_id is "+(id+100));
		
	}
    void details() {
    	super.details();
    	System.out.println("The treatment of disease, injury, or deformity by physical methods such as massage, heat treatment,"
    			+ " and exercise rather than by drugs or surgery.");
	}
    void dryneedling(String date) {
		int dryneedlingcost = 3000;
		System.out.println("Your dryneedling appointment has been fixed on "+date);
		System.out.println("Get well soon");
		totalcost = totalcost + dryneedlingcost;
	}
	void kinesiotapping(String date) {
		int kinesiotappingcost = 3000;
		System.out.println("Your kinesiotapping appointment has been fixed on "+date);
		System.out.println("Get well soon");
		totalcost = totalcost + kinesiotappingcost;
	}
	void orthopaedic(String date) {
		int orthopaediccost = 2000;
		System.out.println("Your orthopaedic appointment has been fixed on "+date);
		System.out.println("Get well soon");
		totalcost = totalcost + orthopaediccost;
	}
	public void doctor(String date) {
		int doctorfee=1000;
		System.out.println("Your appointment with Physiotherapy Doctor has been fixed on "+date);
		totalcost = totalcost + doctorfee;
	}
}