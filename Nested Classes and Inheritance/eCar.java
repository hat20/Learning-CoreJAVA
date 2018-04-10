class eCar
{
	float startKilometer,endKilometer,liters;

	eCar(float a, float b, float c)
	{
		startKilometer = a;
		endKilometer = b;
		liters = c;
	}
	
	float calcKPL()
	{
		return ((endKilometer - startKilometer)/liters);
	}

	boolean powerfulCar()
	{
	if(calcKPL() < 10)
		return true;
	else
		return false;
	}

	boolean economyCar()
	{
	if(calcKPL() > 15)
		return true;
	else
		return false;
	}
}