package com.wolken.tokyoOlympic.dto;

import lombok.Data;

@Data
public class OlympicDTO {
	
	private int id;
	private String countryName;
	private int rank;
	private int gold;
	private int silver;
	private int bronze;
}
