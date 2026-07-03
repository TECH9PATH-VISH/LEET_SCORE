class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        a=list(s)
        b=list(s)
        i=0
        for n in indices:
            b[n]=a[i]
            i+=1
        return "".join(b)
        