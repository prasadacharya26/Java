package com.wolken.market.dao;

import com.wolken.market.dto.MarketDetailsDTO;

public interface MarketDetailsDAO {
	
	boolean save(MarketDetailsDTO dto);

	void displayAll();

	boolean displaybylocation(String name);

	boolean updatebyname(String name,int shops);

	boolean deletebyId(int id);
	
}
