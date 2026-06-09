package part9;

import java.util.HashSet;
import java.util.Set;

public class SetAsMethodParameter {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("second");
        names.add("second");

        System.out.println(returnSize(names));
    }

    public static int returnSize(Set<String> list) {
        return list.size();
    }
}
