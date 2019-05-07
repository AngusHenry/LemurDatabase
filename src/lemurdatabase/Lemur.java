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
public class Lemur extends Mammal{
  private String location;
  private String coat;
  private String classification;
  
  public Lemur() {
    coat = "Fur";
    location = "Madagascar";
    classification = "Prosimian";
  }
  public String getlocation() {
    return location;
  }
  public String getcoat() {
    return coat;
  }
  public String getclassification() {
    return classification;
  }
}
