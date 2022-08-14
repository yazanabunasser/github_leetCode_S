import java.util.ArrayList;
import java.util.List;

public class pascalsTringle {
    static List<List<Integer>> generate(int numRows){
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        pascal.add(l1);
        int i=2;
        while(i<=numRows){
            List<Integer> l3 = new ArrayList<>();
            l3.add(1);
            for(int j=1;j<i-1;j++) {
                l3.add(pascal.get(i - 2).get(j - 1) + pascal.get(i - 2).get(j));
                System.out.println(pascal.get(i - 2));
                System.out.println(pascal.get(i - 2).get(j - 1));
                System.out.println(pascal.get(i - 2));
                System.out.println(pascal.get(i - 2).get(j));
                System.out.println("===============");



            }
            System.out.println("---------------------------------------------------------");
            l3.add(1);
            pascal.add(l3);
            ++i;
//            System.out.println(pascal);
        }

        return pascal;
    }
}

