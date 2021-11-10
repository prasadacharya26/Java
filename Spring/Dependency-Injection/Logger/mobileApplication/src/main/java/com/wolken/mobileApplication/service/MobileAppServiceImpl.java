package com.wolken.mobileApplication.service;

import java.util.Objects;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.mobileApplication.dao.MobileAppDAO;
import com.wolken.mobileApplication.dao.MobileAppDAOImpl;
import com.wolken.mobileApplication.dto.MobileAppDTO;
import com.wolken.mobileApplication.entity.MobileAppEntity;

public class MobileAppServiceImpl implements MobileAppService {
	SessionFactory factory=null;
	

	public String validateandSave(MobileAppDTO dto) {
		
		if(dto.getId() > 0) {
			if(!dto.getAppName().equals(null) && !dto.getAppName().equals("")) {
				if(!dto.getType().equals(null)&& !dto.getType().equals("")) {
					if((dto.getSize() > 0)) {
						if(dto.getRating()>0 && dto.getRating() < 6) {
							MobileAppDAO dao = (MobileAppDAO) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("appdao");
							MobileAppEntity entity=new MobileAppEntity();
							entity.setId(dto.getId());
							entity.setAppName(dto.getAppName());
							entity.setType(dto.getType());
							entity.setSize(dto.getSize());
							entity.setRating(dto.getRating());
						
							int isSaved = dao.saveData(entity);
							if(isSaved>0) {
								return "Data Saved";
							}else {
								return "Data not saved";
							}
						}else {
							return "Invalid rating";
						}
					}else {
						return "Invalid size";
					}
				}else {
					return "Invalid Application type";
				}
			}else {
				return "Invalid Application name";
			}
		}else {
			return "Invalid Id";
		}
		
	
	}
}
