package ru.shab.abstractFactory.banking;

import ru.shab.abstractFactory.ProjectTeamFactory;
import ru.shab.abstractFactory.Developer;
import ru.shab.abstractFactory.Tester;
import ru.shab.abstractFactory.ProjectManager;

public class BankingTeamFactory implements ProjectTeamFactory{

	@Override
	public Developer getDeveloper() {
		return new JavaDeveloper();
	}

	@Override
	public Tester getTester() {
		return new QATester();
	}

	@Override
	public ProjectManager getProjectManager() {
		return new BankingPM();
	}

}
