package Source;

import java.util.ArrayList;

public class AlphaSubset {

  private String mPhrase;
  private ArrayList<Character> mSubset;
  
  public AlphaSubset(String phrase){
    if (this.validate(phrase)) {
      this.mPhrase = phrase;
      this.mSubset = new ArrayList<Character>();
      // create the subset here
      for(int i=0; i<phrase.length();i++) {
        if(Character.isLetter(phrase.charAt(i)) && !mSubset.contains(phrase.charAt(i))) {
          mSubset.add(phrase.charAt(i));
        }
      }
      java.util.Collections.sort(mSubset);
    }
    else {
      this.mPhrase = "";
      this.mSubset = new ArrayList<Character>();
    }
  }
  
  public boolean compare(AlphaSubset alphaSubset) {
    return this.mSubset == alphaSubset.mSubset;
  }
  
  public String getPhrase() {
    return this.mPhrase;
  }
  
  public ArrayList<Character> getSubset(){
    return this.mSubset;
  }
  
  private boolean validate(String phrase) {
    if(phrase.contains("[") || phrase.contains("]") || phrase.contains("{") || phrase.contains("}")
      || phrase.contains("/") || phrase.contains("\\") || phrase.contains("_") || phrase.contains("+")
      || phrase.contains("=") || phrase.contains("^")){
      return false;
    }
    else {
      return true;
    }
  }
}
