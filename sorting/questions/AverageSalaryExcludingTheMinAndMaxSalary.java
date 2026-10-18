package questions;

public class AverageSalaryExcludingTheMinAndMaxSalary {

    class Solution {
        public double average(int[] salary) {

            int max = 0;
            int min = Integer.MAX_VALUE;
            double sum = 0;

            for(int sal:salary){
                if(sal>max){
                    max = sal;
                }
                if(sal<min){
                    min=sal;
                }
                sum+=sal;
            }

            int n = salary.length;

            return (sum-min-max)/(n-2);



        }
    }
}
