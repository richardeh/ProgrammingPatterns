package Observer;

public interface Observer{
    public Observer(){
    }
    
    public void onNotify(Entity entity, Event event){}
    
}
