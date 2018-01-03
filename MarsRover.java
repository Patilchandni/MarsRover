/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrover;

import java.util.Scanner;

public class Marsrover {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter Direction");
        String dir1=sc.next();
        char dir=dir1.charAt(0);
        System.out.println("Enter X posion");
        int xPos=sc.nextInt();
        System.out.println("Enter Y posion");
        int yPos=sc.nextInt();     
        System.out.println("Enter String in L R M format");
        String input=sc.next();
        
        
        String directions="ENWS";
        char inputArray[]=input.toCharArray();
        int dpos=directions.indexOf(dir);
        for(int i=0;i<inputArray.length;i++)
        {
        
            if(inputArray[i]=='L')
               dpos=(dpos<=0)? 3: dpos--;
            if(inputArray[i]=='R')
                dpos=(dpos>=3)? 0: dpos++;
         
              
            if(inputArray[i]=='M')
            {
               char c = directions.charAt(dpos);
               switch(c)
               {
                case 'E': xPos--;                  
                case 'N': yPos++;                                     
                case 'W': xPos++;                                     
                case 'S': yPos--;  
                    
               }
            }
        }
        
        System.out.println("Direction ="+directions.charAt(dpos));
        System.out.println("X position ="+xPos);
        System.out.println("Y position ="+yPos);
        
        
    }
    
}
