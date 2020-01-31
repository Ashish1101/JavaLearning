 /* enum dir {East , West , North, South;}
enum dirs {East, North, West , South}
declartion of enumators are of two types 
it can be declared inside the class as well as outside the class*/
enum dir {East, West, North, South}
class Enumator {
  
//enumator as a consturctor
enum dress {jeans(1), Pant(2), Shirt(3);
private int x;
private dress(int y) {
    x = y;
}}


public static void main(String[] args) {
    // for ( dir d : dir.values()) {
    //     System.out.println(d);
    // }

    for (dress d : dress.values()) {
        System.out.println(d + " " + d.x);
        
    }

}

}