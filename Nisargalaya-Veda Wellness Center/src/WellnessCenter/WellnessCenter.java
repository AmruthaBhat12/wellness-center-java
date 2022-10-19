package WellnessCenter;
import java.util.*;

interface treatments{                                 //Interface
	void doctor(String date);
	default void food() {                            //Implementing interface with default methods
		System.out.println("Healthy,Homemade food is served to all patients in Nisargalaya");
	}
}
class AvailabilityException extends Exception{              //custom exception
	AvailabilityException(String s)
	{
		super(s);
	}
}
class bill implements Runnable
{   Thread t;
    String name;
    int totalbill;
	bill(int bill,String patientname)
	{
	 name=patientname;
	 totalbill=bill;
	 t = new Thread(this,name);
	 t.start();
	}
	public void run()
	{
	     System.out.println("Your total bill is Rs."+totalbill);
	     System.out.println("Get Well Soon, "+name);
	}
}

public class WellnessCenter {
	public static void main(String[] args) {
		int age;
		int bill=0;
		String PatientName;
		String Address;
		String Phno;
		String ParentName;
		String Gender;
		String Branch;
		String date;
		boolean Patientno=true;
		int i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Welcome To NISARGALAYA-----Wellness Center"+" Booking is available only from 6am to 9am for a day");
		System.out.println("Enter the date in the format dd-mm-yyyy");
		date = sc.nextLine();
		do {
			PatientName=null;
			int availability = 30;
			if(i<availability)
			{
			System.out.println("Patient "+ i);
			System.out.println("Enter Patient Name: ");
			PatientName = sc.nextLine();
			System.out.println("Enter Gender: Press M for Male,F for Female and any other letters for Others");
			Gender = sc.nextLine();
			System.out.println("Enter Your Age: ");
			age=sc.nextInt();                      //Reading console input using scanner class
			sc.nextLine();
			if(age<18)
			{
				System.out.println("Enter Your Parent name: ");
				ParentName = sc.nextLine();
				System.out.println("Enter your Parent address:");
				Address=sc.nextLine();
				System.out.println("Enter your Parent phno:");
				Phno = sc.nextLine();
			}
			else
			{   
				System.out.println("Enter your address:");
				Address=sc.nextLine();
				System.out.println("Enter your phno:");
				Phno = sc.nextLine();
			}
			System.out.println("Nisargalaya-Wellness center has branches at KuvempuNagara(Main Branch),JayaNagara in Mysore");
			System.out.println("Select one of the branch or else appointment will be fixed in main branch 'KuvempuNagara,Mysore'");
			Branch = sc.nextLine();            
			Nisargalaya ab = null;
			if(Branch.equals("KuvempuNagara"))                       //String Handling function
			{
				 ab = new Nisargalaya(Branch);
			}
			else if(Branch.equals("JayaNagara"))
			{
			    ab = new Nisargalaya(Branch);
			}
			else
			{
				 ab = new Nisargalaya();
			}
			
			ab.doctor(date);
			ab.food();
			System.out.println("Select the therapy that you want - 1)Naturopathy 2)Ayurveda 3)Yoga 4)Physiotherapy");
			System.out.println("Choose the corresponding number  for the therapy that you want");
			int choice = sc.nextInt();
			switch(choice)
			{
			    case 1 : Naturopathy nat = new Naturopathy(Branch,i);                //object declaration
			    nat.details();
				System.out.println("Treatments available in Naturopathy");
				System.out.println("1.Mud Therapy");
				System.out.println("2.Hydro Therapy");
				System.out.println("3.Body Massage");
				System.out.println("4.Doctor Consultation");
				System.out.println("Enter the corresponding number for the treatment that you want");
			    int a1=sc.nextInt();
				switch(a1) {
				case 1:System.out.println("You have selected for Mud therapy");
					   nat.MudTherapy(date);
				       break;
				case 2:System.out.println("You have selected for Hydrotherapy");
				       nat.Hydrotherapy(date);
				       break;
				case 3:System.out.println("You have selected for BodyMassage");
			           nat.BodyMassage(date);
			           break;
				case 4:System.out.println("Doctor Consultation");
				       nat.doctor(date);
				       break;
				    }bill=nat.totalcost;
				break;
			  case 2 : Ayurveda ayu = new Ayurveda(Branch,i);                   //passing datatype to constructor
			  ayu.details();
				System.out.println("Treatments available in Ayurveda");
				System.out.println("1.Snehapana");
				System.out.println("2.Abhyanga - Oil massage");
				System.out.println("3.Swedana");
				System.out.println("4.Doctor Consultation");
				System.out.println("Enter the corresponding number for the treatment that you want");
				int a2=sc.nextInt();
				switch(a2) {
				case 1:System.out.println("You have selected for Snehapana");
					   ayu.snehapana(date);
				       break;
				case 2:System.out.println("You have selected for Abhyanga - Oil massage");
				       ayu.abhyanga(date);
				       break;
				case 3:System.out.println("You have selected for Swedana");
			           ayu.swedana(date);
			           break;
				case 4:System.out.println("Doctor Consultation");
			           ayu.doctor(date);
			           break;
			    
			}bill=ayu.totalcost;
				break;
			
			case 3 : Yoga yog = new Yoga(Branch,i);
			    yog.details();
				System.out.println("Treatments available in Yoga");
					System.out.println("1.Hatha yoga");
					System.out.println("2.Raja Yoga");
					System.out.println("3.Karma yoga");
					System.out.println("Enter the corresponding number for the treatment that you want");
					int a3=sc.nextInt();
					switch(a3) {
					case 1:System.out.println("You have selected for HathaYoga");
						   yog.hathayoga(date);
					       break;
					case 2:System.out.println("You have selected for RajaYoga");
					       yog.rajayoga(date);
					       break;
					case 3:System.out.println("You have selected for Swedana");
				           yog.karmayoga(date);
				           break;
				           
				}bill=yog.totalcost;
					break;
			
			case 4 : Physiotherapy phy = new Physiotherapy(Branch,i);
			phy.details();
			
				System.out.println("Treatments available in Physiotherapy");
				System.out.println("1.Dry Needling");
				System.out.println("2.Kinesio Tapping");
				System.out.println("3.Orthopaedic Manual Physical Therapy");
				System.out.println("4.Doctor Consultation");
				System.out.println("Enter the corresponding number for the treatment that you want");
				int a4=sc.nextInt();
				switch(a4) {
				case 1:System.out.println("You have selected for DryNeedling");
					   phy.dryneedling(date);
				       break;
				case 2:System.out.println("You have selected for Kinesio Tapping");
				       phy.kinesiotapping(date);
				       break;
				case 3:System.out.println("You have selected for Orthopedic Therapy");
			           phy.orthopaedic(date);
			           break;
				case 4:System.out.println("Doctor Consultation");
		               phy.doctor(date);
		               break;
		               
			     }bill=phy.totalcost;
				break;
			}
			try {
				System.out.println("Wait for a while to generate bill");
				Thread.sleep(10000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Bill generation got interrupted"+"Sorry for the interruption"+PatientName);
			}
			bill ob = new bill(bill,PatientName);
			
			System.out.println("Do we have next Patient?\nPress 1 to say Yes,any other number to say No");
			int patient=sc.nextInt();
			if(patient!=1)
			{
				Patientno=false;
				break;
			}
			else
			{
				Patientno=true;
			}
			i++;
			}
			else
			{  
			   try                                                        //exception
                {   
					throw new AvailabilityException("No Availabilty");
				}
			    catch(Exception a)
			    {
				System.out.println("All the seats are booked, Please try tommorow."+a.getMessage());
			    }break;
			 } 
		}
		while(Patientno==true);
	}

}
