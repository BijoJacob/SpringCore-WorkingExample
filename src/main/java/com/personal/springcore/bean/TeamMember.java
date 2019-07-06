package com.personal.springcore.bean;

public class TeamMember {

	Long teamMemverId;
	String teamName;
	Team team;
	
	
	
	public TeamMember(Long teamMemverId, String teamName, Team team) {
		super();
		this.teamMemverId = teamMemverId;
		this.teamName = teamName;
		this.team = team;
	}
	public TeamMember(Team team) {
		super();
		this.team = team;
	}
	public TeamMember() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getTeamMemverId() {
		return teamMemverId;
	}
	public void setTeamMemverId(Long teamMemverId) {
		this.teamMemverId = teamMemverId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}

	
	
}
