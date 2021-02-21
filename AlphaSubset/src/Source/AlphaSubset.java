package Source;

import java.util.ArrayList;

public class AlphaSubset {

  private String mPhrase;
  private ArrayList<Character> mSubset;
  
  AlphaSubset(String phrase){
    if (this.validate()) {
      this.mPhrase = phrase;
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
      this.mSubset = null;
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
  
  private boolean validate() {
    if(this.mPhrase.contains("[") || this.mPhrase.contains("]") || this.mPhrase.contains("{") || this.mPhrase.contains("}")
      || this.mPhrase.contains("/") || this.mPhrase.contains("\\") || this.mPhrase.contains("_") || this.mPhrase.contains("+")
      || this.mPhrase.contains("=") || this.mPhrase.contains("^")){
      return false;
    }
    else {
      return true;
    }
  }
}
