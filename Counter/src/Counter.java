/** represents a counte rwith methods */
public class Counter {
  // instance variables
  int count;
  // Methods
  public int increment(){
    this.count++;
    return this.count;
  }

  public int decrement(){
    this.count--;
    return this.count;
  }
  public int getCount(){
    return this.count;
  }
  public void reset(){
    this.count = 0;
  }
}
