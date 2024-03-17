public abstract class Actor implements ActorBehavoir{
    protected final String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    public abstract String getName();
    public Actor(String name){
        this.name = name;
    }
}
