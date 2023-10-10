 class Animal{
     public void eat(){
         System.out.println(" I CAN EAT");
     }
 }
     class Dog extends Animal{
         public void eat(){
             super .eat();
             System.out.println(" i eat dog food");
         }
     public void bark(){
         System.out.println("i can bark");
     }
     }
     class Main{
         public static void main(String[]args){
             Animal dog = new Dog();
             dog.eat();
             
         }
     }

