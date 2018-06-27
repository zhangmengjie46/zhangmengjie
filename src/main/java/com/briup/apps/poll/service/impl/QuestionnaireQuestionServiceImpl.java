package com.briup.apps.poll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.extend.QuestionnaireQuestionVM;
import com.briup.apps.poll.dao.extend.QuestionnaireQuestionVMMapper;
import com.briup.apps.poll.service.IQuestionnaireQuestionService;

@Service

public class QuestionnaireQuestionServiceImpl implements IQuestionnaireQuestionService {
	@Autowired
	private QuestionnaireQuestionVMMapper questionnairequestionVMMapper;

	@Override
	public List<QuestionnaireQuestionVM> findAllQuestionnaireQuestionVM() throws Exception {
		
		return questionnairequestionVMMapper.selectAll();
	}

}
