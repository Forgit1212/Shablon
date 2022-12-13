package ru.shab.abstractFactory.banking;

import ru.shab.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
	@Override
	public void writeCode() {
		System.out.println("Java developer writes java code ...");
	}
}
