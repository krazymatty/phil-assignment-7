package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int size = 0; // The current size of the array list

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			items = Arrays.copyOf(items, size * 2);
		}
		items[size++] = item;
		return true;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		inboundsCheck(index);
		if (size == items.length) {
			items = Arrays.copyOf(items, size * 2);
		}
		items[size++] = item;

		Object[] itemArrCopy = new Object[items.length];

		System.arraycopy(items, 0, itemArrCopy, 0, index);
		itemArrCopy[index] = item;
		System.arraycopy(items, index, itemArrCopy, index + 1, size - index);

		items = itemArrCopy;
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
		inboundsCheck(index);
		return (T) items[index];
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		inboundsCheck(index);

		Object[] tempItems = new Object[items.length];

		System.arraycopy(items, 0, tempItems, 0, index);
		System.arraycopy(items, index + 1, tempItems, index, size - index - 1);

		items = tempItems;
		size--;

		if (size >= 10 && size <= (items.length / 2)) {
			items = Arrays.copyOf(tempItems, items.length / 2);
		}

		T itemRemoved = get(index);
		return itemRemoved;
	}

	private void inboundsCheck(int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}

	}
}
