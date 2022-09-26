class FoodItemsDataOperatorRunner{
	public static void main(String[] breakfast)
	{
		System.out.println("main:start aytu");
		FoodItemsDataOperator.save("Palav");
		FoodItemsDataOperator.save("Dose");
		FoodItemsDataOperator.displayDetails();
		System.out.println("main:mugitu");
	}
}