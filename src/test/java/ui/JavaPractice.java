package ui;

public class JavaPractice {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hi ,my name is Navamita!");

            System.out.println(s.reverse());


        // replace
        String str = "Hello";
        String t1 = str.replace('e', 'i');
        System.out.println(t1);

        //lowercase
        String upper = "navamita ghosh";
        System.out.println(upper.toUpperCase());

        String lower = "SEPTEMBER";
        System.out.println(lower.toLowerCase());

        String len = "length";
        StringBuffer cap = new StringBuffer("capacity");
        System.out.println(len.length());
        System.out.println(cap.capacity());
        System.out.println(cap.charAt(2));
        cap.setLength(3);
        //cap.setCharAt(3);

        //append
        String x;
        int a = 42;
        StringBuffer sb = new StringBuffer();
        x = sb.append("a=").append("!").append(".").toString();
        System.out.println(x);

        //insert
        StringBuffer str1 = new StringBuffer("I Java");
        str1.insert(2, "love ");
        System.out.println(str1);

        //loop
        String string = "Navamita";
        StringBuffer sb1 = new StringBuffer(string);
        String reverse = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reverse = reverse + string.charAt(i);
        }
        System.out.println(reverse);


    }
}
