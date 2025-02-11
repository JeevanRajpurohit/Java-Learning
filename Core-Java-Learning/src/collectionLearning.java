import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Comparable + Conparator ,
//class Person{
//        String name;
//        int age;
//        public Person(String name, int age){
//                this.name= name;
//                this.age= age;
//        }
//}
//class studs implements Comparable<studs> {
//    String name;
//    int age;
//    public studs(String name, int age){
//        this.name= name;
//        this.age= age;
//    }
//    public String toString(){
//        return "Student [ age is  "+ age +" and name is "+ name+" ]";
//    }
//
//    @Override
//    public int compareTo(studs that) {
//        if(this.age > that.age){
//            return 1;
//        }else{
//            return -1;
//        }
//    }
//}
public class collectionLearning {
    public static void main(String[] args) {
//        ArrayList<String> arrList = new ArrayList<>();
//       arrList.add("Banana");
//       arrList.add("Mango");
//
////       String fruit= arr.get(0);
////        System.out.println(fruit);
//        arrList.set(0,"Graphes");
//        arrList.add("Graphes");
//        System.out.println(arr);
//        System.out.println(arr.indexOf("Graphes"));
//        System.out.println(arr.contains("Mango"));
//        System.out.println(arr.lastIndexOf("Graphes"));

        //iterating using iterator
//        Iterator<String>it = arr.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
      //  ArrList to arr
//        Object[] arr = arrList.toArray();
//        System.out.println(Arrays.toString(arr));
//
//        String[] strArr = arrList.toArray(new String[0]);
//        System.out.println(Arrays.toString(strArr));
//        ArrayList<String> arrList2= new ArrayList<>(Arrays.asList("Apple","guava"));
//     //   System.out.println(arrList2);
//        arrList.addAll(arrList2);
//        System.out.println(arrList);
//        arrList.removeAll(Arrays.asList("Graphes"));
//        System.out.println(arrList);
//        arrList.retainAll(Arrays.asList("Apple"));
//        System.out.println(arrList);
//        Collections.sort(arrList);
//        System.out.println(arrList);
//
//        Collections.shuffle(arrList);
//        System.out.println(arrList);
//        LinkedList<String> list = new LinkedList<>();
//        list.add("Apple");
//        list.add("Banana");
//
//        LinkedList<String> clonedList = (LinkedList<String>) list.clone();
//        System.out.println(clonedList);  // Output: [Apple, Banana]
//        LinkedList<String> ll = new LinkedList<>();
//        ll.add("A");
//        ll.add("B");
//        ll.add("C");
//        ll.addFirst("Z");
//        ll.addLast("D");
//        System.out.println(ll);
//        System.out.println(ll.get(2));
//        System.out.println(ll.getFirst());
//        System.out.println(ll.getLast());
//        System.out.println(ll.size());
//        ll.remove();
//        ll.remove(0);
//        ll.remove("B");
//        System.out.println(ll);
//
//
//            Stack<Integer> st = new Stack<>();
//            st.push(1);
//            st.push(2);
//            st.push(3);
//            Iterator<Integer> it = st.iterator();
//            while(it.hasNext()){
//                    System.out.println(it.next());
//            }
//
//             while(!st.isEmpty()){
//                     System.out.println(st.peek());
//                     st.pop();
//             }
          //  st.forEach(System.out::println);   //java 8+ feature.
//            System.out.println(st.pop());
//            System.out.println(st);
//
//            TreeSet<Integer> st = new TreeSet<>();
//            st.add(1);
//            st.add(2);
//            st.add(3);
//            st.add(3);
//          //  st.remove(1);
//            st.add(7);
//            st.add(-1);
//            st.add(0);
//            st.add(-3);
//            st.add(-10);
//            System.out.println(st);
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//        pq.add(1);
//        pq.add(2);
//        pq.add(3);
//            while(!pq.isEmpty()){
//                    System.out.println(pq.poll());
//
//            }
//            PriorityQueue<Person> max_Heap = new PriorityQueue<>((p1,p2) -> p2.age-p1.age);
//
//            max_Heap.add(new Person("rakesh",20));
//            max_Heap.add(new Person("Jeevan",30));
//            max_Heap.add(new Person("Bhavesh",40));
//            while(!max_Heap.isEmpty()){
//                    Person p = max_Heap.poll();
//                    System.out.println(p.name+ " : "+ p.age);
//
//            }

//        HashMap<String, Integer> mp= new HashMap<>();
//        mp.put("Rakesh",27);
//        mp.put("Jeevan",22);
//        mp.put("Bhavesh",16);
//        mp.put("Bhavesh",10);
//
//       mp.put("Null",2);
//  mp.put("Null",1);
       // System.out.println(mp);
//        for(Map.Entry<String,Integer> e : mp.entrySet()){
//            System.out.println(e.getKey()+" : "+ e.getValue());
//        }
//        for(String key : mp.keySet()){
//            System.out.println(key+" : "+ mp.get(key));
//        }
      //  mp.forEach((key,value)-> System.out.println(key + " : "+ value));

//        TreeMap<String,Integer> mp1= new TreeMap<>();
//        mp1.put("Rakesh",27);
//        mp1.put("Jeevan",22);
//        mp1.put("Bhavesh",10);
//        mp1.put();
//        System.out.println(mp1);
//        StringBuffer str= new StringBuffer("Jeevan");
//       str.append(" Rajpurohit");
//
//        str.setCharAt(0, 'J');
//        System.out.println(str);
//
//        Comparator<studs> comp = new Comparator<studs>() {
//            @Override
//            public int compare(studs i, studs j) {
//                if (i.age  > j.age ) {
//                    return 1;
//                } else {
//                    return -1;
//                }
//            }
//        };
      //  Comparator<studs> comp = (i,j) -> i.age > j.age ? 1 : -1;   possible using lambda
//        Comparator<String> comp = new Comparator<String>(){
//           public int compare(String s1, String s2){
//               if(s1.length() > s2.length()){
//                   return 1;
//               }else{
//                   return -1;
//               }
//           }
//        };
//
//        ArrayList<studs> arr = new ArrayList<studs>();
//        arr.add(new studs("Rakesh",27));
//        arr.add(new studs("Jeevan",21));
//        arr.add(new studs("Jeeeadb",7));
//        arr.add(new studs("RIshi",17));
//        arr.add(new studs("RK",20));
//        Collections.sort(arr);
//       for(studs s1 : arr){
//           System.out.println(s1);
//       }
 //       ArrayList<String> arr = new ArrayList<>();
//        arr.add("Rakesh");
//        arr.add("Jeevan");
//        arr.add("Jeeann");
//        arr.add("Rishi");
//        arr.add("Xyz");
//        Collections.sort(arr, comp);
//        System.out.println(arr);

//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(17);
//        arr.add(21);
//        arr.add(20);
//        arr.add(39);
//        Collections.sort(arr, comp);
//        System.out.println(arr);
//       HashMap<Integer, Integer> mp = new HashMap<>();
//       List<Integer> arrList = Arrays.asList(2,4,5,6,7,7,7,4);
//       for(Integer i : arrList){
//            mp.put(i, mp.getOrDefault(i,0)+1);
//       }
//       for(int key : mp.keySet()){
//           System.out.println("Key : "+ key +" -> " +" Value "+ mp.get(key));
//       }


//     List<Integer> ll = Arrays.asList(2,3,4,5,6,7);
//    int result = ll.stream()
//               .filter(n -> n%2==0)
//               .map(n-> n*2)
//                .reduce(0,(c,a)-> c+a);
//
//        System.out.println(result);

     List<Integer> ll = List.of(2,3,4,5,6,7,8);
   //stream is a interface.
//        Stream<Integer> stream1=ll.stream();
//       List<Integer> newList = stream1.filter(i -> i%2==0).collect(Collectors.toList());
        //System.out.println(newList);

//         ll.stream().forEach(System.out::println);

        ll.stream().sorted().forEach(System.out::println);

        Integer int1= ll.stream().min((x,y)-> x.compareTo(y)).get();  // minimum 
        System.out.println(int1);
        Integer int2 = ll.stream().max((x,y)-> x.compareTo(y)).get();
        System.out.println(int2);

    }
}