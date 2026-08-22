class Solution(object):
    def checkDivisibility(self, n):
        temp = n
        sum =0 
        prod = 1
        while temp > 0:
            dig = temp % 10
            sum = sum + dig
            prod = prod * dig
            temp = temp // 10

        return True if n % (sum + prod) == 0 else False
        