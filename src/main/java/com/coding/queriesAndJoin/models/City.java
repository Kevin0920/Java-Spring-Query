package com.coding.queriesAndJoin.models;



import javax.persistence.*;

@Entity
@Table(name="cities")
public class City {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String country_code;
	private String district;
	private Integer population;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="country_id")
	private Country country;
	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public City() {	
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Integer getPopulation() {
		return population;
	}


	
	
	
}
