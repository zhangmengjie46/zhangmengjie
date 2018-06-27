package com.briup.apps.poll.bean.extend;

import com.briup.apps.poll.bean.Question;
import com.briup.apps.poll.bean.Questionnaire;

public class QuestionnaireQuestionVM {
	private Long id;
	private Questionnaire questionnaire_id;
	private Question question_id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Questionnaire getQuestionnaire_id() {
		return questionnaire_id;
	}
	public void setQuestionnaire_id(Questionnaire questionnaire_id) {
		this.questionnaire_id = questionnaire_id;
	}
	public Question getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(Question question_id) {
		this.question_id = question_id;
	}

}
