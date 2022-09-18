class Person{
	
	static void work(String company,double salary)
	{
		System.out.println("entered work String,double");
		System.out.println("company: "+company);
		System.out.println("salary: "+salary);
		if(company=="Capgemini" &&   salary==35000)
		{
			System.out.println("company and salary: "+company + salary);
		}
	}
	static void work(String company,double salary,String designation)
	{
		System.out.println("entered work String,double,String");
		System.out.println("company: "+ company);
		System.out.println("salary: "+ salary);
		System.out.println("designation: "+ designation);
		if(company=="Xworkz" && salary==40000 && designation=="Trainee")
		{
			System.out.println("company and salary and designation:"+company + salary + designation);
		}
	}
}	