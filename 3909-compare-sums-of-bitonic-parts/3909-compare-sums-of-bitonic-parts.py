class Solution:
    def compareBitonicSums(self, nums: list[int]) -> int:
        a=max(nums)
        asend_sum=0
        desend_sum=0
        for i in nums:
            if i==a:
                asend_sum+=i
                break
            asend_sum+=i
        for i in range(len(nums) - 1, 0, -1):
            if nums[i]==a:
                desend_sum+=nums[i]
                break
            desend_sum+=nums[i]
        if(asend_sum>desend_sum):
            return 0
        elif(desend_sum>asend_sum):
            return 1
        else:
            return -1
             
            

        