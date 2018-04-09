/*
 * Symple Cycles Learning demo.
 */
package learning.java.basic;

public class CyclesLearning {
    
    void cycleDoWhile(int i){
      do{
         System.out.print("cycleDoWhile: Значение i: " + i );
         i--;
         System.out.print("\n");
        } while( i > 0 );
    }
    
    void cycleWhile(int i){
      int x = 10;
      while(i > 0) {            
            System.out.println("cycleWhile: Значение i: " + i);
            i--;
        }
    }
    
    void cycleForInt(int i){
      for(int x = i; x > 0; x--) {
            System.out.print("cycleForInt: Значение x: " + x + "\n");       
      } 
    }
    
    void cycleForArray(int i){
      String[] names ={"Значение1", "Значение2", "Значение3"};
        for(String name : names) {
            System.out.print(name + "\n");                       
        } 
    }
    
}
