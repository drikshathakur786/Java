package stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        Stack<Integer> stack= new Stack<>();
        stack.push(1); // jb apko stack mai cheze dalni hoti h
        stack.push(2);
        
        stack.pop(); // removes last element added
        stack.peek(); // agr apko bs dekhna h ki top pe rkha kya hai
        stack.isEmpty();

        stack.search(2); // 1 based indexing hai. upr se 2nd wala element

    }
    
}

/*

jab hum cheezo ko ek k upr ek rkh dete hain toh vo stack hai

last in first out principle(lifo) - last item jo add hua h vo sbse phela item hoga jo remove hoga
eg- cookies ka stack h, phele sbse upr wali cookie khaoge fr uske neeche wali then last mai sbse last wali


agr apko aisi situation ati h ki apko lifo behaviour cahiye , then u use stack

Since, stack extends vector, it is synchronized making it thread safe

*/ 