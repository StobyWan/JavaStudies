/**
 * Created by bbstober on 4/20/17.
 */

public class Shift {

    public int[] arrayLeftRotation(int[] a, int n, int k) {

        int temp;
        if (k == 0)
            return a;

        for(int i=0;i<k;i++){
            temp=a[0];
            for(int x=0;x<a.length;x++){
                if((x) == a.length-1){
                    a[x]=temp;
                }else{
                    a[x]=a[x+1];
                }
            }
        }
//
        return a;
    }

}
