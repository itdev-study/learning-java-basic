/*
 * To change this license header, choose License Headers in Project Properties.
 */
package learning.java.basic;

public class ClassForInterfaceLearning implements InterfaceLearning {
    int TestCounter2 = 5;
    @Override
    public String getClassName() {
        return null;        
    }
    
    @Override
    public int getParameter() {
        TestCounter2++;
        return TestCounter2 + TestCounter;      
    }       
}
