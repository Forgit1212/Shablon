package ru.shab.abstractFactory.website;

import ru.shab.abstractFactory.Tester;

public class ManualTester implements Tester {
	@Override
	public void testCode() {
		System.out.println("Manual tester tests website ...");
	}
}
