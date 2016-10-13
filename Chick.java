
class Chick implements Animal {     
     private String myType;     
     private String mySound;      
     public Chick(String type)     {         
         myType = type; 
         if (Math.random() < .5){
             mySound = "cluck";
         }
         else {
            mySound = "cheep";
         }
                 
         
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";   
     }      
     public String getSound(){return mySound; }     
     public String getType(){return myType;} 
}   