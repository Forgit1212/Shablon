//Этот класс определяет, какой именно сайт мы будем создавать

package ru.shab.builder;

public class Director {
	WebsiteBuilder builder;

	public void setBuilder(WebsiteBuilder builder) {//сеттер для builder
		this.builder = builder;
	}
	
	Website buildWebsite() {//метод, который будет возвращать определенный вебсайт
		builder.createWebsite();
		builder.buildName();
		builder.buildCms();
		builder.buildPrice();
		
		Website website = builder.getWebsite();
		
		return website;
	}
}
