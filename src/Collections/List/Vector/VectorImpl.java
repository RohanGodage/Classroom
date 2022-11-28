package Collections.List.Vector;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorImpl {
    public static void main(String[] args) {
        List vector = new Vector();
        vector.add(301);
        vector.add(340);
        vector.add(300);
        vector.add(305);
        vector.add(310);
        vector.add(350);

        System.out.println("Before sorting : " + vector);
        Collections.sort(vector);
        System.out.println("After sorting : " + vector);
        System.out.println("Hash Code : " + vector.hashCode());
    }
}
