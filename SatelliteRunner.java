class SatelliteRunner{
	
	public static void main(String[] moon)
	{
		System.out.println("Running main method");
		Satellite.rotate();
		Satellite.force();
		Satellite.irregular();
		Satellite.regular();
		Satellite.altitude();
		Satellite.coorbitalSatellites();
		Satellite.shape();
		Satellite.size();
		Satellite.tidalLocking();
		Satellite.atmosphere();
		Satellite.mass();
		Satellite.refelectsLight();
	}
}