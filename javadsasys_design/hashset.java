package javadsasys_design;

import java.util.HashSet;


/*  ques.you are given distinct pairs .Each pairs is numbered from 1 to n.All
these pairs are initially put in a bag. You take numbers one by one from the
bag and for each number you look wheather the pair of this number has already been
tajen out of the bag,or not.If not(that means the pair of this number is still
in the bag),you put the current number on the table in front of him .Otherwise
you put both numbers from the pair aside.
Print the maximum number of the numbers that were on the table at the same time.
 */
public class hashset {
    public static void main(String[] args) {
       int []arr={1,1};
        HashSet<Integer> table =new HashSet<>();
        int maxpresent=0;
        for (int i=0;i< arr.length;i++){
            if (table.contains(arr[i])){
                table.remove(arr[i]);
            }else {
                table.add(arr[i]);
                maxpresent=Math.max(maxpresent,table.size());
            }
        }
        System.out.println(maxpresent);
    }
}
