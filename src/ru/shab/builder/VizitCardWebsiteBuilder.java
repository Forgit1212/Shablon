package ru.shab.builder;

public class VizitCardWebsiteBuilder extends WebsiteBuilder {

	@Override
	void buildName() {
		website.setName("VizitCard");
	}

	@Override
	void buildCms() {
		website.setCms(Cms.WORDPRESS);
	}

	@Override
	void buildPrice() {
		website.setPrice(500);
		
	}

}
