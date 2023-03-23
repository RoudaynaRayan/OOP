import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(34);
        list.add(918);
        list.add(60);
        list.add(30);
        list.add(16);
        list.add(11);
        int max =max(list);
        sort(list);
        System.out.println("Maximum num= " + max);
        System.out.println("Sorted list: " + list);
        }
    public static Integer max(ArrayList<Integer> list) {
        if (list.size() == 0)
            return null;

        Integer max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max)
                max = list.get(i);
        }
        return max;
    }
    public static void sort(ArrayList<Integer> list){
        for(int i= 0;i<list.size();i++)
        {
            for (int j=0;j<list.size();j++){
                if(list.get(j)>list.get(i)){
                    int temp=list.get(i);
                    int temp2=list.get(j);
                    list.set(j,temp);
                    list.set(i,temp2);
                }
            }
        }
    }
}