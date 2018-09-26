package bikes;

public class Main {
	public static void main(String[] args) {
		RoyalEnfield ThunderBird=new RoyalEnfield("TN23000","Eshwar","RECC");
		for(String det:ThunderBird.getDetails()) {
			System.out.println(det);
		}
		
	}
}
