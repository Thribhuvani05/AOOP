package Com.Online_Auction_System;

public interface IAuction {
	void attach(IBidder bidder);
    void detach(IBidder bidder);
    void notifyBidders(String message);
}
