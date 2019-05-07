/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;

/**
 *
 * @author anhen3335
 */
public class TreeLemur extends Lemur{
    private String facts;
    public TreeLemur() {
    facts = "\n" +
    " - they travel in large groups;\n" +
    " - they eat fruit;\n" +
    " - they have a red mane";
  }
    public String getfacts(){
      return facts;
  }
}
