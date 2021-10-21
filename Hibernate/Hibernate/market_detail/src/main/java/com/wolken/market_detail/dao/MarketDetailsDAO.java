package com.wolken.market_detail.dao;

import com.wolken.market_detail.entity.MarketDetailEntity;

public interface MarketDetailsDAO {

	boolean save(MarketDetailEntity entity);

	boolean getById(int id);

	boolean updateById(MarketDetailEntity entity);

	boolean deleteById(MarketDetailEntity entity);

}
