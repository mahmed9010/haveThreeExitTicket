package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(haveThree({5,3,4,4,3,5,3}));
    }

    public boolean haveThree(int[] nums)
    {
        int x = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]==3 && nums[i-1]!=3)
            {
                x++;
            }
            else if(nums[i]==3 && nums[i-1]==3)
            {
                return false;
            }
            if(x>4)
            {
                return false;
            }

        }
        if(x==3)
        {
            return true;
        }
        return false;
    }

}
