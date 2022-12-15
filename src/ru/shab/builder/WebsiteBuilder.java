//Нам нужна сущность, с помощью которой мы могли бы конструировать наш сайт.
//Задача этого класса создавать сайты, которые нам необходимы.

package ru.shab.builder;

public abstract class WebsiteBuilder {
	Website website;
	
	void createWebsite() {
		website = new Website();
	}
	
	abstract void buildName();
	
	abstract void buildCms();
	
	abstract void buildPrice();
	
	Website getWebsite() {
		return website;
	}
	
}
