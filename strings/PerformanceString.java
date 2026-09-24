public class PerformanceString {

    public static void main(String[] args) {
        String series = "";

        //New object is created at each step of the loop
        // a , ab , abc , abcd , .... are objects created
        //except the last one , other won't have ref variable
        // 1 + 2 + 3 +4 ....= N(N+1)/2 = O(N^2) -> Very high complexity
        for (int i=0;i<26;i++){
            char ch = (char)('a'+i);
            //System.out.println(ch);
            series = series + ch; //series+=ch
        }
        System.out.println(series);
    }
}
