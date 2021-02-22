package ClassWork.Task1;

public class Address
{
	private int index;
	private String country;
	private String city;
	private String street;
	private String house;
	private String apartment;

	public Address(int index, String country, String city, String street, String house, String apartment)
	{
		setIndex(index);
		setCountry(country);
		setCity(city);
		setStreet(street);
		setHouse(house);
		setApartment(apartment);
	}

	private String capitalize(String text)
	{
		// TODO capitalize strings with spaces
		return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
	}

	public int getIndex()
	{
		return index;
	}

	public void setIndex(int index)
	{
		if (index >= 1000 && index <= 99999) { this.index = index; }
		else { this.index = -1; }
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = capitalize(country);
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = capitalize(city);
	}

	public String getStreet()
	{
		return street;
	}

	public void setStreet(String street)
	{
		this.street = street;
	}

	public String getHouse()
	{
		return house;
	}

	public void setHouse(String house)
	{
		this.house = house;
	}

	public String getApartment()
	{
		return apartment;
	}

	public void setApartment(String apartment)
	{
		this.apartment = apartment;
	}

	@Override
	public String toString()
	{
		return (index > 0 ? String.format("%05d", index) : "n/a") +
				", " + country +
				", " + city +
				(!street.equals("") ? ", " + street : ", n/a") +
				(!house.equals("") ? ", " + house : ", n/a") +
				(!apartment.equals("") ? ", " + apartment : "");
	}
}