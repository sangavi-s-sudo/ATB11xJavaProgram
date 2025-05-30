package ex_31_oops_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex_11_AL_IQ {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);



        System.out.println(marks);

        Collections.sort(marks);  // for sorting we need same data types
        System.out.println(marks);

        // Collection - Interface
        // Collections - Class (it contains complete methods which list,set, qu may required)


         Collections.reverseOrder(); // Collections.reverseOrder() returns a comparator for reverse sorting.
// As we are not applying it to any list, so nothing changes.It must be used with Collections.sort() to sort a list in descending order.

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);

    }
}
