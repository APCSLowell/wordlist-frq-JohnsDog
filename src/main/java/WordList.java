import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int count = 0; 
    int i = 0;
    while(i < myList.size()){
      if(myList.get(i).size() == len){
         count ++;
      }
      i ++;
    }
  }

  public void removeWordsOfLength(int len)
  {
    /* to be implemented in part (b) */

  }
}
