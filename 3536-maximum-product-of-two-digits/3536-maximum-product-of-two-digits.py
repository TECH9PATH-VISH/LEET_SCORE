class Solution:
    def maxProduct(self, n: int) -> int:
        digit =[]
        while n>0:
            rem=n%10
            digit.append(rem)
            n//=10
        digit.sort()
        a=digit.pop()
        b=digit.pop()
        return a*b
        