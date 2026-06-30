class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        a=set(nums)
        nums=list(a)
        nums.sort()
        pos = 1
        for n in nums:
            if n <= 0:
                continue
            else:
                if pos == n:
                    pos += 1
                else:
                    return pos

        return pos
