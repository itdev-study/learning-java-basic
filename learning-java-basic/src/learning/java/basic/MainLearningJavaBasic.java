/*
 * learning.java.basic - the Java learning project
 */
package learning.java.basic;

public class MainLearningJavaBasic {

    public static void main(String[] args) {
        System.out.println("START LEARNING DEMO");        
        CyclesLearning cyclesobject1 = new CyclesLearning();
        cyclesobject1.cycleDoWhile(5);
        cyclesobject1.cycleWhile(7);
        cyclesobject1.cycleForInt(3);
        cyclesobject1.cycleForArray(4);
        
        ControlFlowLearning controlflowobject1 = new ControlFlowLearning();
        controlflowobject1.IfElseControl(65);
        controlflowobject1.SwitchCaseControl(9);
        
        ArraysLearning arraysLearning1 = new ArraysLearning();
        arraysLearning1.ArrayListLearning();
        
        ClassForInterfaceLearning classForInterfaceLearning1 = new ClassForInterfaceLearning();
        int cfivalue = classForInterfaceLearning1.getParameter();
        System.out.println("Value from interface:" + cfivalue);  
        
        ClassForParentLearning classForParentLearning1 = new ClassForParentLearning();
        int parentparamvalue = classForParentLearning1.GetParentParam1();
        System.out.println("Value from parent class:" + parentparamvalue);                  
        
    }
    
}
