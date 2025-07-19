package stringdemo;
public class StringBuilderDemo {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // char at index 0
        // System.out.println(sb.charAt(0));

        // set char at index
        // sb.setCharAt(0, 'B');
        // System.out.println(sb);

        // insert
        // sb.insert(0, "S"); 
        // System.out.println(sb);

        // delete
        // sb.delete(0, 2);
        // System.out.println(sb);

        // append
        StringBuilder sb = new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
 
        for(int i=0; i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i; //5-1-0=4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);



    }
}
