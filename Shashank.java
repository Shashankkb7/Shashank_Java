1.Java is a platform-independent language.
 Because, we can write our code once and then run it anywhere,on any platform that provides the environment to run it.
 This environment is the Java Virtual Machine (JVM).
 The JVM is present to execute the code. The JVM is different for each platform.
 Java is platform independence does not mean that we can run the code anywhere we can run it
 wherever the environment is provided.This is the key point of platform independence in Java,
 In Java, the source code is compiled and converted into the byte code
 
2.*Primtive Data Type
	Primitive data type are pre defined in java
	Primitive has always a value
	Primitive data types start with a lowercase letter
	Primitive data types size depends on data type
	
   *Non Primitive Data Type
	Non primitive data type are not pre defined in java
	Non primitive has always null
	Non Primitive data types start with an uppercase letter
	Non Primitive data types have same size
	
3. Class is nothing but a group of object which have common properties
	 class Bullshit{

	public static void main(String[] args)
	{
		int a=20;
		System.out.println(a);
	}
	}
	
4.	public static void main(String[] args)
	public-->It is an Access Specifier
	static-->keyword
	void-->return type
	main-->method name
	(String[] args)-->parameter,String S should be in capital letter
	
5. class Percentage{
	
	public static void main(String[] marks)
	{
		int A=90;
		int B=95;
		int C=150;
		int total=(A+B);
		
		System.out.println("Sum of two subjects:"+total);
		
		float percentage=(total/c*100);
		System.out.println("total percentage obtained in exam:"+percentage);
	}
	
}

6. class RemoveDuplicates{
	public static void main(String[] args)
	{
		int[] arr={34,78,9,53,34,11,53,15,78,91,8,4,67,11};
		int len=arr.length;
		
		for(int i=0; i<len-1;i++)
		{
			for(int j=i+1; j<len-1; j++)
			{
				if(arr[i]==arr[j] && arr[i]!=-1)
				{
					arr[j]=-1;
				}
			}
			
		}
		for(int i=0; i<len-1;i++)
		{
			if(arr[i]!=-1)
				System.out.println(arr[i]);
		}
	}
}

7. class StringReverse{
	public static void main(String[] args)
	{
		String name="palle";
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.println(name.charAt(i));
		}
	}
	
}

8. class 