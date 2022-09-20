class TabletRunner{
public static void main(String[] args){
	
	Tablet.name="Dolo650";
	Tablet.price=6d;
	Tablet.inKannada="Dolo matre";
	Tablet.combination="mudde";
	Tablet.company="Micro labs";
	Tablet.priceForSheet=3d;
	Tablet.availability=true;
	Tablet.mftDate="12/05/2021";
	Tablet.expDate="19/06/2024";
	Tablet.forChildren=false;
	Tablet.rating=6;
	Tablet.perDay=2;
	Tablet.intakeWith="water";
	Tablet.stock=3000;
	Tablet.mftPlace="hyderabad";
	Tablet.transport="lorry";
	Tablet.homeDelivery=true;
	
	String[] ary1={"Cipla","para lab"};
	Tablet.otherCompany=ary1;
	
	String[] ary2={"nicip","paracetamol"};
	Tablet.otherTablet=ary2;
	
	double[] ary3={2.5d,3.0d,3.5d};
	Tablet.difPrices=ary3;
	
	String[] ary4={"Head ache","Fever"};
	Tablet.cures=ary4;
	
	String[] ary5={"India","UK","UAE"};
	Tablet.availableIn=ary5;
	
	String[] ary6={"Blue","white"};
	Tablet.color=ary6;
	
	String[] ary7={"Apollo","Medplus"};
	Tablet.stores=ary7;
	
	char[] ary8={'s','l'};
	Tablet.boxSize=ary8;
	
	int[] ary9={10,30,60};
	Tablet.sheetSize=ary9;
	
	String[] ary10={"Good","okay","better"};
	Tablet.reviews=ary10;
	
	String[] ary11={"round","oval"};
	Tablet.shapes=ary11;
	
	int[] ary12={8,9,7};
	Tablet.marks=ary12;
	
	Tablet.tabletDetails();
	
	
}


}