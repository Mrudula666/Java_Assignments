package com.cg.training.assignments.basiccollections;

public class SchoolClass {
	/**
	 * 
	 * @param name
	 * @param city
	 * @param district
	 * @param ranking
	 */
	private String name;
	private String city;
	private String district;
	private int ranking;

	public SchoolClass(String name, String city, String district, int ranking) {
		this.name = name;
		this.city = city;
		this.district = district;
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return "SchoolClass [name=" + name + ", city=" + city + ", district=" + district + ", ranking=" + ranking + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((district == null) ? 0 : district.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SchoolClass other = (SchoolClass) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}
