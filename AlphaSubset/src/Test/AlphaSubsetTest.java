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
    expected.add('a');
    expected.add('b');
    expected.add('c');
    expected.add('d');
    expected.add('e');
    
    Assertions.assertArrayEquals(expected.toArray(), subset.toArray());
  }
  
  @Test
  void findComplexSubset() {
    AlphaSubset test1 = new AlphaSubset("bcdddfgh");
    ArrayList<Character>subset = test1.getSubset();
    
    ArrayList<Character>expected = new ArrayList<Character>();
    expected.add('b');
    expected.add('c');
    expected.add('d');
    expected.add('f');
    expected.add('g');
    expected.add('h');
    
    Assertions.assertArrayEquals(expected.toArray(), subset.toArray());
  }
  
  @Test
  void findUnorderedSubset() {
    AlphaSubset test1 = new AlphaSubset("edcba");
    ArrayList<Character>subset = test1.getSubset();
    
    ArrayList<Character>expected = new ArrayList<Character>();
    expected.add('a');
    expected.add('b');
    expected.add('c');
    expected.add('d');
    expected.add('e');
    
    Assertions.assertArrayEquals(expected.toArray(), subset.toArray());
  }
}
