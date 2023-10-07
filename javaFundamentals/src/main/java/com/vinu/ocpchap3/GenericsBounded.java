package com.vinu.ocpchap3;

/**
 * @author Vinu Prabhakaran
 * on Oct 07,2023
 * There may be times when you'll want to restrict the kinds of types that are allowed to be passed to a type
 * parameter. For example, a method that operates on numbers might only want to accept instances of Number
 * or its subclasses. This is what bounded type parameters are for.
 *
 * <p>To declare a bounded type parameter, list the type parameter's name, followed by the extends keyword,
 * followed by its upper bound.
 */
public class GenericsBounded {

    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n",
                3, 4, 5, maximum( 3, 4, 5 ));

        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
                6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));

        System.out.printf("Max of %s, %s and %s is %s\n","pear",
                "apple", "orange", maximum("pear", "apple", "orange"));
    }

    /**
     *<p>T has been set an upper bound here. It should be of a Class type which implements
     * Comparable interface. Note that the keyword extends is used even when it is an interface
     * <p> In case a class is passed as bound,
     * it should be passed first before interface otherwise compile time error will occur.
     * <p> If T should be subtype of Number class and must implments Comparable interface,
     * then the signature of maximum method should be like
     * <p>public static &lt;T extends Number & Comparable&lt;T&gt;&gt; maximum(T x,T y,T z)</p>
     * @param x
     * @param y
     * @param z
     * @return
     * @param <T>
     */
    public static <T extends Comparable<T>> T maximum(T x,T y,T z){
        T max = x;
        if (y.compareTo(max) > 0){
            max = y;
        }
        if (z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }
}

