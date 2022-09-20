class CardRunner{
	
	public static void main(String[] pin)
	{
		
		Card.type="Debit";
		Card.height=10;
		Card.width=15;
		Card.price=1500D;
		String[] colors={"Black","Red","Brown","Gold","Blue","Yellow"};
		Card.color=colors;
		Card.displayDetails();
		
	}
}