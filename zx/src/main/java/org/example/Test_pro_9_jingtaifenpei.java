package org.example;

import java.util.*;
//静态分配，重载，编译的时候已经确定方法，根据静态类型（定义类型），所以是super，同理，getType重载，定义的是collections,也是调用Clolection
public class Test_pro_9_jingtaifenpei {
    public static void main(String[] args) {
        Collection<?>[] collections =
                {new HashSet<String>(), new ArrayList<String>(), new HashMap<String, String>().values()};
        Super subToSuper = new Sub();
        for(Collection<?> collection: collections) {
            System.out.println(subToSuper.getType(collection));
        }
        List<?>[]lists={new ArrayList<String>(),new LinkedList<String>(),new Stack<>() };
        for(  List<?>list:lists) {
            System.out.println(subToSuper.getType(list));
        }

    }
    abstract static class Super {
        public static String getType(Collection<?> collection) {
            String res="Super:collection";
            return res;
        }
        public static String getType(List<?> list) {
            String res="Super:list";
            return res;
        }
        public String getType(ArrayList<?> list) {
            String res="Super:arrayList";
            return res;
        }
        public static String getType(Set<?> set) {
            return "Super:set";
        }
        public String getType(HashSet<?> set) {
            return "Super:HashSet";
        }
    }
    static class Sub extends Super {
        public static String getType(Collection<?> collection) {
            return "Sub"; }
    }
}
