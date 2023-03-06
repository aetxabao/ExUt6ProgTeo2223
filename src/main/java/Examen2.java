import java.util.*;

public class Examen2 {

    public static void main(String[] args) {
        ej1();
        ej2();
        ej3();
        ej4();
        ej5();
        ej6();
        ej7();
        ej8();
        ej9();
        ej10();
        ej11();
        ej12();
        ej13();
        ej14();
        ej15();
        ej16();
    }

    /**
     *     a) [cc, bb, aa]
     *     b) [cc, aa, bb]
     *     c) [aa, cc, bb]
     *     d) [cc, bb, 1, aa]
     */
    private static void ej1() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("cc");
        lista.add("bb");
        lista.add(1, "aa");
        System.out.println(lista.toString());
    }

    /**
     *     a) false true
     *     b) false false
     *     c) true false
     *     d) true true
     */
    private static void ej2() {
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("A");
        lista1.add("B");
        lista1.add("A");
        var lista2 = (ArrayList<String>) lista1.clone();
        lista2.add(2,"A");
        boolean b1 = lista1.get(0).equals(lista2.get(0));
        lista2.remove(0);
        boolean b2 = lista1.get(1).equals(lista2.get(1));
        System.out.println(b1 + " " + b2);
    }

    /**
     *     a) [1, 2, 8, 2, 4]
     *     b) [1, 2, 2, 4, 2, 8]
     *     c) [1, 2, 8, 4]
     *     d) [1, 3, 1, 4, 2, 8]
     */
    private static void ej3() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.addAll(Arrays.asList(1, 3, 2));
        lista.add(4);
        lista.add(2, 8);
        lista.set(1, 2);
        System.out.println(lista.toString());
    }

    /**
     *     a) [1, 3]
     *     b) [2, 3]
     *     c) [1, 2, 3]
     *     d) [1, 2]
     */
    private static void ej4() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.remove(2);
        System.out.println(lista.toString());
    }

    /**
     *     a) [1, 2, 3, 1]
     *     b) [2, 3]
     *     c) [1, 3, 1]
     *     d) [1, 3]
     */
    private static void ej5() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(3);
        lista.add(1);
        while (lista.remove((Object)Integer.parseInt("2")));
        System.out.println(lista.toString());
    }

    /**
     *     a) [aligator]
     *     b) [aligator, tomato, potato, mosquito]
     *     c) [aligator, mosquito, tomato, potato]
     *     d) [aligator, mosquito, potato, tomato]
     */
    private static void ej6() {
        String[] palabras = {"potato", "tomato", "aligator", "mosquito"};
        ArrayList<String> lista = new ArrayList<>();
        Collections.addAll(lista, palabras);
        for (int i = lista.size()-1; i >= 0; i--) {
            if (lista.get(i).endsWith("to")){
                String palabra = lista.remove(i);
                lista.add(palabra);
            }
        }
        System.out.println(lista.toString());
    }

    /**
     *     a) 4
     *     b) 3
     *     c) 6
     *     d) 2
     */
    private static void ej7() {
        ArrayList<String> lista = new  ArrayList<>();
        Collections.addAll(lista, new String[]{ "A", "B", "B", "C" });
        lista.add( "C" );
        HashSet<String> conjunto = new HashSet<>();
        conjunto.addAll(lista);
        conjunto.add( "A" );
        conjunto.remove( "B" );
        System.out.println( conjunto.size() );
    }

    /**
     *     a) alberto
     *     b) juan
     *     c) luis
     *     d) ana
     */
    private static void ej8() {
        TreeMap<String, String> map = new TreeMap<>();
        map.put( "luis", "alberto" );
        map.put( "juan", "alberto" );
        map.put( "luis", "juan" );
        map.put( "juan", "ana" );
        System.out.println( map.get("juan") );
    }

    /**
     *     a) FEBMARENEABR
     *     b) MARENEFEBABR
     *     c) ABRENEFEBMAR
     *     d) 3.25.46.78.3
     */
    private static void ej9() {
        TreeMap<String, Double> mapa = new TreeMap<>();
        mapa.put( "FEB", 6.7 );
        mapa.put( "MAR", 3.2 );
        mapa.put( "ENE", 5.4 );
        mapa.put( "ABR", 8.3 );
        String word = "";
        for (String s : mapa.keySet()) {
            word += s;
        }
        System.out.println(word);
    }

    /**
     *     a) FEBMARENEABR-28313130
     *     b) MARENEFEBABR-31312830
     *     c) ABRENEFEBMAR-30312831
     *     d) 28313130-FEBMARENEABR
     */
    private static void ej10() {
        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();
        mapa.put( "FEB", 28 );
        mapa.put( "MAR", 31 );
        mapa.put( "ENE", 31 );
        mapa.put( "ABR", 30 );
        String mon = "";
        String cod = "";
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            mon += entry.getKey();
            cod += entry.getValue();
        }
        System.out.println(mon + "-" + cod);
    }

    /**
     *     a) false-true
     *     b) false-false
     *     c) true-false
     *     d) false-null
     */
    private static void ej11() {
        HashMap<String, Boolean> bag = new HashMap<>();
        bag.put( "alain", true );
        bag.put( "adela", false );
        bag.put( "lander", true );
        Boolean b1 = bag.get( "adela" );
        Boolean b2 = bag.get( "lorea" );
        System.out.println( b1 + "-" + b2 );
    }

    /**
     *     a) 984
     *     b) 1931
     *     c) 1979
     *     d) 1984
     */
    private static void ej12() {
        HashMap<Character, Integer> tabla = new HashMap<>();
        String letras = "MDCLXVI";
        int[] numeros = {1000, 500, 100, 50, 10, 5, 1};
        for (int i = 0; i < letras.length(); i++) {
            tabla.put(letras.charAt(i), numeros[i]);
        }
        String ano = "MCMLXXXIV";
        int num = 0;
        for (int i = ano.length()-2; i > 0 ; i--) {
            int act = tabla.get(ano.charAt(i));
            int aux = tabla.get(ano.charAt(i+1));
            if (act < aux) {
                num -= act;
            } else {
                num += act;
            }
        }
        num += tabla.get(ano.charAt(ano.length()-1));
        System.out.println(num);
    }

    /**
     *     a) [1, 2, 11, 33]
     *     b) [1, 11, 2, 33]
     *     c) [3]
     *     d) [1, 11, 2, 3, 33]
     */
    private static void ej13() {
        TreeSet<Integer> c1 = new TreeSet<>();
        HashSet<Integer> c2 = new HashSet<>();
        c1.addAll( Arrays.asList( 1, 11, 2, 3, 33 ) );
        c2.addAll( Arrays.asList( 1, 11, 2, 33 ) );
        c1.retainAll(c2);
        System.out.println(c1);
    }

    /**
     *     a) [1, 1]
     *     b) [2, 2]
     *     c) [2, 1]
     *     d) [1, 2]
     */
    private static void ej14() {
        TreeMap<Integer, Integer> m = new TreeMap<>();
        m.put(1,1);
        m.put(2,2);
        m.put(2,1);
        m.put(1,2);
        Iterator<Map.Entry<Integer, Integer>> it =
                m.entrySet().iterator();
        while (it.hasNext())  {
            System.out.print(
                    it.next().getKey() + " " +
                            it.next().getValue() + " " );
        }
        System.out.println();
    }

    /**
     *     a) 4
     *     b) 1
     *     c) 2
     *     d) 3
     */
    private static void ej15() {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(1,1);
        map.put(3,2);
        map.put(2,1);
        map.put(1,2);
        Iterator<Map.Entry<Integer, Integer>> iter =
                map.entrySet().iterator();
        while (iter.hasNext())  {
            if (iter.next().getValue() == 1) {
                iter.remove();
            }
        }
        System.out.println(map.size());
    }

    /**
     *     a) 3 1 2 1
     *     b) 1 3 2
     *     c) 3 2 1
     *     d) 2 1 3
     */
    private static void ej16() {
        TreeMap<Car, Integer> plazas = new TreeMap<>();
        plazas.put( new Car("ABC8888"), 3 );
        plazas.put( new Car("xyz7777"), 1 );
        plazas.put( new Car("XYZ7777"), 2 );
        plazas.put( new Car("ABC1234"), 1 );
        for (Integer value : plazas.values()) {
            System.out.print(value + " ");
        }
    }

    public static class Car implements Comparable<Car> {
        String matricula;

        public Car(String matricula) {
            this.matricula = matricula;
        }

        @Override
        public int compareTo(Car o) {
            return this.matricula.toUpperCase().compareTo(o.matricula.toUpperCase());
        }
    }

}
