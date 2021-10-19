package com.wolken.market.dao;

import com.wolken.market.dto.MarketDetailsDTO;

public interface MarketDetailsDAO {
	
	boolean save(MarketDetailsDTO dto);

	void displayAll();

	boolean displayOne(MarketDetailsDTO dto);

	boolean update(MarketDetailsDTO dto);

	boolean delete(MarketDetailsDTO dto);
	
}
