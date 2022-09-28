class Billionaires{
	
	static String[] billionairesNames={null,null,null,null,null,null,null};
	static int position=0;
	static void save(String name)
	{
		System.out.println("save:nadita ide");
		
		if(position>7)
		{
			System.err.println("Billionaires name exceed");
			return;
		}
		if(name!=null && name.length()>=3)
		{
		billionairesNames[position]=name;
		System.out.println("Saved Billionaires name:"+ name +"at position:"+position);
		position++;
		System.out.println("Next position of ref"+position);
		System.out.println("save: mugitu");
		}
		else
		{
		System.out.println("Billionaires name is not null");
		}
	}
	
	static void displayDetails()
	{
		for(int index=0;index<billionairesNames.length;index++)
		{
			String ref=billionairesNames[index];
			System.out.println("elements:"+ref);
		}
	}
	
	static boolean findBillionaires(String name)
	{
			System.out.println("finding Billionaires :"+ name);
			for(int find=0;find<billionairesNames.length;find++)
			{
				
			String ref=billionairesNames[find];
			if(ref==name)
				{
					System.out.println("Billionaires found:"+ name);
					return true;
				}
			}
			return false;
			
	}
	
	static String update(String oldName,String newName)
	{
	if(oldName!=null && newName!=null)
	{
		System.out.println("Billionaires update name is not null");
		for(int index=0;index<billionairesNames.length;index++)
		{
			String ref=billionairesNames[index];
			if(oldName==ref)
			{
				System.out.println("Billionaires update:"+ref+" at index:"+index+" updated :"+newName);
				oldName=newName;
			}
		}	
	}
	else
		{
		System.out.println("Data invalid");	
	}
	return null;
	}
	static String update(int index,String newName)
	{
	if(newName!=null)
	{
		System.out.println("Billionaires update name is not null");
		for(int change=0;change<billionairesNames.length;change++)
		{
			String ref=billionairesNames[change];
			if(newName!=ref)
			{
				System.out.println("Billionaires update:"+ref+" at change:"+change+" updated :"+newName);
				billionairesNames[change]=newName;
				return newName;
			}
		}
		
	}
	else{
		
			System.out.println("Data invalid");
		}
	return null;
	}
	static String delete(String name)
	{
	if(name!=null)
	{
		System.out.println("Billionaires name is not null");
		for(int index=0;index<billionairesNames.length;index++)
		{
			String ref=billionairesNames[index];
			if(name==ref)
			{
				System.out.println("Billionaires delete:"+ref+" at index:"+index+" updated :"+name);
				return ref;
			}
		}	
	}
	else
	{
		System.out.println("Data invalid");
	}
	return null;
	}
	static boolean delete(int index)
	{
	if(billionairesNames[index]!=null)
	{
		System.out.println("Billionaires name is not null");
		String ref=billionairesNames[index];
			{
				System.out.println("Billionaires delete:"+ref+" at index:"+index+" updated :"+ref);
				return true;
			}
	}
	else
	{
		System.out.println("Data invalid");
	}
	return false;
	}	
}