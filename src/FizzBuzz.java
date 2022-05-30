class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answers = new ArrayList<>(n);
        StringBuilder answer = new StringBuilder();
        boolean isDivisibleByThree;
        boolean isDivisibleByFive;
      
        for (int i = 1; i <= n; i++) {
            answer.setLength(0);
            isDivisibleByThree = i % 3 == 0;
            isDivisibleByFive = i % 5 == 0;
            
            if (!isDivisibleByThree && !isDivisibleByFive) {
                answer.append(i);
            } else {
                if (isDivisibleByThree)
                    answer.append("Fizz");
                if (isDivisibleByFive)
                    answer.append("Buzz");
            }
            
            answers.add(answer.toString());
        }
      
        return answers;
    }
}
