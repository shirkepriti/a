package Com.Crm.Javautility;


import java.util.Random;

public class Javautility {

	public static int  generaterateRandomeNumber(int limit) {
		Random random=new Random();
		return random.nextInt(limit);
		
	}

}
