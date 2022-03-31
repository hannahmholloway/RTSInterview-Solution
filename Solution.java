//Hannah Holloway - RTSLabs Take home interview coding asignment 
import java.util.*;

class Main{
    public static void aboveBelow(String[] args)
    {   
        //input the numbers
        Scanner sc=new Scanner(System.in);
        
        //input the list
        System.out.print("Enter list size: ");
        int n=sc.nextInt();
        int list[]=new int[n];
        
        System.out.print("Enter list data: ");
        for(int i=0;i<n;i++)
        {
            list[i]=sc.nextInt();
        }
        
        System.out.print("Enter the value for comparison: ");
        int val=sc.nextInt();
        
        //call the function to create the map
        System.out.println(getMap(list,val));
        
        //input a string
        System.out.print("\n\nEnter a string: ");
        sc.nextLine();//clear buffer
        String str=sc.nextLine();
        System.out.print("Enter rotation amount: ");
        int shift=sc.nextInt();
        //rotate the string
        System.out.print("\nOutput: "+stringRotation(str,shift));
        
    }
    

    //Method 1: Calculates if the ints from an unsorted list are above or below the comparison value
    //Declared a Hashmap of string-integer pairs 
    //Split the given string and store the values into a String array.
    //Traversing the array, check if comparison value is in the HashMap or not.
    // If it is not in the HashMap, then store the word as key and 1 as the initial value; if the word is present in the HashMap then increase the value against the word.
    //Once the traversal is complete, print the HashMap.
    public static HashMap<String,Integer> getMap(int list[],int val)
    {
        //create a hash map
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<list.length;i++)
        {
            if(list[i]>val)
            {
                //key shuold be above
                if(map.get("above")==null)
                {
                    //insert above in the map
                    map.put("above",1);
                }
                else{
                    //increment the value of above
                    map.replace("above",map.get("above")+1);
                }
            }
            else if(list[i]<val){
                //key should be below
                if(map.get("below")==null)
                {
                    //insert above in the map
                    map.put("below",1);
                }
                else{
                    //increment the value of above
                    map.replace("below",map.get("below")+1);
                }
            }
        }
        return map;
    }
    

    //Method 2: Rotate String to the right by k steps. 

    public static String stringRotation(String str,int shift)
    {
        //create a new String
        String newStr="";
        int len=str.length();
        int index=len-shift;
        
        for(int i=index;i<len;i++)
        {
            char ch=str.charAt(i);
            newStr+=ch;
        }
        for(int i=0;i<index;i++)
        {
            char ch=str.charAt(i);
            newStr+=ch;
        }
        
        return newStr;
    }
        
    
}
