class VehicleRunner
{
	public static void main(String[] vikram)
	{
		int distance=Vehicle.transportation(34);
		System.out.println("distance  :"+distance+"km");

	byte time=Vehicle.transportation(8.45f);
	System.out.println("fastest time  :"+time+"minutes");
	
	double price=Vehicle.transportation(23,"annapurneswari");
	
	System.out.println("price of bus  :"+price+"lacks");
	return;
	}
}