package questions;

import java.util.Map;

public class RomanToInteger {

    class Solution {
        public int romanToInt(String s) {
            Map<Character,Integer> map = Map.of('I',1,'V',2,'X',3,'L',4,'C',5,'D',6,'M',7);
            int n = s.length();
            int sum =0;
            char ch[] = s.toCharArray();
            for(int i=0;i<n;i++){
                if(ch[i]=='M'){
                    sum+=1000;
                }
                else if(ch[i]=='D'){
                    sum+=500;
                }
                else if(ch[i]=='C'){
                    if(i<n-1 && map.get(ch[i+1])>map.get('C')){
                        sum-=100;
                    }
                    else sum+=100;
                }
                else if(ch[i]=='L'){
                    sum+=50;
                }
                else if(ch[i]=='X'){
                    if(i<n-1 && map.get(ch[i+1])>map.get('X')){
                        sum-=10;
                    }
                    else sum+=10;
                }
                else if(ch[i]=='V'){
                    sum+=5;
                }
                else if(ch[i]=='I'){
                    if(i<n-1 && ch[i+1]!='I'){
                        sum-=1;
                    }
                    else
                    {
                        sum+=1*(n-i);
                        break;
                    }
                }

            }

            return sum;
        }
    }
}
