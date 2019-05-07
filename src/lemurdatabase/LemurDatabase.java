/*
 * Angus Henry
 * 01/05/2019
 * this program compiles a database of lemurs
 */

package lemurdatabase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author anhen3335
 */
public class LemurDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int lemurnum, lemurtype;
        String lemur, gender; 
        
        System.out.println ("how many lemurs do you want:");
        lemurnum = input.nextInt();
        ArrayList <String> lemurs = new ArrayList();
        int i = 1; 
        int x;
        while (i <= lemurnum){
            System.out.println("What type of lemur do you want to add \n"
            + "1: Jungle lemur \n"
            + "2: Desert lemur \n"
            + "3: Tree lemur");
            lemurtype = input.nextInt();
            x = 0;
            while (x == 0){
                lemur = "";
            if (lemurtype == 1){
                // Jungle lemur
               JungleLemur junlemur = new JungleLemur ();
               if (junlemur.getGender() == 2){
                  gender = "female";
               }
               else{
                   gender = "male";
               }
               lemur = "Jungle Lemur \n" +
                       "Age: " + junlemur.getAge() + "\n"
                       + "Weight: " + junlemur.getWeight() + "kg" + "\n"
                       + "Gender: " + gender + "\n"
                       + "Location: " + junlemur.getlocation() + "\n"
                       + "Classification: " + junlemur.getclassification()+ "\n"
                       + "Coat: " + junlemur.getcoat() + "\n"
                        + "Facts:" + junlemur.getfacts() + "\n";
               Collections.addAll (lemurs, lemur);
               x = 1;
                i++;   
            }
            else if (lemurtype == 2){
               // Desert Lemur
                DesertLemur deslemur = new DesertLemur ();
               if (deslemur.getGender() == 2){
                  gender = "female";
               }
               else{
                   gender = "male";
               }
               lemur = "Desert Lemur \n" +
                       "Age: " + deslemur.getAge() + "\n"
                       + "Weight: " + deslemur.getWeight() + "kg" + "\n"
                       + "Gender: " + gender + "\n"
                       + "Location: " + deslemur.getlocation() + "\n"
                       + "Classification: " + deslemur.getclassification()+ "\n"
                       + "Coat: " + deslemur.getcoat() + "\n"
                        + "Facts:" + deslemur.getfacts() + "\n";
               Collections.addAll (lemurs, lemur);
               
               x = 1;
                i++;
            }
            else if (lemurtype == 3){
                //Tree lemur
                TreeLemur trelemur = new TreeLemur ();
               if (trelemur.getGender() == 2){
                  gender = "female";
               }
               else{
                   gender = "male";
               }
               lemur = "tree Lemur \n" +
                       "Age: " + trelemur.getAge() + "\n"
                       + "Weight: " + trelemur.getWeight() + "kg" + "\n"
                       + "Gender: " + gender + "\n"
                       + "Location: " + trelemur.getlocation() + "\n"
                       + "Classification: " + trelemur.getclassification()+ "\n"
                       + "Coat: " + trelemur.getcoat() + "\n"
                        + "Facts:" + trelemur.getfacts() + "\n";
               Collections.addAll (lemurs, lemur);
                x = 1;
                i++;
            }  
            else {
                System.out.println ("Unacceptable, you must try again.");
                lemurtype = input.nextInt();    
            }
            }
            System.out.println ("hi");
            System.out.println (lemurs);
    }
    }
    
}