package ru.geekbrains.java_two.lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(2);
//
//        System.out.println(list);
////        System.out.println(list.get(0) + list.get(list.size()-1));
////
////        list.remove((Integer) 2);
////        System.out.println(list);
//
////        list.removeIf(x->x % 2 !=0);
////        System.out.println(list);
//
//
//        List<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6,7,78,8,9,9,90,0,2));
//        System.out.println(list2);
//
//
//        //добваляем из одной коллекции в другую, можно указать
//        // индекс с какого места начать добавлять в эту коллекцию
//        list.addAll(2, list2);
//        System.out.println(list);
//
//
//        list.set(3,99);
//        System.out.println(list);
//        System.out.println(list.contains(100)); // позволяет найти элемент
//
//        list.removeAll(Arrays.asList(4,6));
//        System.out.println(list);
//
//
//        ((ArrayList<Integer>)list).trimToSize();//убирает лишнее место  в коллекции
//        ((ArrayList<Integer>)list).ensureCapacity(1000);// вручную увеличиваем размер внутреннего массива




//        List<String> stringList = new ArrayList<>();
//        stringList.addAll(Arrays.asList("Россия", "США" , "Германия","Франция", "Италия"));
//        System.out.println(stringList);
//        stringList.removeIf(x->x.endsWith("ия"));
//        System.out.println(stringList);


//        LinkedList<String > linkedList1 = new LinkedList<>(); //используется,если нужно что-то постоянно добавлять или удалять
//        linkedList1.addAll(stringList);
//        System.out.println(linkedList1);
//        linkedList1.add(0,"Белоруссия");
//        System.out.println(linkedList1);

//        long timeBegin = System.currentTimeMillis();
//
//        for (int i = 0; i < 1000000; i++) {
//            stringList.add("Белоруссия");
//        }
//
//        System.out.println("time: " + (System.currentTimeMillis()- timeBegin));

//        for (int i = 0; i < stringList.size(); i++) {
//            System.out.println(stringList.get(i));// дучше всего использовать этот способ для добавления/удаления элементов
//        }


//        for (String s: linkedList1) {
//            System.out.println(s);
//        }


//        Iterator<String>iterator = linkedList1.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        ListIterator<String> listIterator = linkedList1.listIterator(3);
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }

//        linkedList1.sort(Comparator.naturalOrder()); // сортировка по алфавиту
//        linkedList1.sort(Comparator.reverseOrder()); // сортировка по алфавиту с конца
//        System.out.println(linkedList1);


//        Set<Integer> set = new HashSet<>(); //в сет можно добавлять только один экземпляр элемента, в Hash эдементы
//        хранятся в порядке, не зависящем от того,как мы их записываем
//        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());// хранятся в отсортированном порядке,не зависимо от того как мы записываем
//        Set<Integer> set = new LinkedHashSet<>();// хранит элементы в порядке их добавления
//
//        set.addAll(Arrays.asList(4,544,623,77,77,8,8,4,2,2,2));
//        System.out.println(set);
//        set.add(2556);
//        System.out.println(set);

//        Set<Integer> setA = new TreeSet<>(Arrays.asList(1,2,3,4,5));
//        System.out.println("A = " + setA);
//        Set<Integer> setB = new TreeSet<>(Arrays.asList(1,3,5,7,9));
//        System.out.println("B = " + setB);

//        setA.addAll(setB);
//        System.out.println("A + B = " + setA);

//        setA.retainAll(setB);
//        System.out.println("A * B = " + setA);

//        setA.removeAll(setB);
//        System.out.println("A -  B = " + setA);


//        Map<String, Integer> map = new HashMap<>();// работает быстрее всего? используется чтобы просто удалять/добавлять в коллекцию и искать есть или нет
//        Map<String, Integer> map = new LinkedHashMap<>(); // если нужно ходить по коллекции туда-сюда
//        Map<String, Integer> map = new TreeMap<>(); // если по какой-то причине нам важен порядок добавления элементов

//        map.put("vaska" , 3);
//        map.put("murka" , 4);
//        map.put("barsik" , 2);
//        map.put("murka" , 7);
//
//        System.out.println(map);

//        map.forEach((k,v) -> {
//            System.out.println("key = " + k + ", value = " + v);
//        });
//
//        for (Map.Entry<String, Integer> entry: map.entrySet()) {
//            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue()); //другой способ обхода коллеции , более старый
//        }

//        Set<String> keys = map.keySet(); // множество ключей
//        Collection<Integer> values = map.values();//коллекция значений
//        Set<Map.Entry<String, Integer>> entries = map.entrySet(); //вернет все связки и ключ/значения

        Random random = new Random();
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < 100 ; i++) {
          int num = random.nextInt(10);
//          Integer count = hm.get(num);
//          hm.put(num, count == null ? 1 : count+1);

            hm.put(num,hm.getOrDefault(num,0) + 1);
        }

        System.out.println(hm);
    }
}
