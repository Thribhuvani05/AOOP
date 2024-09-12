package Com.Online_Auction_System;

public abstract class AuctionTemplate {
	public final void conductAuction() {
        announceItem();
        startBidding();
        if (hasReservePrice()) {
            reserveAuction();
        } else {
            standardAuction();
        }
        endBidding();
        declareWinner();
    }

    protected abstract void announceItem();
    protected abstract void startBidding();
    protected abstract void endBidding();
    protected abstract void declareWinner();
    
    protected boolean hasReservePrice() {
        return false;
    }

    protected void reserveAuction() {
    }

    protected void standardAuction() {
    }
}
