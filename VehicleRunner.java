class VehicleRunner{
	public static void main(String[] args)
	{
		System.out.println("enter the source and destination in km");
		Vehicle.transport("Banglore", 200);
		Vehicle.transport("Tiptur", 125, true);
		Vehicle.transport(true);
		Vehicle.transport(450, false);
		System.out.println("reached destination ontime?");
		Vehicle.driving(false);
	}
}