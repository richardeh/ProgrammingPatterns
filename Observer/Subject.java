package Observer;

public interface Subject{

  private ArrayList<Observer> observers;
  
  public void addObserver(Observer observer){}
  public void removeObserver(Observer observer){}

  protected void notify(Entity entity, Event event){
    for(Observer o:observers{
      o.onNotify(entity, event);
    }
  }
  
}
