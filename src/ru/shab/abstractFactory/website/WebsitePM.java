package ru.shab.abstractFactory.website;

import ru.shab.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
	@Override
	public void manageProject() {
		System.out.println("Website PM manages website project ...");
	}

}
