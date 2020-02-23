package day14_String_Manipulation;

public class StringContains {
    public static void main(String[] args) {
        String email = "student@gmail.com";

        System.out.println( email.contains("@"));
        System.out.println(email.contains("gmail"));
        System.out.println(email.contains("stunt"));
        boolean hasDotCom = email.contains(".com");
        System.out.println("hasDotCom = " + hasDotCom);

        String list = "milk, eggs, bread, turkey, water, chocolate, potatoes, apples";

        if(list.contains("turkey")){
            System.out.println("Turkey is in the list");
        }else{
            System.out.println("we forgot turkey");

            if(list.contains("Banana")){
                System.out.println("bananas in the list");
            }else{
                System.out.println("lets add bananas");
                
                boolean hasMilk = list.contains("milk");
                System.out.println("hasMilk = " + hasMilk);
                    
                }

            }
        boolean hasMilk = list.contains("milk");
        System.out.println("hasMilk = " + hasMilk);
        if(hasMilk){
            System.out.println("We got the milk");
        }
        
        boolean hasWater = list.toUpperCase().contains("WATER");
        System.out.println("hasWater = " + hasWater);
        
        

        

        
        
        
        
        
        
        }
                

        }


