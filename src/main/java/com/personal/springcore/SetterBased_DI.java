package com.personal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.personal.springcore.bean.Team;
import com.personal.springcore.bean.TeamMember;

public class SetterBased_DI {

	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("beans-definition-setter-based-di.xml");

		TeamMember teamMember = appContext.getBean("teamMember", TeamMember.class);
		System.out.println("Team memebers team Name =" + teamMember.getTeam().getTeamName());

		Team team = appContext.getBean("team", Team.class);
		System.out.println("Team Name = " + team.getTeamName());

		appContext.close();

	}
}
