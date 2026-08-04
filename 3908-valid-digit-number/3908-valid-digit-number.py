class Solution:
    def validDigit(self, n: int, x: int) -> bool:
        find =[]
        while(n>0):
            rem= n%10
            find.append(rem)
            n//=10
        if x in find and find[len(find)-1]!=x:
            return True
        else:
            return False

        