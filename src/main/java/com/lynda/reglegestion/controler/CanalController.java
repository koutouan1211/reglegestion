package com.lynda.reglegestion.controler;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lynda.reglegestion.dto.ParametreTransaction;

@RestController
@RequestMapping("/canal")
public class CanalController {

	@PostMapping
	public String getRequestChannel(@RequestBody ParametreTransaction request) {
		
		return null;
	}
}
