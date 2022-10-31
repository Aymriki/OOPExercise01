public class BicycleRegistration{

	public static void main (String[] args) {
		Bicycle bike1,bike2;
		String owner1,owner2, No1, No2; 

		bike1 = new Bicycle();
		bike1.setOwnerName("Adam Smith");
		bike1.setTagNo("2002-143R");

		bike2 = new Bicycle();
		bike2.setOwnerName("Ben Jones");
		bike2.setTagNo("2003-144Q");

		owner1 = bike1.getOwnerName();
		No1 = bike1.getTagNo();

		owner2 = bike2.getOwnerName();
		No2 = bike2.getTagNo();

		System.out.println(owner1 + " owns a bike");
		System.out.println(No1 + " is his Tag Number");

		System.out.println(owner2 + " also owns a bike");
		System.out.println(No2 + " is his Tag Number");
		return;
	}
}
