package com.Igor;

//Complete this code or write your own from scratch
import java.util.*;

class TwoName {
    String firstName;
    String secondName;
    public TwoName(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }
    @Override
    public int hashCode(){
        int hash;
        hash =  ((firstName == null) ? 0 : firstName.hashCode());
        hash = hash  * 31 + ((secondName == null) ? 0 : secondName.hashCode());
        return hash;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        TwoName guest = (TwoName) obj;
        return (firstName == guest.firstName || (firstName!=null && firstName.equals(guest.firstName)))
                && (secondName == guest.secondName || (secondName != null && secondName.equals(guest.secondName)));
    }
}
public class Solution{

    public static void main(String []argh)
    {
        Set <TwoName> twoNameHashSet = new HashSet <TwoName>();
        String firstName, secondName;
        int count = 0;
        ArrayList <Integer> countArray = new ArrayList <Integer>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();

        for(int i=0;i<n;i++)
        {
            String str=in.nextLine();
            int space = str.indexOf(" ");
            firstName = str.substring(0,space);
            secondName = str.substring(space);
            TwoName twoName = new TwoName(firstName, secondName);
            if (twoNameHashSet.add(twoName))
                count++;
            countArray.add(count);
        }
        for (Integer outCount : countArray){
            System.out.println(outCount);
        }
    }
}
