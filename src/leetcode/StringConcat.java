package leetcode;

import java.util.ArrayList;
import java.util.List;

public class StringConcat {

    String[] addBorder(String[] picture) {
        String fill = "*";
        List<String> s = new ArrayList();
        for (int i = 0; i < picture.length ; i++) {
            if (i==0 || i == picture.length -1 ) {
                String temp = new String();
                for (int j=0; j< picture[i].length(); j++) {
                    temp = temp.concat(fill);
                }
                s.add(temp);
            } else {
                String add = fill;
                add = add.concat(picture[i]);
                add = add.concat(fill);
                s.add(add);
            }
        }


        return s.toArray(new String[0]);
    }

    public static void main(String[] args) {
        StringConcat sc = new StringConcat();
        String[] ret = sc.addBorder(new String[]{"abc", "def"});
        System.out.println(ret);
    }
}
