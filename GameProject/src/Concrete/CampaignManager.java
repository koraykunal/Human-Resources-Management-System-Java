package Concrete;

import java.util.ArrayList;

import Abstract.ICampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements ICampaignService{

	ArrayList<Campaign> campaigns = new ArrayList<Campaign>();
	@Override
	public void add(Campaign campaign) {
		campaigns.add(campaign);
		System.out.println("Campaign added : " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated : " + campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		campaigns.remove(campaign);
		System.out.println("Campaign deleted : " + campaign.getCampaignName());
		
	}

}
