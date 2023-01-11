package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int size = 0; // The current size of the array list

	@Override
	public boolean add(T item) {
		checkArrSize();
		items[size++] = item;
		return true;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		checkArrSize();
		inboundsCheck(index);
		Object[] itemArrCopy = new Object[size + 1];
		System.arraycopy(items, 0, itemArrCopy, 0, index);
		itemArrCopy[index] = item;
		System.arraycopy(items, index, itemArrCopy, index + 1, size - index);
		items = itemArrCopy;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		inboundsCheck(index);
		return (T) items[index];
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		inboundsCheck(index);
		T itemRemoved = get(index);
		Object[] tempItems = new Object[items.length];
		System.arraycopy(items, 0, tempItems, 0, index);
		System.arraycopy(items, index + 1, tempItems, index, size - index - 1);
		items = tempItems;
		size--;
		return itemRemoved;
	}

	private void checkArrSize() {
		if (size == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}
	}

	private void inboundsCheck(int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}

	}
}
