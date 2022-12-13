package ru.shab.abstractFactory;

public interface ProjectTeamFactory {
	Developer getDeveloper();
	Tester getTester();
	ProjectManager getProjectManager();
}
