class MixerGrinder{
	public static void main(String[] grind)
	{
		System.out.println("entering the MixerGrinder main method");
		{
			String brand=Mixer.brand;
			String color=Mixer.color;
			String material=Mixer.material;
			int price=Mixer.price;
			int revolutions=Mixer.revolutions;
			double depth=Mixer.depth;
			short width=Mixer.width;
			float height=Mixer.height;
			
			System.out.println(brand);
			System.out.println(color);
			System.out.println(material);
			System.out.println(price);
			System.out.println(revolutions);
			System.out.println(depth);
			System.out.println(width);
			System.out.println(height);
		}
	}
}