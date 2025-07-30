public class StringExample {
    public static void main(String[] args) {
        String str = "Hello World!";//Literal String ,it would create String object
        String str1 = new String("Hello World");//By using Constructor ,also creates String obj
        String str2 ="Hello World!";//it would not create a new String object,it is stored in string constant pool
        String str3 = new String("Hello World");

        if(str==str2){
            System.out.println("Both have same memory area");
        }
        if(str1.equals(str3)){
            System.out.println("Compared the value using equals");
        }
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.startsWith("Hello"));
        System.out.println(str1.endsWith("Hello"));
        if(str1.indexOf("el")!=-1)
        System.out.println(str1.indexOf("el")+1);
        String name1 = "adrian";
        String name2= "Adrian";
        System.out.println(name1.compareTo(name2));
    }
}
