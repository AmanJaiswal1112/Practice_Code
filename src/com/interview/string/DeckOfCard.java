package com.interview.string;

import java.util.HashMap;
import java.util.Map;

public class DeckOfCard {
    public static void main(String[] args) {

        Cards cards = new Cards(new Suit("Heart") ,new Rank("ace") );
        Cards cards2 = new Cards(new Suit("club") ,new Rank("king") );

       // prepareData();
        Cards biggerCard = findBiggerCard(cards ,cards2);
        System.out.println("biggest card    " + biggerCard.getSuit().toString() + " " + biggerCard.getRank().toString());


        printCard(cards);
    }

    private static void printCard(Cards c) {
        String suitType= c.getSuit().getSuitType();

        Rank.getOrderMapByRank().forEach((k, v)->
        {
            System.out.println(suitType+ " "+k);
        });




    }

    private static Cards findBiggerCard(Cards cards1, Cards cards2) {
        String rankCard1 = cards1.getRank().getVal();
        String rankCard2 = cards2.getRank().getVal();

        if(Rank.getOrderMapByRank().get(rankCard1) > Rank.getOrderMapByRank().get(rankCard2))
            return cards1;
        else
            return cards2;



    }
}


class Cards{

    private Suit suit;
    private Rank rank;

    @Override
    public String toString() {
        return "Cards{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }

    public Cards(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}

class Suit{
   private String suitType;

    public static Map<String, Integer>  getOrderMapBySuitType() {
        Map<String, Integer> map = new HashMap<>();
        map.put("heart" ,4 );
        map.put("spade" ,3 );map.put("club" ,2 );map.put("diamond" ,1 );
        return map;
    }

    @Override
    public String toString() {
        return "Suit{" +
                "suitType='" + suitType + '\'' +
                '}';
    }

    public Suit(String suitType) {
        this.suitType = suitType;
    }

    public String getSuitType() {
        return suitType;
    }

    public void setSuitType(String suitType) {
        this.suitType = suitType;
    }
}

class Rank{

    private String val;

    @Override
    public String toString() {
        return "Rank{" +
                "val='" + val + '\'' +
                ", orderMap=" + orderMap +
                '}';
    }

    public static Map<String, Integer>  getOrderMapByRank() {
        Map<String, Integer> map = new HashMap<>();
        map.put("ace" ,14 );
        map.put("king" ,13 );map.put("queen" ,12 );map.put("Jack" ,11 );
        map.put("10" ,10 );



        return map;
    }

    Map<String, Integer> orderMap= new HashMap<>();

    public Rank(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
