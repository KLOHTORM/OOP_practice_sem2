public class Human extends Actor{
    public Human(String name){
    super(name);
}
    @Override
    public String getName() {  //setter
        return super.name;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {  //setter
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {  //setter
        super.isTakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder(){  //getter
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder(){  //getter
        return super.isTakeOrder;
    }
}
