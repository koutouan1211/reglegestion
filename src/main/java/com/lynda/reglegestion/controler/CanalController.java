package com.lynda.reglegestion.controler;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lynda.reglegestion.dto.ParametreTransaction;
import com.lynda.reglegestion.service.ParametreService;


@RestController
@RequestMapping("/canal")
public class CanalController {

	private final ParametreService parametreService;
	public CanalController(ParametreService parametreService) {
		this.parametreService=parametreService;
	}

	
	@PostMapping
	public String getRequestChannel(@RequestBody ParametreTransaction request) {
		return parametreService.channelRule(request);
		
	}
}
