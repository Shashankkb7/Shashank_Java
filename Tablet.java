class Tablet{
	
	static String name;
	static double price;
	static String company;
	static double priceForSheet;
	static boolean availability;
	static int rating;
	static int perDay;
	static String mftDate;
	static String expDate;
	static String intakeWith;
	static int stock;
	static boolean homeDelivery;
	static String transport;
	static String combination;
	static String inKannada;
	static boolean forChildren;
	static String mftPlace;
	
	static String[] otherCompany;
	static String[] otherTablet;
	static double[] difPrices;
	static String[] cures;
	static String[] availableIn;
	static String[] color;
	static String[] stores;
	static char[] boxSize;
	static int[] sheetSize;
	static String[] reviews;
	static String[] shapes;
	static int[] marks;
	
	
	
	static void tabletDetails(){
		
		System.out.println(name);
		System.out.println(price);
		System.out.println(inKannada);
		System.out.println(combination);
		System.out.println(company);
		System.out.println(priceForSheet);
		System.out.println(availability);
		System.out.println(mftDate);
		System.out.println(expDate);
		System.out.println(forChildren);
		System.out.println(rating);
		System.out.println(perDay);
		System.out.println(intakeWith);
		System.out.println(stock);
		System.out.println(mftPlace);
		System.out.println(transport);
		System.out.println(homeDelivery);
		
		if(otherCompany!=null){
			for(int position=0;position<otherCompany.length;position++)
			{
				String ref1=otherCompany[position];
				System.out.println(ref1);
			}
		}
		else{
			System.out.println("array is null");
			}
			
		if(otherTablet!=null){
			for(int position=0;position<otherTablet.length;position++)
			{
				String ref2=otherTablet[position];
				System.out.println(ref2);
			}
		}
		else{
			System.out.println("array is null");
			}

		if(difPrices!=null){
			for(int position=0;position<difPrices.length;position++)
			{
				double ref3=difPrices[position];
				System.out.println(ref3);
			}
		}
		else{
			System.out.println("array is zero");
			}
			
		if(cures!=null){
			for(int position=0;position<cures.length;position++)
			{
				String ref4=cures[position];
				System.out.println(ref4);
			}
		}
		else{
			System.out.println("array is null");
			}	
		
		if(availableIn!=null){
			for(int position=0;position<availableIn.length;position++)
			{
				String ref5=availableIn[position];
				System.out.println(ref5);
			}
		}
		else{
			System.out.println("array is null");
			}
			
		if(color!=null){
			for(int position=0;position<color.length;position++)
			{
				String ref6=color[position];
				System.out.println(ref6);
			}
		}
		else{
			System.out.println("array is null");
			}

		if(stores!=null){
			for(int position=0;position<stores.length;position++)
			{
				String ref7=stores[position];
				System.out.println(ref7);
			}
		}
		else{
			System.out.println("array is null");
			}

		if(boxSize!=null){
			for(int position=0;position<boxSize.length;position++)
			{
				char ref8=boxSize[position];
				System.out.println(ref8);
			}
		}
		else{
			System.out.println("array is null");
			}
			
		if(sheetSize!=null){
			for(int position=0;position<sheetSize.length;position++)
			{
				int ref9=sheetSize[position];
				System.out.println(ref9);
			}
		}
		else{
			System.out.println("array is zero");
			}
			
		if(reviews!=null){
			for(int position=0;position<reviews.length;position++)
			{
				String ref10=reviews[position];
				System.out.println(ref10);
			}
		}
		else{
			System.out.println("array is null");
			}
			
		if(shapes!=null){
			for(int position=0;position<shapes.length;position++)
			{
				String ref11=shapes[position];
				System.out.println(ref11);
			}
		}
		else{
			System.out.println("array is null");
			}

		if(marks!=null){
			for(int position=0;position<marks.length;position++)
			{
				int ref12=marks[position];
				System.out.println(ref12);
			}
		}
		else{
			System.out.println("array is null");
			}

		
	}
	
	
}	