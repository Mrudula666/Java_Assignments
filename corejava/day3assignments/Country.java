/**
 * 
 */
package corejava.day3assignments;

/**
 * @author mrnimmal
 * Define a class Country that stores the name of the country, its population, and its area. 
 * Using that class, write a test program that creates a few countries and stores them in an array and then prints

	The country with the largest area
	The country with the largest population
	The country with the largest population density (people per square mile)

	NOTE: Write appropriate TestCases.
 *
 */
public class Country {
	private String name;
	private long population;
	private long area;
	//non argumented constructor.
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	//argumented constructer.
	public Country(String name, long population, long area) {
		super();
		this.name = name;
		this.population = population;
		this.area = area;
	}
	//setters and getters for country class.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public long getArea() {
		return area;
	}
	public void setArea(long area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Country [ name=" + name + ", population="
				+ population + ", area=" + area + "]";
	}
	//method to check largest area
	/**
		* The country with the largest area
	**/
	public static String getCountryWithLargestArea(Country[] countryArray) {
		String largestAreaCountry = "";
		for(int i=0;i<countryArray.length;i++){
			for(int j=i+1;j<countryArray.length;j++){
				if(countryArray[i].getArea()>=countryArray[j].getArea()){
					Country temporaryCountryObject = countryArray[i];
					countryArray[i] = countryArray[j];
					countryArray[j] = temporaryCountryObject;
				}
			}
		}
		largestAreaCountry = countryArray[4].toString();//assigning the largest country in terms of area to String variable.
		return largestAreaCountry.trim();
	}
	/**
	 * The country with the largest population
	**/
	public static String getCountryWithLargestPopulation(Country[] countryArray) {
		String largestPopulationCountry = "";
		for(int i=0;i<countryArray.length;i++){
			for(int j=i+1;j<countryArray.length;j++){
				if(countryArray[i].getPopulation()>=countryArray[j].getPopulation()){
					Country temporaryCountryObject = countryArray[i];
					countryArray[i] = countryArray[j];
					countryArray[j] = temporaryCountryObject;
				}
			}
		}
		largestPopulationCountry = countryArray[4].toString();//assigning the largest country in terms of population to String variable.
		return largestPopulationCountry.trim();
	}
	/**
		The country with the largest population density (people per square mile)
	*
	 */
	public static String getCountryWithLargestPopulationDensity(
			Country[] countryArray) {
		String largestPopulationDensityCountry = "";
		for(int i=0;i<countryArray.length;i++){
			for(int j=i+1;j<countryArray.length;j++){
				if((countryArray[i].getPopulation()/countryArray[i].getArea())>=(countryArray[j].getPopulation()/countryArray[j].getArea())){
					Country temporaryCountryObject = countryArray[i];
					countryArray[i] = countryArray[j];
					countryArray[j] = temporaryCountryObject;
				}
			}
		}
		largestPopulationDensityCountry = countryArray[4].toString();//assigning the largest country in terms of population density to String variable.
		return largestPopulationDensityCountry.trim();
	}
	
}
