class Solution:
    def pivotInteger(self, n: int) -> int:
        i = 1
        j = n
        sum1 = 1
        sum2 = n
        if n == 1:
            return 1
            
        while i < j:
            if sum1 < sum2:
                i += 1
                sum1 += i
            else:
                j -= 1
                sum2 += j
        if i == j and sum1 == sum2:
            return i
            
        return -1