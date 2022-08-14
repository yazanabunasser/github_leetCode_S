import java.util.LinkedList;

public class mergSortedLists {

    static void sort(int arr1[] , int arr2[]) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        LinkedList<Integer> list3 = new LinkedList<Integer>();
        int i;
        for (i = 0; i < arr1.length;i++ ) {
            list1.add(i, arr1[i]);
            list2.add(i, arr2[i]);
        }
        System.out.println(list1);
        System.out.println(list2);

        int n = 0;
        int l1 = 0 , l2 = 0 ;
        while (l1 <= 3 && l2<=  3) {
            if(l1 == 3){
                list3.add(n , list2.get(l2));
                break;
            }else if (l2 == 3){
                list3.add(n , list1.get(l1));
                break;
            }
            if (list1.get(l1) > list2.get(l2)) {
                list3.add(n, list2.get(l2));
                l2++;
                n++;
            } else if (list1.get(l1) < list2.get(l2)) {
                list3.add(n, list1.get(l1));
                l1++;
                n++;

            } else if (list1.get(l1) == list2.get(l2)) {
                list3.add(n, list1.get(l1));
                l1++;
                n++;
            }
        }

        System.out.println(list3);




    }
}
