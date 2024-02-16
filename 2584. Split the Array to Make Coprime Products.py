class Solution:
  def findValidSplit(self, nums: List[int]) -> int:
    leftPrimeFactors = collections.Counter()
    rightPrimeFactors = collections.Counter()

    def getPrimeFactors(num: int) -> List[int]:
      primeFactors = []
      for divisor in range(2, min(1000, num) + 1):
        if num % divisor == 0:
          primeFactors.append(divisor)
          while num % divisor == 0:
            num //= divisor
      if num > 1:
        primeFactors.append(num)
      return primeFactors

    for num in nums:
      for primeFactor in getPrimeFactors(num):
        rightPrimeFactors[primeFactor] += 1

    for i in range(len(nums) - 1):
      for primeFactor in getPrimeFactors(nums[i]):
        rightPrimeFactors[primeFactor] -= 1
        if rightPrimeFactors[primeFactor] == 0:
          del rightPrimeFactors[primeFactor]
          del leftPrimeFactors[primeFactor]
        else:
          leftPrimeFactors[primeFactor] += 1
      if not leftPrimeFactors:
        return i

    return -1