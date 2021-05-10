package com.MyProject;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello world!!!");

        MyLinkedList<Integer> My = new MyLinkedList<Integer>();
        LinkedList<Integer> NotMy = new LinkedList<Integer>();
        ArrayList<Integer> NotNotMy = new ArrayList<Integer>();
        long MyStart;
        long MyEnd;
        long MyAdd = 0;
        long MyIndexAdd = 0;
        long MyGet = 0;
        long MyIndexOf = 0;
        long MyRemove = 0;
        long MySet = 0;

        long NotMyStart = 0;
        long NotMyEnd = 0;
        long NotMyAdd = 0;
        long NotMyIndexAdd = 0;
        long NotMyGet = 0;
        long NotMyIndexOf = 0;
        long NotMyRemove = 0;
        long NotMySet = 0;

        long NotNotMyStart = 0;
        long NotNotMyEnd = 0;
        long NotNotMyAdd = 0;
        long NotNotMyIndexAdd = 0;
        long NotNotMyGet = 0;
        long NotNotMyIndexOf = 0;
        long NotNotMyRemove = 0;
        long NotNotMySet = 0;

        int iter = 10000; // итераций
        int col = 100; // повторов

        for (int i = 0; i < col; i++) {
            MyStart = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                My.add(j);
            }
            MyEnd = System.nanoTime();
            MyAdd += MyEnd - MyStart;

            MyStart = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                My.get(j);
            }
            MyEnd = System.nanoTime();
            MyGet += MyEnd - MyStart;

            MyStart = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                My.indexOf(j);
            }
            MyEnd = System.nanoTime();
            MyIndexOf += MyEnd - MyStart;

            MyStart = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                My.set(j,j);
            }
            MyEnd = System.nanoTime();
            MySet += MyEnd - MyStart;

            MyStart = System.nanoTime();
            for (int j = iter - 1; j >= 0; j--) {
                My.remove(j);
            }
            MyEnd = System.nanoTime();
            MyRemove += MyEnd - MyStart;

            My.add(1);

            MyStart = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                My.add(j,j);
            }
            MyEnd = System.nanoTime();
            MyIndexAdd += MyEnd - MyStart;

            My.clear();

///////////////////////////////////////////////////Linked list////////////////////////////////////////////
            NotMyStart = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                NotMy.add(j);
            }
            NotMyEnd = System.nanoTime();
            NotMyAdd += NotMyEnd - NotMyStart;

            NotMyStart = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                NotMy.get(j);
            }
            NotMyEnd = System.nanoTime();
            NotMyGet += NotMyEnd - NotMyStart;

            NotMyStart = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                NotMy.indexOf(j);
            }
            NotMyEnd = System.nanoTime();
            NotMyIndexOf += NotMyEnd - NotMyStart;

            NotMyStart = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                NotMy.set(j,j);
            }
            NotMyEnd = System.nanoTime();
            NotMySet += NotMyEnd - NotMyStart;

            NotMyStart = System.nanoTime();
            for (int j = iter - 1; j >= 0; j--) {
                NotMy.remove(j);
            }
            NotMyEnd = System.nanoTime();
            NotMyRemove += NotMyEnd - NotMyStart;

            NotMy.add(1);

            NotMyStart = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                NotMy.add(j,j);
            }
            NotMyEnd = System.nanoTime();
            NotMyIndexAdd += NotMyEnd - NotMyStart;

            NotMy.clear();

///////////////////////////////////////////////////////Array/////////////////////////////////////
            NotNotMyStart = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                NotNotMy.add(j);
            }
            NotNotMyEnd = System.nanoTime();
            NotNotMyAdd += NotNotMyEnd - NotNotMyStart;

            NotNotMyStart = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                NotNotMy.get(j);
            }
            NotNotMyEnd = System.nanoTime();
            NotNotMyGet += NotNotMyEnd - NotNotMyStart;

            NotNotMyStart = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                NotNotMy.indexOf(j);
            }
            NotNotMyEnd = System.nanoTime();
            NotNotMyIndexOf += NotNotMyEnd - NotNotMyStart;

            NotNotMyStart = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                NotNotMy.set(j,j);
            }
            NotNotMyEnd = System.nanoTime();
            NotNotMySet += NotNotMyEnd - NotNotMyStart;

            NotNotMyStart = System.nanoTime();
            for (int j = iter - 1; j >= 0; j--) {
                NotNotMy.remove(j);
            }
            NotNotMyEnd = System.nanoTime();
            NotNotMyRemove += NotNotMyEnd - NotNotMyStart;

            NotNotMy.add(1);

            NotNotMyStart = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                NotNotMy.add(j,j);
            }
            NotNotMyEnd = System.nanoTime();
            NotNotMyIndexAdd += NotNotMyEnd - NotNotMyStart;

            NotNotMy.clear();
            System.out.println("one iter complete!");
        }

        System.out.println("MyAdd = " + MyAdd/(long)col);
        System.out.println("MyGet = " + MyGet/(long)col);
        System.out.println("MyIndexOf = " + MyIndexOf/(long)col);
        System.out.println("MySet = " + MySet/(long)col);
        System.out.println("MyRemove = " + MyRemove/(long)col);
        System.out.println("MyIndexAdd = " + MyIndexAdd/(long)col);
        System.out.println("----------------------NotMy-----------------------------------");
        System.out.println("NotMyAdd = " + NotMyAdd/(long)col);
        System.out.println("NotMyGet = " + NotMyGet/(long)col);
        System.out.println("NotMyIndexOf = " + NotMyIndexOf/(long)col);
        System.out.println("NotMySet = " + NotMySet/(long)col);
        System.out.println("NotMyRemove = " + NotMyRemove/(long)col);
        System.out.println("NotMyIndexAdd = " + NotMyIndexAdd/(long)col);
        System.out.println("----------------------NotNotMy-----------------------------------");
        System.out.println("NotNotMyAdd = " + NotNotMyAdd/(long)col);
        System.out.println("NotNotMyGet = " + NotNotMyGet/(long)col);
        System.out.println("NotNotMyIndexOf = " + NotNotMyIndexOf/(long)col);
        System.out.println("NotNotMySet = " + NotNotMySet/(long)col);
        System.out.println("NotNotMyRemove = " + NotNotMyRemove/(long)col);
        System.out.println("NotNotMyIndexAdd = " + NotNotMyIndexAdd/(long)col);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        HashSet<Integer> HashSet = new HashSet<Integer>();
        LinkedHashSet<Integer> LinkedHashSet = new LinkedHashSet<Integer>();
        TreeSet<Integer> TreeSet = new TreeSet<Integer>();

        long OneStart;
        long OneEnd;
        long Add = 0;
        long TwoStart;
        long TwoEnd;
        long Contains = 0;
        long ThreeStart;
        long ThreeEnd;
        long Remove = 0;

        long OneStart2;
        long OneEnd2;
        long Add2 = 0;
        long TwoStart2;
        long TwoEnd2;
        long Contains2 = 0;
        long ThreeStart2;
        long ThreeEnd2;
        long Remove2 = 0;

        long OneStart3;
        long OneEnd3;
        long Add3 = 0;
        long TwoStart3;
        long TwoEnd3;
        long Contains3 = 0;
        long ThreeStart3;
        long ThreeEnd3;
        long Remove3 = 0;

        for (int i = 0; i < col; i ++) {
            OneStart = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                HashSet.add(j);
            }
            OneEnd = System.nanoTime();
            Add += OneEnd - OneStart;


            TwoStart = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                HashSet.contains(j);
            }
            TwoEnd = System.nanoTime();
            Contains += TwoEnd - TwoStart;

            ThreeStart = System.nanoTime();
            for (int j = iter - 1; j >= 0 ; j--) {
                HashSet.remove(j);
            }
            ThreeEnd = System.nanoTime();
            Remove += ThreeEnd - ThreeStart;
            /////////////////////////////////////////////////////
            OneStart2 = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                LinkedHashSet.add(j);
            }
            OneEnd2 = System.nanoTime();
            Add2 += OneEnd2 - OneStart2;


            TwoStart2 = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                LinkedHashSet.contains(j);
            }
            TwoEnd2 = System.nanoTime();
            Contains2 += TwoEnd2 - TwoStart2;

            ThreeStart2 = System.nanoTime();
            for (int j = iter - 1; j >= 0 ; j--) {
                LinkedHashSet.remove(j);
            }
            ThreeEnd2 = System.nanoTime();
            Remove2 += ThreeEnd2 - ThreeStart2;
            //////////////////////////////////////////////////
            OneStart3 = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                TreeSet.add(j);
            }
            OneEnd3 = System.nanoTime();
            Add3 += OneEnd3 - OneStart3;


            TwoStart3 = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                TreeSet.contains(j);
            }
            TwoEnd3 = System.nanoTime();
            Contains3 += TwoEnd3 - TwoStart3;

            ThreeStart3 = System.nanoTime();
            for (int j = iter - 1; j >= 0 ; j--) {
                TreeSet.remove(j);
            }
            ThreeEnd3 = System.nanoTime();
            Remove3 += ThreeEnd3 - ThreeStart3;
            System.out.println("one iter complete for Set");
        }

        System.out.println("add = " + Add/(long)col);
        System.out.println("add2 = " + Add2/(long)col);
        System.out.println("add3 = " + Add3/(long)col);
        System.out.println("contains = " + Contains/(long)col);
        System.out.println("contains2 = " + Contains2/(long)col);
        System.out.println("contains3 = " + Contains3/(long)col);
        System.out.println("remove = " + Remove/(long)col);
        System.out.println("remove2 = " + Remove2/(long)col);
        System.out.println("remove3 = " + Remove3/(long)col);
//////////////////////////////////////////////////////////////////////////////////////////////////////////

        HashMap<Integer, Integer> HashMap = new HashMap<>();
        LinkedHashMap<Integer, Integer> LinkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, Integer> TreeMap = new TreeMap<>();

        long Start11;
        long End11;
        long Put1 = 0;
        long Start12;
        long End12;
        long Get1 = 0;
        long Start13;
        long End13;
        long Rem1 = 0;

        long Start21;
        long End21;
        long Put2 = 0;
        long Start22;
        long End22;
        long Get2 = 0;
        long Start23;
        long End23;
        long Rem2 = 0;

        long Start31;
        long End31;
        long Put3 = 0;
        long Start32;
        long End32;
        long Get3 = 0;
        long Start33;
        long End33;
        long Rem3 = 0;

        for (int i = 0; i < col; i ++) {
            Start11 = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                HashMap.put(j,j);
            }
            End11 = System.nanoTime();
            Put1 += End11 - Start11;

            Start12 = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                HashMap.get(j);
            }
            End12 = System.nanoTime();
            Get1 += End12 - Start12;

            Start13 = System.nanoTime();
            for (int j = iter - 1; j >= 0 ; j--) {
                HashMap.remove(j);
            }
            End13 = System.nanoTime();
            Rem1 += End13 - Start13;
            /////////////////////////////////////////////////////
            Start21 = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                LinkedHashMap.put(j,j);
            }
            End21 = System.nanoTime();
            Put2 += End21 - Start21;

            Start22 = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                LinkedHashMap.get(j);
            }
            End22 = System.nanoTime();
            Get2 += End22 - Start22;

            Start23 = System.nanoTime();
            for (int j = iter - 1; j >= 0 ; j--) {
                LinkedHashMap.remove(j);
            }
            End23 = System.nanoTime();
            Rem2 += End23 - Start23;
            //////////////////////////////////////////////////
            Start31 = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                TreeMap.put(j,j);
            }
            End31 = System.nanoTime();
            Put3 += End31 - Start31;

            Start32 = System.nanoTime();
            for (int j = 0; j < iter; j++) {
                TreeMap.get(j);
            }
            End32 = System.nanoTime();
            Get3 += End32 - Start32;

            Start33 = System.nanoTime();
            for (int j = iter - 1; j >= 0 ; j--) {
                TreeMap.remove(j);
            }
            End33 = System.nanoTime();
            Rem3 += End33 - Start33;
            System.out.println("one iter complete for Map");
        }

        System.out.println("put1 = " + Put1/(long)col);
        System.out.println("put2 = " + Put2/(long)col);
        System.out.println("put3 = " + Put3/(long)col);
        System.out.println("get1 = " + Get1/(long)col);
        System.out.println("get2 = " + Get2/(long)col);
        System.out.println("get3 = " + Get3/(long)col);
        System.out.println("remove1 = " + Rem1/(long)col);
        System.out.println("remove2 = " + Rem2/(long)col);
        System.out.println("remove3 = " + Rem3/(long)col);
    }
}
