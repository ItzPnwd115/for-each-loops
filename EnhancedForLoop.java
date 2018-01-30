import java.util.ArrayList;

public class EnhancedForLoop
{
    public static double mean(double nums[])
    {
        double sum = 0;
        for(double x: nums)
        {
            sum += x;
        }
        return sum/nums.length;
    }
    
    public static double max(double nums[])
    {
        double max = 0;
        for(double x: nums)
        {
            if(x > max)
            {
                max = x;
            }
        }
        return max;
    }
        
    public static double sumEvenVals(double nums[])
    {
        double sum = 0;
        for(double x: nums)
        {
            if(x % 2 == 0)
            {
                sum += x;
            }
        }
        return sum;
    }
    
    public static int vowelCount(String[] word)
    {
        int counter = 0;
        for(int i = 0; i < word.length; i++)
        {
            for(int j = 0; i< i.length(); j++)
            {
                if(i.substring(j,j+1).equals("a")||i.substring(j,j+1).equals("e")||i.substring(j,j+1).equals("i")||i.substring(j,j+1).equals("o")||i.substring(j,j+1).equals("u"))
                {
                    couter++;
                }
            }
        }
        return counter;
    }
    
    public static void main(String[] args)
    {
        /********** Examples **********/
        
        int[] arr = {4,5,1,2,3,8};
        
        // Ex. 1
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        // Ex. 2
        for (int x: arr)
            x++; // remember, x is a copy of each item in the array
            
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        // Ex. 3
        for (int i=0; i<arr.length; i++)
            arr[i]++; // now we are actually changing elements in the array
            
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        
        // Ex. 4
        Pet[]   pets = {new Pet("Phineas"),new Pet("Ferb"),new Pet("Perry")};
        
        for (Pet p : pets)
            p.sleep();
        

        for (Pet p : pets)
            System.out.println(p);

        ArrayList<Pet> morePets = new ArrayList<Pet>();
        morePets.add(new Pet("Milo"));
        morePets.add(new Pet("Otis"));
        
        for (int i=morePets.size()-1; i>=0; i--) {
            Pet p = morePets.get(i);
            
            morePets.remove(i);
            p.eat();
        }
        /********** Your turn **********/
        
        // #1 - Write a method mean(double nums[]) which uses an enhanced
        //      for loop to return the mean of the elements in nums. Test
        //      the method here.
        int[] nums = {2,3,5,7,8,9};
                
        

        // #2 - Write a method max(double nums[]) which uses an enhanced
        //      for loop to return the maximum value of the elements in
        //      nums. Then test the method.
        


        
        // #3 - Write a method sumEvenVals that uses an enhanced for 
        //      loop to return the sum of all even values stored in an 
        //      Array.  Then test the method.




        // #4 - Write a method vowelCount that uses an enhanced for loop
        //      to count the number of vowels (a,e,o,u only) in a list
        //      of words.
        
        
        

        // #5 - Write a method sumEvenLocs that uses an enhanced for 
        //      loop to find the sum of all values stored with even 
        //      numbered indices in an Array. Then test the method.
        
        
        
        
        // #6 - Solve #5 using a regular for loop. Then explain why a
        //      regular for loop is more appropriate for that problem.
        
        
        
    }
}