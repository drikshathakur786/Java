package conditional;

public class Test {
    public static void main(String[] args) {

        // realtional operators: >, <, ==, /, !=, >= (greater than equal to), <=
        int a=1;
        int b=2;
        boolean result= a<b;
        System.out.println(result);

        // exam: 100 marks, passing marks=33
        int ramMarks=35;
        System.out.println(ramMarks>=33);

        // exam: 100 marks, passing marks=33, age should be 18
        int ramMarks=35;
        int ramAge=50;
        // ab apne 2 conditions jodni h toh logical operators use krenge
        System.out.println(ramMarks>=33 && ramAge<=18);

        String name="Ram";
        int experi=2;
        boolean tier1= true;
        boolean cond1= experi>=5;
        System.out.println(tier1 || cond1); // logical OR mai boolean expression check hoti h
        // agr tier1 true hogya toh cond1 tk jaega hee ni. agr phela false hoga tbhi dusra check hoga

        System.out.println(!(2<3));

    }
    
}

/*

RELATIONAL OPERATORS- compares two values and return a boolean result

LOGICAL OPERATORS- combine 2 conditions. &&  ||  !
- logical and mai dono conditions true honi cahiye pr logical or mai koi ek true


 */