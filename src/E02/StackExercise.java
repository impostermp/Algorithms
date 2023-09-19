package src.E02;

import java.util.Stack;

public class StackExercise {
    
    public static void main(String[] args) {
    StackExercise e02 = new StackExercise();
    System.out.println("I am: "+ e02.balPar("(())"));

    System.out.println("I am: "+ e02.balPar("())"));

    
    }

    public boolean balPar (String text){
        Stack<Character> mystack = new Stack<>();

        for (int i=0;i<text.length();i++){

            char x = text.charAt(i);
            if(x =='('||x=='{'||x=='[') {
                mystack.push(text.charAt(i));
                continue;
            }

            if(mystack.isEmpty()){
                return false;
            }
            char check = mystack.pop();

            if (x == ')' && check!='('){
                return false;
            }
            
            if (x == ']' && check!='['){
                return false;
            }
            
            if (x == '}' && check!='{'){
                return false;
            }
       
        } 
        return mystack.isEmpty();
    }
}
