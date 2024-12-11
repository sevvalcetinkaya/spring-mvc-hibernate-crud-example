package com.lab5.entity;


import javax.persistence.*;

@Entity
public class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private String colour;
    private String bloom_season;
    private String plant_type;
    private int price;

    public int getId() {
        return Id;
    }

	public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBloom_season() {
		return bloom_season;
	}

	public void setBloom_season(String bloom_season) {
		this.bloom_season = bloom_season;
	}

	public String getPlant_type() {
		return plant_type;
	}

	public void setPlant_type(String plant_type) {
		this.plant_type = plant_type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

  
}
