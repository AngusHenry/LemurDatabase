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
public class DesertLemur extends Lemur {
    private String facts;
    public DesertLemur() {
    facts = "\n" +
    " - they obtain water from cacti;\n" +
    " - their white coats reflect the desert heat;\n" +
    " - two-thirds of the babies die due to puncture wounds from the cacti.";
  }
    public String getfacts(){
      return facts;
  }
}
