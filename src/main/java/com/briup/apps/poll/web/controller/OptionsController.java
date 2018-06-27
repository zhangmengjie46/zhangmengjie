package com.briup.apps.poll.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.briup.apps.poll.bean.extend.OptionsVM;
import com.briup.apps.poll.service.IOptionsService;
import com.briup.apps.poll.util.MsgResponse;

import io.swagger.annotations.Api;

@Api(description="相关接口")

@RestController
@RequestMapping("/options")

public class OptionsController {
	
	@Autowired
	private IOptionsService optionsService;
	
	@GetMapping("findAllOptionsVM")
	public MsgResponse findAllOptionsVM(){
		try {
			List<OptionsVM> list=optionsService.findAllOptionsVM();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

}
