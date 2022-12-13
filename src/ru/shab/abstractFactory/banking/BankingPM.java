package ru.shab.abstractFactory.banking;

import ru.shab.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
	@Override
	public void manageProject() {
		System.out.println("Banking PM manages banking project ...");
	}
}
