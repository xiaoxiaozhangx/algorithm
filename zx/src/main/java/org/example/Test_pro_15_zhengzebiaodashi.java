package org.example;

import java.util.regex.Pattern;

public class Test_pro_15_zhengzebiaodashi {

        public static void main(String[] args) {
            String content = "https://www.tensorflow.org/";

            String patternA = "[a-z]+://[a-z.]+/";
            String patternB = "https[://]www[.]tensorflow[.]org[/]";
            String patternC = "[htps]+://www.tensorflow.org/";
            String patternD = "[a-zA-Z.:/]+";

            System.out.println(Pattern.matches(patternA, content)); // true
            System.out.println(Pattern.matches(patternB, content)); // false
            System.out.println(Pattern.matches(patternC, content)); // true
            System.out.println(Pattern.matches(patternD, content)); // true
            final  int [] aa=new int[3];

            aa[1]=1;
            aa[1]=2;
            System.out.println(aa[1]);
            Double x=1.2;
            long l1 = (long) 1.2;
            float f = (float) (x/l1);
            System.out.println(f);
        }

}
