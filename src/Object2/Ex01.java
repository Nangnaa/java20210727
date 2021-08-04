package Object2;

public class Ex01 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        for (int i = 0; i < deck.cards.length; i++) {
            System.out.println(deck.cards[i] + ",");
        }
    }

}

class SutdaCard{
    int num; boolean isKwang;

    public SutdaCard(){ this (1,true);}
    public SutdaCard(int, boolean isKwang){this.num = num; this.isKwang = isKwang;}

    @Override
    public String toString() {
        return num + (isKwang? "K":"");
    }
}

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    SutdaDeck{
        for (int i = 0; i < cards.length; i++) {
            cards[i] = new SutdaCard(i%10+1,i<10 && (i+1 ==1 || i+1 ==3 || i+1==8)?"true":"false");
            
        }
    }
    public void deckList(){
        for (int i = 0; i < cards.length; i++) {
            if(i!=0) System.out.print(",");
            System.out.print(cards[i]);
            if()
        }
    }
}


