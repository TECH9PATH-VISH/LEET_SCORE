class Solution:
    def sumAndMultiply(self, n: int) -> int:
        i=0
        m=n
        sum=0
        while(n>0):
            digit=n%10
            sum+=digit
            n//=10
        while(m>0):
            rem = m % 10
            if rem != 0:
                i = i * 10 + rem
            m //= 10
        return self.final(i)*sum
        
    def final(self, x: int)-> int:
        a=x
        rev=0
        while(a>0):
            rem=a%10
            rev=rev*10+rem
            a//=10
        return rev

        


        