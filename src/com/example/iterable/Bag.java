package com.example.iterable;

import java.util.*;
import java.util.function.Consumer;

public class Bag<T> implements Container<T>{

    private List <T> values;

    public Bag() {
        this.values = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return values.isEmpty();
    }

    @Override
    public int size() {
        return values.size();
    }

    @Override
    public void add(T t) {
        values.add(t);
    }

    @Override
    public Iterator<T> iterator() {
        return values.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        values.forEach(System.out::println);
    }


    @Override
    public Spliterator<T> spliterator() {
        return values.spliterator();
    }


}
