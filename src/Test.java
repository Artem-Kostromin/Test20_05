import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        CustomArrayList myArrList = new CustomArrayList();
        int[] arr = {1,2,3,5,6,7,8,3,21,15,2,6,78,9};
        for(int i:arr){
            myArrList.add(i);
        }
        myArrList.add(4, 100);
        /*for(int i=0;i<myArrList.size();i++){
            System.out.print(myArrList.get(i) + ",");
        }*/
        System.out.println("Пятый элемент: " + myArrList.get(5));
        System.out.println("Размер: " + myArrList.size());
    }
}
