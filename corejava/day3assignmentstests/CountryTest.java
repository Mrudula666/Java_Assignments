package corejava.day3assignmentstests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import corejava.day3assignments.Country;

public class CountryTest {
	private Country india;
	private Country japan;
	private Country germany;
	private Country england;
	private Country france;
	Country[] countryArray = new Country[5];//for Country array;

	@Before
	public void setUp(){
		india = new Country("India",12100000,32870000);
		japan = new Country("Japan",1268000,377972);
		germany = new Country("Germany",8280000 ,357386);
		england = new Country("England",5480000,130395);
		france = new Country("France",6710000,643801);
		countryArray[0] = india;
		countryArray[1] = japan;
		countryArray[2] = germany;
		countryArray[3] = england;
		countryArray[4] = france;
	}

	@Test
	public void testforCountryWithLargestArea() {
		String countryWithLargestArea = Country.getCountryWithLargestArea(countryArray);
		System.out.println("Details of country with largest Area: "+countryWithLargestArea);
		assertEquals("Country [ name=India, population=12100000, area=32870000]", countryWithLargestArea);
	}
	@Test
	public void testforCountryWithLargestPopulation() {
		String countryWithLargestPopulation = Country.getCountryWithLargestPopulation(countryArray);
		System.out.println("Details of country with largest Population: "+countryWithLargestPopulation);
		assertEquals("Country [ name=India, population=12100000, area=32870000]", countryWithLargestPopulation);
	}
	
	@Test
	public void testforCountryWithLargestPopulationDensity() {
		String countryWithLargestPopulationDensity = Country.getCountryWithLargestPopulationDensity(countryArray);
		System.out.println("Details of country with largest Population Density: "+countryWithLargestPopulationDensity);
		assertEquals("Country [ name=England, population=5480000, area=130395]", countryWithLargestPopulationDensity);
	}

}
