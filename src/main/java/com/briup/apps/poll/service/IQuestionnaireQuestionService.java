package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.extend.QuestionnaireQuestionVM;

public interface IQuestionnaireQuestionService {
	
	List<QuestionnaireQuestionVM> findAllQuestionnaireQuestionVM() throws Exception;

}
