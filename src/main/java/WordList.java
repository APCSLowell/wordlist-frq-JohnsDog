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
    int i = myList.size();
      while(i > 0){
        if(myList.get(i).size() == len){
            myList.remove(i);
        }
        i --;
      }
  }
}
