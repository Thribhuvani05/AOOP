package Com.Online_Auction_System;

import java.util.ArrayList;
import java.util.List;

public class Auction implements IAuction{
	
	private List<IBidder> bidders = new ArrayList<>();
    private String auctionName;

	@Override
	public void attach(IBidder bidder) {
		// TODO Auto-generated method stub
		this.auctionName = auctionName;
	}

	@Override
	public void detach(IBidder bidder) {
		// TODO Auto-generated method stub
		bidders.add(bidder);
	}

	@Override
	public void notifyBidders(String message) {
		// TODO Auto-generated method stub
		for (IBidder bidder : bidders) {
            bidder.update("Auction " + auctionName + ": " + message);
        }
	}

}
