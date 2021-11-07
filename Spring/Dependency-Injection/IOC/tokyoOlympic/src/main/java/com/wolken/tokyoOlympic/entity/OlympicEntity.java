package com.wolken.tokyoOlympic.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tokyoolympics")
public class OlympicEntity {
	@Id
	private int id;
	private String countryName;
	private int rank;
	private int gold;
	private int silver;
	private int bronze;
}
