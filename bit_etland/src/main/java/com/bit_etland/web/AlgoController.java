package com.bit_etland.web;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit_etland.web.service.AlgoService;

@Controller
@RequestMapping("/algo")
public class AlgoController {
	static final Logger logger = LoggerFactory.getLogger(AlgoController.class);
	
	@Autowired AlgoService algoService;
	@Autowired Map<String, Object> map;
	@RequestMapping(value="/seq/{questNum}",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> sequence(
			@PathVariable String questNum,
			@RequestBody Map<String, Object> param
			){
		logger.info("\n --------- AlgoController {} !! ----------","sequence");
		
		map = new HashMap<String,Object>();
		String start = (String) param.get("start");
		String end = (String) param.get("end");
		String diff = (String) param.get("diff");
		System.out.println(start+end+diff+"+++++++++++++++");
		map.put("startNum", start);
		map.put("endNum", end);
		map.put("diff", diff);
		String result = algoService.sequence(map);
		map.put("result", result);
		return map;
	}

}
