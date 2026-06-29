class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left=[]
        right=[]
        pro1=1
        pro2=1
        for n in nums:
            left.append(pro1)
            pro1*=n
        for i in range(len(nums)-1,-1,-1):
            right.append(pro2)
            pro2*=nums[i]
        right.reverse()
        for i in range(len(nums)):
            right[i]*=left[i]
        return right
  
        
        
                
        