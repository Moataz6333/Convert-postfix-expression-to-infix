import java.util.Stack;


public class Main {
    public static void main(String[] args) {
                    //   exp = " 34*25*+"  is equal to the infix expression (3*4)+(2*5)
        Stack<String> a = new Stack<>();
       a.push("3");
       a.push("4");
       a.push("*");
       a.push("2");
        a.push("5");
        a.push("*");
        a.push("+");
        convert(a);

        Stack<String> s = new Stack<>();
        s.push("4");
        s.push("5");
        s.push("7");
        s.push("2");
        s.push("+");
        s.push("-");
        s.push("*");
        convert(s);

    }

    public static void convert(Stack<String> value){
        Stack<String> v = new Stack<>();
       Stack<String> exp =new Stack<>();
       while(!value.isEmpty()){              //to reverse the stack
           exp.push(value.pop());
       }
        while (!exp.isEmpty()){

            char c = exp.peek().charAt(0);
            if(Character.isDigit(c))
                v.push( exp.pop());
            else{
                String c2 = v.pop();
                String c1 = v.pop();
                v.push(c1+exp.pop()+c2);
            }



        }
        System.out.println("The result is   :" + v.peek() );


    }

}