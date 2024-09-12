package Com.Online_Auction_System;

public class AuctionSystem_Main {
	public static void main(String[] args) {
        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");
        Bidder bidder3 = new Bidder("Charlie");

        Auction auction = new Auction();

        auction.attach(bidder1);
        auction.attach(bidder2);
        auction.attach(bidder3);

        System.out.println("Starting a Standard Auction:");
        AuctionTemplate standardAuction = new StandardAuction();
        auction.notifyBidders("Auction is starting.");
        standardAuction.conductAuction();
        auction.notifyBidders("Auction has ended.");

        System.out.println("\nStarting a Reserve Auction:");
        AuctionTemplate reserveAuction = new ReserveAuction();
        auction.notifyBidders("Auction is starting.");
        reserveAuction.conductAuction();
        auction.notifyBidders("Auction has ended.");

        auction.detach(bidder2);
        auction.notifyBidders("Bob has left the auction.");

        System.out.println("\nStarting another Standard Auction with remaining bidders:");
        AuctionTemplate anotherStandardAuction = new StandardAuction();
        auction.notifyBidders("Another auction is starting.");
        anotherStandardAuction.conductAuction();
        auction.notifyBidders("Auction has ended.");
    }
}
