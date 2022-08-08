import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class intersectionTwoArrays {
    static int[] intersect(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums1){
            int freq = map.getOrDefault(i, 0);
            map.put(i, freq + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums2){
            if(map.get(i) != null && map.get(i) > 0){
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size();i++){
            res[i] = list.get(i);
        }
        System.out.println(Arrays.toString(res));
        return res;

//        int l1 , l2 , n =0 , p=0;
//        l1 = nums1.length;
//        l2 = nums2.length;
//        int[] nums3 = new int[l1];
//        for(int i= 0 ; i < l1 ; i++){
//            for(int j = 0; j < l2; j++){
////                if(nums1[i] == 0){
////                    break;
////                }
//                if(nums1[i] == nums2[j]){
//                    if(nums2[j]== 0) {
//                        l2--;
//                    }
//                    n++;
//                }
//                if(n == 1){
//                    nums3[p] = nums1[i];
//                    nums2[j] = 00 ;
//                    n = 0;
//                    p++;
//                    break;
//                }
//            }
//        }
//        int[] result =new int[p];
//        for (int o = 0 ; o < p ; o++){
//            result[o] = nums3[o];
//        }
//
//
//        System.out.println(Arrays.toString(result));
//        return result;
    }

}
