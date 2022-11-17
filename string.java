public class string {
    public static void main(String[]args){
        String a="REBATI";
        String b="sarkar";
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

        System.out.println(b.concat(a));
        System.out.println(b.length());

        String c="      Sushant       ";
        String d="";
        System.out.println(c.trim());
        System.out.println(d.isEmpty());

        String e="Book";
        System.out.println(e.isEmpty());

        System.out.println(b.charAt(2));
        System.out.println(a.indexOf('T'));
        
    }
}
