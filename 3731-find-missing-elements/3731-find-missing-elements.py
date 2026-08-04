class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        ans=[]
        a=max(nums)
        b=min(nums)
        while(a>b):
            if b in nums:
                b+=1
            else:
                ans.append(b)
                b+=1
        return ans


        