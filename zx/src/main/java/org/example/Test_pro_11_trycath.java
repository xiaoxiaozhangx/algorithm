package org.example;

public class Test_pro_11_trycath {
        public static String output = "";
        public static void foo(int i)
        {
            try
            {
                if (i == 1)
                {
                    throw new Exception();
                }
            }
            catch (Exception e)
            {
                output += "2";
                return ;
            } finally
            {
                output += "3";
            }
            output += "4";
            System.out.println(output+"catch");
        }
        public static void main(String[] args)
        {
            foo(0);
//            foo(1);
            System.out.println(output);
        }
    }

