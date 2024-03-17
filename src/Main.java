public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Иван ");
        Human human2 = new Human("Николай ");
        Human human3 = new Human("Владимир ");
        Human human4 = new Human("Сергей ");
        Human human5 = new Human("Георгий ");
        Human human6 = new Human("Михаил ");

        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        market.acceptToMarket(human5);
        market.acceptToMarket(human6);

        market.update();
    }
}