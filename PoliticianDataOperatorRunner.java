class PoliticianDataOperatorRunner{
	public static void main(String[] politics)
	{
		System.out.println("main :start aytu");
		String politician1="Basavaraj Bommai";
		PoliticianDataOperator.save("Narendra Modi");
		PoliticianDataOperator.save("BS Yediyurappa");
		PoliticianDataOperator.save("Amit Shah");
		PoliticianDataOperator.displayDetails();
		System.out.println("main:mugitu");
	}
}