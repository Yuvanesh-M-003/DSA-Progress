class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1 , right = 1000000000;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            if(check(piles,mid,h))
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        return left;
    }

        public boolean check(int arr[],int mid,int h)
        {
            long hrs = 0;
            for(int i : arr)
            {
                int x = i/mid;
                hrs += x;
                if(i % mid != 0)
                {
                    hrs++;
                }
            }

            return hrs <= h;
        }
    }
