class GroceryStoreRunner
{
	public static void main(String[] grocery)
	{
		GroceryStore.setType("Dal");
		GroceryStore.setShopName("bigBazzar");
		GroceryStore.setPrice(3500);
		GroceryStore.setQuantity(2);
		GroceryStore.setAvailable(true);
		GroceryStore.setName("oats");
		GroceryStore.setItems("flour");
		GroceryStore.setNessecity(false);
		GroceryStore.setName2("Milk,cream,yogurt");
		GroceryStore.setItems2("honey");
		GroceryStore.setSoap('M');
		GroceryStore.setOilQuantity(4);
		GroceryStore.setSnacks(true);
		GroceryStore.setSnackType("pasta,maggie,chocolate");
		
		String type=GroceryStore.getType();
		String shopName=GroceryStore.getShopName();
		double price=GroceryStore.getPrice();
		int quantity=GroceryStore.getQuantity();
		boolean available=GroceryStore.getAvailable();
		String name=GroceryStore.getName();
		String items=GroceryStore.getItems();
		boolean nessecity=GroceryStore.getNessecity();
		String name2=GroceryStore.getName2();
		String items2=GroceryStore.getItems2();
		char soap=GroceryStore.getSoap();
		int oilQuantity=GroceryStore.getOilQuantity();
		boolean snacks=GroceryStore.getSnacks();
		String snackType=GroceryStore.getSnackType();
		if(type=="Dal" && shopName=="bigBazzar" && price==3500 && quantity==2 && available==true && name=="oats" && items=="flour" 
		&& nessecity==false && name2=="Milk,cream,yogurt" && items2=="honey" && soap=='M' && oilQuantity==4 && snacks==true && snackType=="pasta,maggie,chocolate")
		{
			System.out.println("Grocery sigutte");
		}
		else
		{
			System.out.println("grocery sigalla");
		}
	}
}