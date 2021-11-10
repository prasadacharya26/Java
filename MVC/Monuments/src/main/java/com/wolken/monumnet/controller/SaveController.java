package com.wolken.monumnet.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wolken.monumnet.dao.MonumentDAO;
import com.wolken.monumnet.dto.MonumentDTO;
import com.wolken.monumnet.entity.MonumentEntity;
import com.wolken.monumnet.service.MonumentService;

@Controller
public class SaveController {
	@Autowired
	//MonumentDAO dao;
	MonumentService service;
	@RequestMapping(value="save", method = RequestMethod.POST)
	ModelAndView saveDetails(MonumentDTO dto) {
		ModelAndView view=new ModelAndView();
		System.out.println(dto);
		MonumentEntity entity=new MonumentEntity();
		//BeanUtils.copyProperties(dto, entity);
		service.validateandsave(dto);
		view.setViewName("hello");
		view.addObject("msg", "Data Saved");
		view.addObject("data", dto);
		return view;
	}
	@RequestMapping("getAll")
	ModelAndView getAll() {
		ModelAndView view=new ModelAndView("hello");
		List list=service.getAll();
		view.addObject("list", list);
		return view;
	}
}
