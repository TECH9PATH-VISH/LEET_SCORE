class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        ans=[]
        final=[]
        while(left <= right):
            ans.append(self.digit(left))
            left+=1
        for n in ans:
            if n!=0:
                final.append(n)
        return final
    def digit(self, n: int):
        check=True
        if n<10:
            return n
        temp=n
        while(temp>0):
            x=temp%10
            temp//=10
            if x==0:
                check=False
                break
            if(n%x!=0):
                check=False
        if check:
            return n
        else:
            return 0
            

        