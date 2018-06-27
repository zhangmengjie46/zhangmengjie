package com.briup.apps.poll.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.extend.QuestionnaireQuestionVM;
import com.briup.apps.poll.service.IQuestionnaireQuestionService;
import com.briup.apps.poll.util.MsgResponse;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/questionnairequestion")

public class QuestionnaireQuestionController {
	@Autowired
	private IQuestionnaireQuestionService questionnairequestionService;
	
	@ApiOperation("查询所有信息")
	
	@GetMapping("findAllQuestionnaireQuestionVM")
	public MsgResponse findAllClazzVM(){
		try {
			List<QuestionnaireQuestionVM> list=questionnairequestionService.findAllQuestionnaireQuestionVM();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

}
