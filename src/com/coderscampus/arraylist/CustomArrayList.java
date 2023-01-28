package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
    private static final int MINIMUM_SIZE = 10;
    private Object[] items;
    private int size;

    public CustomArrayList() {
        this.items = new Object[MINIMUM_SIZE];
    }

    @Override
    public boolean add(T item) {
        ensureCapacity();
        items[size++] = item;
        return true;
    }

    @Override
    public boolean add(int index, T item) throws IndexOutOfBoundsException {
        checkIndex(index);
        ensureCapacity();
        System.arraycopy(items, index, items, index + 1, size - index);
        items[index] = item;
        size++;
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    public int getArrSize() {
        return items.length;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        checkIndex(index);
        return (T) items[index];
    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        checkIndex(index);

        @SuppressWarnings("unchecked")
        T itemRemoved = (T) items[index];
        System.arraycopy(items, index + 1, items, index, size - index - 1);
        size--;

        if (items.length > MINIMUM_SIZE && size <= (items.length / 2)) {
            items = Arrays.copyOf(items, Math.max(size, MINIMUM_SIZE));
        }

        return itemRemoved;
    }

    private void ensureCapacity() {
        if (size >= items.length) {
            items = Arrays.copyOf(items, items.length * 2);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
