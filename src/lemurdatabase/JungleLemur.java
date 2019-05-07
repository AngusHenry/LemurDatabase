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
public class JungleLemur extends Lemur {
  private String facts;
  public JungleLemur() {
    facts = "\n" +
    " - they have black or blue coats;\n" +
    " - they have no mane;\n" +
    " - they travel in small groups;\n" +
    " - they eat mice, snails, and insects";
  }
  public String getfacts(){
      return facts;
  }
}
