package com.wolken.tokyoOlympic.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.tokyoOlympic.dao.OlympicDAO;
import com.wolken.tokyoOlympic.dto.OlympicDTO;
import com.wolken.tokyoOlympic.entity.OlympicEntity;

public class OlympicServiceImpl implements OlympicService {

	public String validateandsave(OlympicDTO dto) {
		if(dto.getId()>0) {
  			if(!dto.getCountryName().equals(null) && !dto.getCountryName().equals("")) {
  				if(dto.getRank()>0) {
  					if(dto.getGold()>=0) {
  						if(dto.getSilver()>=0) {
  							if(dto.getBronze()>=0) {
  								OlympicDAO dao =  (OlympicDAO) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("dao");
  		  						OlympicEntity entity=new OlympicEntity();
  		  						entity.setId(dto.getId());
  		  						entity.setCountryName(dto.getCountryName());
  		  						entity.setRank(dto.getRank());
  		  						entity.setGold(dto.getGold());
  		  						entity.setSilver(dto.getSilver());
  		  						entity.setBronze(dto.getBronze());
  		  						int row=dao.save(entity);
  		  						if(row>0) {
  		  							return "data saved";
  		  						}else {
  		  							return "data not saved";
  		  						}
  		  					}else {
  		  						return "invalid number of bronze medal";
  		  					}
  	  					}else {
  	  						return "invalid number of silver medal";
  	  					}
  					}else {
  						return "invalid number of gold medal";
  					}
  				}else {
  					return "invalid rank";
  				}
  			}else {
  				return "invalid country name";
  			}
  		}else {
  			return "invalid id";
  		}
	}

}
