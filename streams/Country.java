package com.techlabs.streams;

public class Country {
	private String CountryAbbreviation;
	private String CountryName;
	private  int CountryRegionId;
	public Country(String countryAbbreviation, String countryName, int countryRegionId) {
		super();
		CountryAbbreviation = countryAbbreviation;
		CountryName = countryName;
		CountryRegionId = countryRegionId;
	}
	public String getCountryAbbreviation() {
		return CountryAbbreviation;
	}

	public String getCountryName() {
		return CountryName;
	}
	
	public  int getCountryRegionId() {
		return CountryRegionId;
	}
}


