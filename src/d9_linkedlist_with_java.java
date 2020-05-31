//Reference: Udemy, GFG, Java
//https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html

import java.util.*;

public class d9_linkedlist_with_java {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();

        list.addFirst(20); //adds to the front of the list. returns void.
        print(list);

        list.addFirst(10);
        print(list);

        printBoolean(list.add(30)); //adds to the end of the list. returns true/false.
        print(list);

        list.addLast(40); //adds to the end of the list. returns void.
        print(list);

        list.add(2, 25); //adds item at the index. returns void.
        print(list);

        Integer[] a = {50, 52, 60, 55, 57, 60, 62, 65};
        for(int i: a){
            list.addLast(i);
        }

        printInt(list.remove()); //removes and returns the first item in the list
        print(list);

        printInt(list.remove(1)); //removes and returns the item at the given index
        print(list);

        printInt(list.removeFirst()); //removes and returns the first item in the list
        print(list);

        printInt(list.removeLast()); //removes and returns the last item in the list
        print(list);

        //Removes the first occurrence of the specified element. returns true/false
        printBoolean(list.removeFirstOccurrence(60));
        print(list);

        //Removes the last occurrence of the specified element. returns true/false
        printBoolean(list.removeLastOccurrence(90));
        print(list);

        printInt(list.size()); //returns size of the list

        printInt(list.element()); //returns the first item in the list

        printInt(list.getFirst()); //returns the first item
        printInt(list.get(2)); //returns the item at given index
        printInt(list.getLast()); //returns the last item

        printInt(list.indexOf(50)); //returns the index of the first occurrence of the item
        printInt(list.indexOf(100)); //returns -1 if item not found

        //Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
        printInt(list.lastIndexOf(60));

        printBoolean(list.contains(30)); //returns true or false
        printBoolean(list.contains(100));

        printInt(list.set(2, 45)); //replaces the item at the index. returns the old item in the index.
        print(list);

        //converts list to array. returns object.
        Object[] o = list.toArray();
        System.out.println(Arrays.toString(o));

        // Creating the array using toArray()
        Integer[] arr = new Integer[6];
        arr = list.toArray(arr);
        System.out.println(Arrays.toString(arr));

        // A collection is created
        Collection<Integer> c = new ArrayList<Integer>();
        c.add(75);
        c.add(76);

        //adds all elements from collection to the list. adds one the end of the list
        printBoolean(list.addAll(c)); //returns true/false
        print(list);

        Collection<Integer> c2 = new ArrayList<Integer>();
        c2.add(31);
        c2.add(32);
        c2.add(33);
        c2.add(34);

        //adds all elements from collection to the list. adds one the index at the Linked list
        printBoolean(list.addAll(2, c2)); //returns true/false
        print(list);

        //clone a linked list
        LinkedList list2 = new LinkedList();
        list2 = (LinkedList) list.clone(); //returns object
        print(list2);

        //create linked list from collection
        LinkedList list3 = new LinkedList(c2);
        print(list3);

        list2.clear(); //remove all items in the list. returns void.
        print(list2);

        //descendingIterator(): iterate in reverse order
        printListReverse(list);

        //adds element at front. Considering list as stack. returns void.
        list.push(20);
        print(list);

        //removes and returns the first element. Considering list as stack.
        printInt(list.pop());
        print(list);

        printBoolean(list.offer(80)); //adds the item at last. returns true/false.
        print(list);

        printBoolean(list.offerFirst(15)); //adds the item at first. returns true/false.
        print(list);

        printBoolean(list.offerLast(85)); //adds the item at last. returns true/false.
        print(list);

        printInt(list.peek()); //returns the first item
        printInt(list.peekFirst()); //returns the first item
        printInt(list.peekLast()); //returns the last item

        printInt(list.poll()); //returns and removes the first item
        print(list);

        printInt(list.pollFirst()); //returns and removes the first item
        print(list);

        printInt(list.pollLast()); //returns and removes the last item
        print(list);
    }

    public static void print(LinkedList <Integer> list){
        System.out.println(list);
    }

    public static void printList(LinkedList <Integer> list){
        System.out.print("HEAD <=> ");
        Iterator i = list.iterator();
        while(i.hasNext()){
            System.out.print(i.next());
            System.out.print(" <=> ");
        }System.out.println("TAIL");
    }

    public static void printListReverse(LinkedList <Integer> list){
        System.out.print("TAIL <=> ");
        Iterator i = list.descendingIterator();
        while(i.hasNext()){
            System.out.print(i.next());
            System.out.print(" <=> ");
        }System.out.println("HEAD");
    }

    public static void printListWithForLoop(LinkedList <Integer> list){
        System.out.print("HEAD <=> ");
        for (Integer value : list) {
            System.out.print(value);
            System.out.print(" <=> ");
        }System.out.println("TAIL");
    }

    public static void printBoolean(boolean b){
        System.out.println(b);
    }

    public static void printInt(int n){
        System.out.println(n);
    }

    public static void printIntArray(int[] a){
        System.out.println(a);
    }

}
