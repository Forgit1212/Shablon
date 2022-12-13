package ru.shab.abstractFactory.website;

import ru.shab.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
	@Override
	public void writeCode() {
		System.out.println("Php developer writes php code ...");
	}

}
