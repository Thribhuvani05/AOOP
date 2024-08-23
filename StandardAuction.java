package Com.Online_Auction_System;

public class StandardAuction extends AuctionTemplate{

	@Override
	protected void announceItem() {
		// TODO Auto-generated method stub
		System.out.println("Announcing item for standard auction.");
	}

	@Override
	protected void startBidding() {
		// TODO Auto-generated method stub
		System.out.println("Bidding started for standard auction.");
	}

	@Override
	protected void endBidding() {
		// TODO Auto-generated method stub
		System.out.println("Bidding ended for standard auction.");
	}

	@Override
	protected void declareWinner() {
		// TODO Auto-generated method stub
		System.out.println("Declaring winner for standard auction.");
	}

}
