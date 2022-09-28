class BillionairesRunner{
	
	public static void main(String[] money)
	{
		System.out.println("Main start aytu");
		Billionaires.save("Elon Musk");
		Billionaires.save("Jeff Bezos");
		Billionaires.save("Gautam Adani");
		Billionaires.save("Bernard Arnault");
		Billionaires.save("Bill Gates");
		Billionaires.save("Warren Buffett");
		Billionaires.save("Larry Ellison");
		Billionaires.save("Larry Page");
		Billionaires.save("Mukesh Ambani");
		Billionaires.save("Sergery Brin");
		Billionaires.displayDetails();
		boolean ref=Billionaires.findBillionaires("Bill Gates");
		System.out.println("Billionaires found:"+ref);
		
		Billionaires.update("Larry Page","Steve Ballmer");
		Billionaires.displayDetails();
		
		Billionaires.update(5,"Steve Ballmer");
		Billionaires.displayDetails();
		
		String del1=Billionaires.delete("Warren Buffett");
		System.out.println("Deleted:"+del1);
		Billionaires.displayDetails();
		
		boolean del2=Billionaires.delete(7);
		System.out.println("Deleted:"+del2);
		Billionaires.displayDetails();
		
		System.out.println("main mugitu");
		
		
	}
}