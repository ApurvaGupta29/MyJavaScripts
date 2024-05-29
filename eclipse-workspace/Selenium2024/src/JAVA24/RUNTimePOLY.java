package JAVA24;

class vehicle {
	void makesound()
	{
		System.out.print("vehicle makes sound");
	}
}

	class car extends vehicle{
		void makesound()
		{
			System.out.println("Car honks");
		}
	}
	class bike extends vehicle{
		void makesound()
		{
			System.out.println("bike bells");
		}
	}
	class truck extends vehicle{
		void makesound()
		{
			System.out.println("truck horns");
		}
	}
public class RUNTimePOLY{

	public static void main(String[] args) {
		   vehicle myVehicle;

	        myVehicle = new car();
	        myVehicle.makesound();  // Outputs: Car honks

	        myVehicle = new bike();
	        myVehicle.makesound();  // Outputs: Bike rings bell

	        myVehicle = new truck();
	        myVehicle.makesound();  // Outputs: Truck blows horn
	    }
	

	}


