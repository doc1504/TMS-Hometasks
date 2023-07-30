public class Strings {
    static String document = "6483-hjd-4638-ksl-5j3l";

    static void substring() {
        String substring1 = document.substring(0, 4);
        String substring2 = document.substring(9, 13);
        System.out.println(substring1 + substring2);
    }
    static StringBuffer buffer = new StringBuffer(document);

    static void replace(){
        StringBuffer replace = buffer.replace(5, 8, "***").replace(14, 17, "***");
        System.out.println(replace);
    }
    static StringBuilder builder = new StringBuilder(document);

    static void delete(){
        StringBuilder stringBuilder = builder.delete(0, 5).delete(3, 9).delete(6, 8).deleteCharAt(7);
        StringBuilder insert = builder.insert(3, "/").insert(7, "/").insert(9, "/");
        System.out.println(insert);
    }
    static void write(){
        String builderString = builder.toString();
        String upperCase = builderString.toUpperCase();
        String start = "Letters : ";
        String concat = start.concat(upperCase);
        System.out.println(concat);
    }
    static void contain(){
        boolean abc = document.contains("abc");
        System.out.println(abc);
    }
    static void start(){
        boolean startsWith = document.startsWith("555");
        System.out.println(startsWith);
    }
    static void endUp(){
        boolean endsWith = document.endsWith("1a2b");
        System.out.println(endsWith);
    }

}
