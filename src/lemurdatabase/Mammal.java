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
public class Mammal {
  private int itsAge;
  private int itsWeight;
  private String breed;
  private int gender;

  public Mammal() {
    itsAge = (int) (Math.random() * 20);
    itsWeight = (int)(Math.random() * 5);
    breed = "lemur";
    gender = (int) (Math.random() * 2);
  }

  public int getAge() {
    return itsAge;
  }

  public int getWeight() {
    return itsWeight;
  }
    public String getBreed() {
    return breed;
  }
      public int getGender(){
          int newGender = (int)(Math.random() * 2);
    if (newGender == 1){
        gender = 1;
    }
    else
    {
        gender = 2;
    }
      return gender;
  }

  public void setAge(int newAge) {
    itsAge = newAge;
  }

  public void setWeight(int newWeight) {
    itsWeight = newWeight;
  }


  public void setBreed(String newBreed) {
    breed = newBreed;
  }
  
    public void setgender(int newGender) {
     newGender = (int)(Math.random() * 2);
    if (newGender == 1){
        gender = 1;
    }
    else
    {
        gender = 2;
    }
  }

  public void speak() {
    //will be overwritten by Dog class and Cat class
  }
}
