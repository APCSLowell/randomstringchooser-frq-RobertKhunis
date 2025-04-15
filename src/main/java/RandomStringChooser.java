import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList<String> = new ArrayList<String>();

  public RandomStringChooser(String[] s){
    for(int i = 0; i < s.length; i++){
      bob.add(s[i]);
    }
  }

public String getNext(){
  if(bob.size() > 0){
    int k = (int)(Math.random() * bob.size());
    return bob.remove(k);
  }
  return "NONE";
}
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
