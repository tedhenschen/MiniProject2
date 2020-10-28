/*
@author Mengying Yu, Ted Henschen, Tyler Adleta, Damon Nicholas
@version 10/28/2020
This program is a simple model for trick or treating and use random number generator as well as set probabilities of receiving certain types of candy to model how a trick or treator might get candy distributed.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Pillowcase pillowcase = new Pillowcase();
    //new scanner
    Scanner s = new Scanner(System.in);
    //print
    System.out.println("Happy Halloween!");
    System.out.println("How many houses should we trick or treat at?");
    int houseCount = s.nextInt();
    
    //while loop-->use loop to get candy
    while(houseCount>0) {
      pillowcase.getCandy();
      houseCount--;
    }

    //print
    System.out.println("We have " + pillowcase.getTotalCandyNum() +" candies." );

    //call pillowcase class-->printNumCandies(object)
    pillowcase.printNumCandies();
  }
}