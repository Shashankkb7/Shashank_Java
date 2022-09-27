class ColorsRunner
{
	public static void main(String[] rainbow)
	{
		System.out.println("main: information beku");
		Colors.save("Red");
		Colors.save("Blue");
		Colors.save("Black");
		Colors.save("Purple");
		Colors.save("Green");
		Colors.save("Brown");
		Colors.save("Orange");
		Colors.displayDetails();
		
		boolean found=Colors.findColors("Red");
		System.out.println("color Found :"+ found);
		System.out.println("main: information saku");
	}
}