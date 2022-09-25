class ProductRunner{

     public static void main (String[]  Product)
 {
     System.out.println("Cheking the product information");
	 System.out.println("information:"+Product.length);
     String ref=Product[0];
	 String ref1=Product[1];
	 String ref2=Product[2];
	 String ref3=Product[3];
	 String ref4=Product[4];
	  
	 
	 System.out.println(" Product name:"+ref);
	 System.out.println("Product price:"+ref1);
	 System.out.println("Product type:"+ref2);
	 System.out.println("Product quality:"+ref3);
	 System.out.println("Prducct quantity:"+ref4);
	 
     int convertedprice=Integer.parseInt(ref1);
	 System.out.println("converted price:"+convertedprice);
	 if(convertedprice>=7000)
	 {
		 System.out.println("its very cost dont buy");
	 }
	 else
	 {
		 System.out.println("its a fair price buy it");
	 }
 
     boolean convertedquality=Boolean.parseBoolean(ref3);
	 System.out.println("convertedquality:"+convertedquality);
	 if(convertedquality==true)
	 {
		 System.out.println("quality check by the ITC");
	 }
     else
	 {
		 System.out.println("quality is not good");
	 }
	 float convertedquantity=Float.parseFloat(ref4);
	 System.out.println("convertedquantity:"+convertedquantity);
	 if(convertedquantity<=3000)
	 {
		 System.out.println("Standard quantity");
	 }
	 else
	 {
		 System.out.println("quality check is bad");
	 }
	 
	 double totalPrice=(convertedprice+convertedquantity);
	 if(totalPrice>=5000)
	 {
		 System.out.println("Overall Product is goood");
	 }
	 else
	 {
		 System.out.println("Product is bad");
	 }
	
 }

}