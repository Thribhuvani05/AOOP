package Com.Online_Auction_System;

public class ReserveAuction extends AuctionTemplate {

	@Override
	protected void announceItem() {
		// TODO Auto-generated method stub
		System.out.println("Announcing item for reserve auction.");
	}

	@Override
	protected void startBidding() {
		// TODO Auto-generated method stub
		System.out.println("Bidding started for reserve auction.");
	}

	@Override
	protected void endBidding() {
		// TODO Auto-generated method stub
		System.out.println("Bidding ended for reserve auction.");
	}

	@Override
	protected void declareWinner() {
		// TODO Auto-generated method stub
		System.out.println("Declaring winner for reserve auction.");
	}
	protected void reserveAuction() {
        System.out.println("Handling reserve price logic.");
    }

}
