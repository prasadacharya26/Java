package com.wolken.mobile_details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wolken.mobile_details.dto.MobileDTO;
import com.wolken.mobile_details.entity.MobileEntity;
import com.wolken.mobile_details.service.MobileService;

@Controller
public class MobileController {
	@Autowired
	MobileService service;
	@RequestMapping(value="save", method = RequestMethod.POST)
	ModelAndView saveDetails(MobileDTO dto) {
		ModelAndView view=new ModelAndView();
		System.out.println(dto);
		String result=service.validateandsave(dto);
		view.setViewName("result");
		view.addObject("msg", result);
		return view;
	}
	
	@RequestMapping("getByBrandName")
	ModelAndView getByBrand(MobileDTO dto) {
		ModelAndView view=new ModelAndView("message");
		List list=service.getbyBrand(dto.getBrandName());
		view.addObject("list", list);
		return view;
	}
	
	@RequestMapping("filterByPrice")
	ModelAndView filterByPrice(MobileDTO dto) {
		ModelAndView view=new ModelAndView("message");
		List list=service.getbyPrice(dto.getPrice());
		view.addObject("list", list);
		return view;
	}
	
	@RequestMapping("getbyBrand")
	ModelAndView getByBrand() {
		ModelAndView view=new ModelAndView();
		view.setViewName("getbyBrand");
		return view;
	}
	
	@RequestMapping("updatePrice")
	ModelAndView updatePrice(MobileDTO dto) {
		ModelAndView view=new ModelAndView("result");
		MobileEntity entity=service.updatePriceByModelNo(dto.getModelNo(),dto.getPrice());
		view.addObject("msg", "Data Updated");
		return view;
	}
	
	@RequestMapping("updateAvailability")
	ModelAndView updateAvailability(MobileDTO dto) {
		ModelAndView view=new ModelAndView("result");
		MobileEntity entity=service.updateAvailabilityByModelName(dto.getModelName(),dto.getAvailabele());
		view.addObject("msg", "Data Updated");
		return view;
	}
	
	@RequestMapping("getbyPrice")
	ModelAndView getbyPrice() {
		ModelAndView view=new ModelAndView();
		view.setViewName("getbyPrice");
		return view;
	}
	@RequestMapping("saveData")
	ModelAndView save() {
		ModelAndView view=new ModelAndView();
		view.setViewName("addMobileDetails");
		return view;
	}
	@RequestMapping("index")
	ModelAndView homePage() {
		ModelAndView view=new ModelAndView();
		view.setViewName("index");
		return view;
	}
	@RequestMapping("updatePriceByModelno")
	ModelAndView updatePrice() {
		ModelAndView view=new ModelAndView();
		view.setViewName("updatePriceByModelno");
		return view;
	}
	@RequestMapping("updateAvailabilityByModelname")
	ModelAndView updateAvailability() {
		ModelAndView view=new ModelAndView();
		view.setViewName("updateAvailabilityByModelname");
		return view;
	}
}
