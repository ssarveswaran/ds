import java.util.Stack;

class stack {
public static void main(String args[]){
    //push-->for adding
    //pop-->for removing
    //peak-->for getting a upper one
    //search-->for gettinng a index number
    //if result is in -1 it means that the number not have in the stack
    
    Stack<Integer> stack=new Stack<>() ;
    stack.push(2);
    stack.push(3);
    stack.pop();
    System.out.println(stack);
  
    System.out.print(stack.search(3));
    


    

}
}
