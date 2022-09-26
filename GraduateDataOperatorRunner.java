class GraduateDataOperatorRunner{
	public static void main(String[] student)
	{
		System.out.println("main: information beku");
		String graduate1="Spoorthi ECE 8.1";
		GraduateDataOperator.save("Shashank K B 8.1");
		GraduateDataOperator.save("Sharath C  7.8");
		GraduateDataOperator.save("Ganesh P 6.9");
		GraduateDataOperator.displayDetails();
		System.out.println("main: information saku");
	}
}