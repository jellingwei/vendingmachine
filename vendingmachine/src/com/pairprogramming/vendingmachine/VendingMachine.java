package com.pairprogramming.vendingmachine;

public interface VendingMachine {
    // return price of item
    public int getPriceByItem(String inItem) throws Exception;

    // vm should keep track of cumulative amount
    public int insertCoin(String coin, String input);

    // vm should be able to refund
    public String refund();

    // calculate change and return item selected
    public String collectItemAndChange();

    public void printStats();

    public String displayMenu();


}
