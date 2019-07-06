package com.personal.springcore.bean;

public class Team {

	Long teamId;
	String teamName;

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(Long teamId, String teamName) {
		super();
		this.teamId = teamId;
		teamName = teamName;
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		teamName = teamName;
	}

}
