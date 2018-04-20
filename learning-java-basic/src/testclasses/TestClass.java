package testclasses;
//Version TestAlfa4
// Must commited to the GIT
class TestClass {  
  public static void main(String args[]) {  
    double inches, meters;
    int counter;
    counter = 128;
    String text;
    text = "abc";

    //System.out.println(text);
    TestClass2 objabc;
  objabc = new TestClass2();
  objabc.printwhile("dsz");
  objabc.printfor("def");
  objabc.printdo("ZZZ");
  }  
}

class TestClass2 {  
    double inches, meters;
    int test;
    String textfieldofclass;
    
    void printwhile(String textinputofmethod){
      int a = 0;
      String textfieldofmethod;
      textfieldofmethod = "abc";
      textfieldofclass = textinputofmethod + textfieldofmethod;
        while(a < 10) {            
            System.out.println(textfieldofclass);
            textfieldofclass = textfieldofclass + textfieldofmethod;
            a++;
        }      
   } 
    
    void printfor(String textinputofmethod){
      int a = 0;
      String[] names ={"Значение1", "Значение2", "Значение3", "Значение4"};
      String textfieldofmethod;
      textfieldofmethod = "abc";
      textfieldofclass = textinputofmethod + textfieldofmethod;
        for(int x = 10; x < 15; x = x+1) {
            System.out.print("Значение x: " + x );            
        }    
       
        for(String name : names) {
            System.out.print(name + textfieldofclass);
            System.out.print("\n");            
        }         
   }  
     
    void printdo(String textinputofmethod){
      int x = 10;
      do{
         System.out.print("Значение х: " + x );
         x++;
         System.out.print("\n");
      } while( x < 15 );
    }
}
