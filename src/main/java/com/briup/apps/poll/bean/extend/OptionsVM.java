package com.briup.apps.poll.bean.extend;

import com.briup.apps.poll.bean.Question;

public class OptionsVM {
	private Long id;
	private String label;
	private String name;
	private String score;
	private Question question_id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public Question getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(Question question_id) {
		this.question_id = question_id;
	}
	

}
