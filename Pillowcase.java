/*
@author Mengying Yu, Ted Henschen, Tyler Adleta, Damon Nicholas
@version 10/28/2020
*/

//import arraylist
import java.util.ArrayList;
import java.util.Random;

/**
The pillowcase class keeps track of the amount and type of candy collected
*/
class Pillowcase {
  private ArrayList<Candy> candyBag;
  private int totalCandyNum;

  /**
  Pillow case constructor method
  */
  Pillowcase() {
    candyBag = new ArrayList<Candy>();
    totalCandyNum = 0;
  }
  /**
  accessor method
  @return the total number of candies in the pillowcase
  */
  int getTotalCandyNum() {
    return totalCandyNum;
  }

  /**
  get candy method duses a random number generator to determine the type of candy we get and adds it to the bag.
  */
  void getCandy() {
    System.out.println("Trick or Treat!");
    Random r = new Random();//random number object
    int randomInt = r.nextInt(100) + 1;
    int randomIntCandyBonus = r.nextInt(100)+1;
    


   // System.out.println(randomInt);
    Candy candy;
    if (randomInt>=1 && randomInt<=7) {
      candy = new Candy("Kit Kat");
    }
    else if (randomInt>=8 && randomInt<=15) {
      candy = new Candy("Milky Way");
    }

    else if (randomInt>=16 && randomInt<=25) {
      candy = new Candy("M&M");
    }

    else if (randomInt>=26 && randomInt<=50) {
      candy = new Candy("Reese's");
    }
    else if (randomInt>=51 && randomInt<=63) {
      candy = new Candy("Twix");
    }
    else if (randomInt>=64 && randomInt<=80) {
      candy = new Candy("Hershey's Bar");
    }
    else {
      candy = new Candy("Pink Starburst");
    }

    /**
    ten percent of the time the trick or treater gets a bonus candy
    */
    if (randomIntCandyBonus>=10 && randomIntCandyBonus <=20){
      totalCandyNum++;
      System.out.println("Congrats, you got an extra candy! woo hoo!");
    }
    
    candyBag.add(candy);
    totalCandyNum++;
    

  }

  /**
  PrintNumCandies method prints the total number of each type of candy in the bag.
  */
  void printNumCandies() {
    int candyCount[] = new int[7];
    /* 
    0 --> Kit Kat
    1 --> Milky Way
    2 --> M&M
    3 --> Reese'S
    4 --> Twix 
    5 --> Hershey's Bar 
    6 --> Pink Starburst
    */

    for (Candy i : candyBag) {
      if (i.getName().equals("Kit Kat")){
        candyCount[0]++;
      }
      else if (i.getName().equals("Milky Way")){
        candyCount[1]++;
      }

      else if (i.getName().equals("M&M")){
        candyCount[2]++;
      }

      else if (i.getName().equals("Reese's")){
        candyCount[3]++;
      }

      else if (i.getName().equals("Twix")){
        candyCount[4]++;
      }

      else if (i.getName().equals("Hershey's Bar")){
        candyCount[5]++;
      }

      else {
        candyCount[6]++;
      }
    }
    //print
    System.out.println("We got ...");
    if (candyCount[0]!=0) {
      System.out.println(candyCount[0]+ " Kit Kat");
    }
    if (candyCount[1]!=0) { 
      System.out.println(candyCount[1]+ " Milk Way");
    }
    if (candyCount[2]!=0) {
      System.out.println(candyCount[2]+ " M&M");
    }
    if (candyCount[3]!=0) {
      System.out.println(candyCount[3]+ " Reese's");
    }
    if (candyCount[4]!=0) {
      System.out.println(candyCount[4]+ " Twix");
    }
    if (candyCount[5]!=0) {
      System.out.println(candyCount[5]+ " Hershey's Bar");
    }
    if (candyCount[6]!=0) {
      System.out.println(candyCount[6]+ " Pink Starburst");
    }

  }
}