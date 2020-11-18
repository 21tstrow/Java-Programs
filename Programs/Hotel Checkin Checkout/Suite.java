public class Suite extends Room 
{
  private boolean hasCouchBed;
  private boolean hasBalcony;
  private boolean hasJacuzzi;
  
  public Suite(int numPers, int numBat, boolean hasCouchBett, boolean hasBalcon, boolean hasJacuz){
    super(numPers, numBat);
    hasCouchBed = hasCouchBett;
    hasBalcony = hasBalcon;
    hasJacuzzi = hasJacuz;
  }
  
  public boolean hasCouchBed(){
    return hasCouchBed;
  }
  
  public boolean hasBalcony(){
    return hasBalcony;
  }
  
  public boolean hasJacuzzi(){
    return hasJacuzzi;
  }
  
  
}