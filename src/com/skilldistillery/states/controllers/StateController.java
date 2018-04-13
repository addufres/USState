package com.skilldistillery.states.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.states.data.StateDAO;

@Controller
public class StateController {
	@Autowired
	StateDAO stateDAO;

	public void setStateDAO(StateDAO stateDAO) {
		this.stateDAO = stateDAO;
	}

	@RequestMapping(params="name",path = "GetStateData.do", method = { RequestMethod.GET })
	public ModelAndView getStateByName(@RequestParam("name") String name) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("WEB-INF/result.jsp");
		mv.addObject("state", stateDAO.getStateByName(name));
		return mv;
	}

	@RequestMapping(params="abbr", path = "GetStateData.do", method = { RequestMethod.GET })
	public ModelAndView getStateByAbbr(@RequestParam("abbr") String abbr) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("WEB-INF/result.jsp");
		mv.addObject("state", stateDAO.getStateByAbbreviation(abbr));
		return mv;
	}
}
