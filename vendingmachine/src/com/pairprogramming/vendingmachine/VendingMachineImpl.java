package com.pairprogramming.vendingmachine;

public class VendingMachineImpl implements VendingMachine{

    int currentBalance;

    @Override
    public int getPriceByItem(String inItem) throws Exception {
        if (inItem.equals("Coke"))
        {
            currentBalance = 25;
            return 25;
        }
        else if (inItem == "Pepsi")
        {
            currentBalance = 35;
            return 35;
        }
        else if (inItem == "Soda")
        {
            currentBalance = 45;
            return 45;
        }
        return 0;
    }

    @Override
    public int insertCoin(String coin, String input) {
        if (input.equals("Coke")){
            if (coin.equals("five") || coin.equals("5")){
                currentBalance -= 5;
            }
            else if (coin.equals("ten") || coin.equals("10"))
            {
                currentBalance -= 10;
            }
            else if (coin.equals("twenty") || coin.equals("20"))
            {
                currentBalance -= 20;
            }
        }
        else if (input.equals("Pepsi"))
        {
            if (coin.equals("five") || coin.equals("5")){
                currentBalance -= 5;
            }
            else if (coin.equals("ten") || coin.equals("10"))
            {
                currentBalance -= 10;
            }
            else if (coin.equals("twenty") || coin.equals("20"))
            {
                currentBalance -= 20;
            }
        }
        else if (input.equals("Soda"))
        {
            if (coin.equals("five") || coin.equals("5")) {
                currentBalance -= 5;
            }
            else if (coin.equals("ten") || coin.equals("10"))
            {
                return 35;
            }
            else if (coin.equals("twenty") || coin.equals("20"))
            {
                return 25;
            }
        }
        return Integer.parseInt(coin);
    }

    @Override
    public String refund() {
        return null;
    }

    @Override
    public String collectItemAndChange() {
        return null;
    }

    @Override
    public void printStats() {

    }

    @Override
    public String displayMenu() {
        return "Coke(25), Pepsi(35), Soda(45)";
    }
}
