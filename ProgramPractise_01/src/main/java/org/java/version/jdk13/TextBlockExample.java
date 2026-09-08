package org.java.version.jdk13;

/**
 * Before Java 13
 * String json = "{\n" +
 *               "  \"name\": \"John\",\n" +
 *               "  \"age\": 30\n" +
 *               "}";
 *               
 */
public class TextBlockExample {
    public static void main(String[] args){
        String json= """
                 {
                     "name":"John",
                     "age":30
                 } 
                 """;
        
        String html = """
        	    <html>
        	        <body>Hello</body>
        	    </html>
        	    """;
        
        System.out.println(json);
        System.out.println(html);
    }
//javac --enable-preview --release 13 TextBlockExample.java
//java --enable-preview TextBlockExample
}
