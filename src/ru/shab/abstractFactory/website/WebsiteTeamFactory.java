package ru.shab.abstractFactory.website;

import ru.shab.abstractFactory.Developer;
import ru.shab.abstractFactory.ProjectManager;
import ru.shab.abstractFactory.ProjectTeamFactory;
import ru.shab.abstractFactory.Tester;


public class WebsiteTeamFactory implements ProjectTeamFactory{

	@Override
	public Developer getDeveloper() {
		return new PhpDeveloper();
	}

	@Override
	public Tester getTester() {
		return new ManualTester();
	}

	@Override
	public ProjectManager getProjectManager() {
		return new WebsitePM();
	}

}
