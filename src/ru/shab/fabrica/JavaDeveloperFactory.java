package ru.shab.fabrica;

public class JavaDeveloperFactory implements DeveloperFactory{
	@Override
	public Developer createDeveloper() {
		return new JavaDeveloper();
	}
}
