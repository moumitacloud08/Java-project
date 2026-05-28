package org.example.innerclass;

/**
 * Anonymous Inner Class
 */
public class ParentChildAnonymousInnerRunner_01 {
    public static void main(String[] args){
        Parent_01 p1 = new Parent_01(){
            public void taste(){
                System.out.println("Spicy");
            }
        };
        p1.taste();
    }
}
