class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        ans=[]
        for x in nums:
            count=0
            for n in nums:
                if(n<x):
                    count+=1
            ans.append(count)
        return ans
        