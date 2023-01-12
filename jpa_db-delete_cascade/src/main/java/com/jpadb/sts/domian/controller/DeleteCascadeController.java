package com.jpadb.sts.domian.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpadb.sts.domian.service.DeleteCascadeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class DeleteCascadeController {
	private final DeleteCascadeService deleteCascadeService;
	
	@PostMapping("/personSave")
	public String savePerson(@RequestBody HashMap<String, String> condition) {
		return deleteCascadeService.savePerson(condition);
	}
}
