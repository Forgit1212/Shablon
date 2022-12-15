//Этот класс реализует нашу абстрактную сущность WebsiteBuilder.

package ru.shab.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {

	@Override
	void buildName() {
		website.setName("Enterprise web site");
	}

	@Override
	void buildCms() {
		website.setCms(Cms.ALIFRESCO);
	}

	@Override
	void buildPrice() {
		website.setPrice(10000);
		
	}

}
