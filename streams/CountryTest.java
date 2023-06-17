package com.techlabs.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.tehlabs.stream1.Country;
import com.tehlabs.stream1.Region;

public class CountryTest {

	public static void main(String[] args) {
		List<Region> regions = new ArrayList<>();
        regions.add(new Region( 1, "Europe"));
        regions.add(new Region(2, "Americas"));
        regions.add(new Region(3, "Asia"));
        regions.add(new Region(4, "Middle East and Africa"));
        
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("IT","Italy",                     1));                   
        countries.add(new Country("JP","Japan",                     3));
        countries.add(new Country("US", "United States of America", 2));
        countries.add(new Country("CA", "Canada",                   2));
        countries.add(new Country("CN", "China",                    3));
        countries.add(new Country("IN", "India",                    3));
        countries.add(new Country("AU", "Australia",                3));
        countries.add(new Country("ZW", "Zimbabwe",                 4));
        countries.add(new Country("SG", "Singapore",                3));
        countries.add(new Country("UK", "United Kingdom",           1));
        countries.add(new Country("FR", "France",                   1));
        countries.add(new Country("DE", "Germany",                  1));
        countries.add(new Country("ZM", "Zambia",                   4));
        countries.add(new Country("EG", "Egypt",                    4));
        countries.add(new Country("BR", "Brazil",                   2));
        countries.add(new Country("CH", "Switzerland",              1));
        countries.add(new Country("NL", "Netherlands",              1));
        countries.add(new Country("MX", "Mexico",                   2));
        countries.add(new Country("KW", "Kuwait",                   4));
        countries.add(new Country("IL", "Israel",                   4));
        countries.add(new Country("DK", "Denmark",                  1));
        countries.add(new Country("HK", "HongKong",                 3));
        countries.add(new Country("NG", "Nigeria",                  4));
        countries.add(new Country("AR", "Argentina",                2));
        countries.add(new Country("BE", "Belgium",                  1));



         System.out.println("Countries Regionwise:");
         regions.forEach(region -> {
        	 List<String> Countries = countries.stream()
                .filter(Country ->  Country.getCountryRegionId() == region.getRegionId())
    	        .map(Country -> Country.getCountryName())
    	        .collect(Collectors.toList());
	     System.out.println("\nRegion: " + region.getRegionName());
         System.out.println("Countries: " + Countries);
         });
   
        System.out.println("\n Countries in each Region: "); 
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Region Id:");
        int RegionId = scanner.nextInt();

	    List<Country> Countries = countries.stream()
			   .filter(Country -> Country.getCountryRegionId() == RegionId)
		       .collect(Collectors.toList());
      countries.forEach(country -> System.out.println(country.getCountryName()));
	  int CountryCount = Countries.size();
	  System.out.println("Number of countries in region : " + CountryCount);

	  
			   

	}

}
