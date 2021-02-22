package Source;

import java.util.ArrayList;

public class AlphaSubset {

  private String mPhrase;
  private ArrayList<Character> mSubset;
  
  public AlphaSubset(String phrase){
    if (phrase != null && this.validate(phrase)) {
      this.mPhrase = phrase;
      String phraseUpper = phrase.toUpperCase();
      this.mSubset = new ArrayList<Character>();
      for(int i=0; i<phraseUpper.length();i++) {
        if(Character.isLetter(phraseUpper.charAt(i)) && !mSubset.contains(phraseUpper.charAt(i))) {
          mSubset.add(phraseUpper.charAt(i));
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
      || phrase.contains("=") || phrase.contains("^") || phrase.contains("<") || phrase.contains(">")){
      return false;
    }
    else {
      return true;
    }
  }
}
