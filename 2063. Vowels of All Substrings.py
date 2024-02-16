class Solution:
  def countVowels(self, word: str) -> int:
    dp = [0] * (len(word) + 1)
    for i, c in enumerate(word):
      dp[i + 1] = dp[i]
      if c in 'aeiou':
        dp[i + 1] += i + 1
    return sum(dp)