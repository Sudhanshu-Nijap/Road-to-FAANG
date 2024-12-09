import java.util.ArrayList;

public class arrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(10);
        list.add(20);
        for (int i = 0;i<100;i++){
            list.add(i);
        };

        // var.add(value) - adds at end
        list.add(50);

        // var.add(index,value) - adds at specific index
        list.add(5, 100);

        // System.out.println(list);
   
        // var.contains(value) - checks wheater the value contains or not
        System.out.println(list.contains(50));

        // var.set(index,value) - modifys the value at specific index
        list.set(0,500);

        // var.remove(index) - removes the value at specific index
        list.remove(1);
        System.out.println(list);

    }
    
}
