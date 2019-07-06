package com.personal.springcore.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("chapters")
@Scope("prototype")
public class Chapters {
	Long chapterId;
	String chapterName;

	public Chapters(Long chapterId, String chapterName) {
		super();
		this.chapterId = chapterId;
		this.chapterName = chapterName;
	}

	public Chapters() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getChapterId() {
		return chapterId;
	}

	public void setChapterId(Long chapterId) {
		this.chapterId = chapterId;
	}

	public String getChapterName() {
		return chapterName;
	}

	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}

}
