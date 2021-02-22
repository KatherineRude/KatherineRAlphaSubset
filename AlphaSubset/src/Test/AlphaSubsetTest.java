/**
 * 
 */
package Test;

import Source.AlphaSubset;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author Katherine Rude
 *
 */
class AlphaSubsetTest {
  
  @Test
  void constructorTest() {
    AlphaSubset test1 = new AlphaSubset("The cow jumped over the moon");
    Assertions.assertNotNull(test1);
  }

  
  @Test
  void findSimpleSubset() {
    AlphaSubset test1 = new AlphaSubset("abcde");
    ArrayList<Character>subset = test1.getSubset();
    
    ArrayList<Character>expected = new ArrayList<Character>();
    expected.add('A');
    expected.add('B');
    expected.add('C');
    expected.add('D');
    expected.add('E');
    
    Assertions.assertArrayEquals(expected.toArray(), subset.toArray());
  }
  
  @Test
  void findRepeatedSubset() {
    AlphaSubset test1 = new AlphaSubset("bcdddfgh");
    ArrayList<Character>subset = test1.getSubset();
    
    ArrayList<Character>expected = new ArrayList<Character>();
    expected.add('B');
    expected.add('C');
    expected.add('D');
    expected.add('F');
    expected.add('G');
    expected.add('H');
    
    Assertions.assertArrayEquals(expected.toArray(), subset.toArray());
  }
  
  @Test
  void findUnorderedSubset() {
    AlphaSubset test1 = new AlphaSubset("edcba");
    ArrayList<Character>subset = test1.getSubset();
    
    ArrayList<Character>expected = new ArrayList<Character>();
    expected.add('A');
    expected.add('B');
    expected.add('C');
    expected.add('D');
    expected.add('E');
    
    Assertions.assertArrayEquals(expected.toArray(), subset.toArray());
  }
  
  @Test
  void findUnorderedRepeatedSubset() {
    AlphaSubset test1 = new AlphaSubset("edadccebbbba");
    ArrayList<Character>subset = test1.getSubset();
    
    ArrayList<Character>expected = new ArrayList<Character>();
    expected.add('A');
    expected.add('B');
    expected.add('C');
    expected.add('D');
    expected.add('E');
    
    Assertions.assertArrayEquals(expected.toArray(), subset.toArray());
  }
  
  @Test
  void findSentanceSubset() {
    AlphaSubset test1 = new AlphaSubset("the cow jumped over the moon");
    ArrayList<Character>subset = test1.getSubset();
    
    ArrayList<Character>expected = new ArrayList<Character>();
    expected.add('C');
    expected.add('D');
    expected.add('E');
    expected.add('H');
    expected.add('J');
    expected.add('M');
    expected.add('N');
    expected.add('O');
    expected.add('P');
    expected.add('R');
    expected.add('T');
    expected.add('U');
    expected.add('V');
    expected.add('W');
    
    Assertions.assertArrayEquals(expected.toArray(), subset.toArray());
  }
  
  @Test
  void findSentanceSubset2() {
    AlphaSubset test1 = new AlphaSubset("a fox got bored");
    ArrayList<Character>subset = test1.getSubset();
    
    ArrayList<Character>expected = new ArrayList<Character>();
    expected.add('A');
    expected.add('B');
    expected.add('D');
    expected.add('E');
    expected.add('F');
    expected.add('G');
    expected.add('O');
    expected.add('R');
    expected.add('T');
    expected.add('X');
    
    Assertions.assertArrayEquals(expected.toArray(), subset.toArray());
  }
  
  @Test
  void capitalsTest() {
    AlphaSubset test1 = new AlphaSubset("ThE CoW jUmPeD OvEr ThE mOoN");
    ArrayList<Character>subset = test1.getSubset();
    
    ArrayList<Character>expected = new ArrayList<Character>();
    expected.add('C');
    expected.add('D');
    expected.add('E');
    expected.add('H');
    expected.add('J');
    expected.add('M');
    expected.add('N');
    expected.add('O');
    expected.add('P');
    expected.add('R');
    expected.add('T');
    expected.add('U');
    expected.add('V');
    expected.add('W');
    
    Assertions.assertArrayEquals(expected.toArray(), subset.toArray());
  }
  
  @Test
  void allowedSymbolsTest() {
    AlphaSubset test1 = new AlphaSubset("!()$&%");
    String expected = "!()$&%";
    
    String result = test1.getPhrase();
    
    Assertions.assertEquals(expected, result);
  }
  
  @Test
  void unallowedSymbolsTest() {
    AlphaSubset test1 = new AlphaSubset("[]{}^_<>");
    String expected = "";
    
    String result = test1.getPhrase();
    
    Assertions.assertEquals(expected, result);
  }
  
  @Test
  void emptyStringTest() {
    AlphaSubset test1 = new AlphaSubset("");
    String expected = "";
    
    String result = test1.getPhrase();
    
    Assertions.assertEquals(expected, result);
  }
  
  @Test
  void emptyStringTest2() {
    AlphaSubset test1 = new AlphaSubset("   ");
    String expected = "   ";
    
    String result = test1.getPhrase();
    
    Assertions.assertEquals(expected, result);
  }
  
  @Test
  void specialSymbolTest() {
    AlphaSubset test1 = new AlphaSubset("\n\r\0");
    ArrayList<Character>subset = test1.getSubset();
    
    ArrayList<Character>expected = new ArrayList<Character>();
    
    Assertions.assertArrayEquals(expected.toArray(), subset.toArray());
  }
  
  @Test
  void mixedTest() {
    AlphaSubset test1 = new AlphaSubset("The cow(the one from before) also jumped over the sun & stars!");
    ArrayList<Character>subset = test1.getSubset();
    
    ArrayList<Character>expected = new ArrayList<Character>();
    expected.add('A');
    expected.add('B');
    expected.add('C');
    expected.add('D');
    expected.add('E');
    expected.add('F');
    expected.add('H');
    expected.add('J');
    expected.add('L');
    expected.add('M');
    expected.add('N');
    expected.add('O');
    expected.add('P');
    expected.add('R');
    expected.add('S');
    expected.add('T');
    expected.add('U');
    expected.add('V');
    expected.add('W');
    
    
    Assertions.assertArrayEquals(expected.toArray(), subset.toArray());
  }
  
  @Test
  void nullTest() {
    AlphaSubset test1 = new AlphaSubset(null);
    String expected = "";
    
    String result = test1.getPhrase();
    
    Assertions.assertEquals(expected, result);
  }
}
