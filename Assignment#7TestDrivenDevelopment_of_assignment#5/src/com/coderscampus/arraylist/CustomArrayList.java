package com.coderscampus.arraylist;


public class CustomArrayList<T> implements CustomList<T> {
	
	Integer x = 10;
	Object[] items = new Object[x];

	@Override
	public boolean add(T item) {
		int elements = getSize();
		if (items.length > elements) {
			items[elements] = item;
			return true;
			
		} else if (items.length == elements) {
			x = x * 2;
			Object[] newItems = new Object[x];
			for (int i = 0; i < elements; i++) {
				newItems[i] = items[i];
				System.out.println(" copied name is " + newItems[i]);
			}
			items = newItems;
			items[elements] = item;
			return true;
			
		}
		return false;
	}

	@Override
	public int getSize() {
		int countOfElements = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {
				countOfElements ++;
			}
		}
		
		return countOfElements;
	}

	@Override
	public T get(int index) {
		T getObject = (T) items[index];
		return getObject;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		
		final int element = index;
		
		if (element > (items.length - 1)) {
			System.out.println("This index is not valid. Please choose a valid index!");
			return false;
		}
		Object[] makeSpaceArray= new Object[x];
		
		int i = element;
		while (i < items.length - 1){
			makeSpaceArray[i] = items[i];
			i++;
		}
		items[element] = item;
		
		int i2 = element + 1;
		while (i2 < makeSpaceArray.length - 1) {
			items[i2] = makeSpaceArray[i2 - 1];
			i2++;
		}
		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		final int element = index;
		T removedElement = (T) items[index];
		
		if (element > (items.length - 1) || element < 0) {
			System.out.println("This index is not valid. Please choose a valid index!");
			return null;
		}
		Object[] makeSpaceArray= new Object[x];
		
		int i = element + 1;
		while (i < items.length - 1){
			makeSpaceArray[i] = items[i];
			i++;
		}
		int lastItem = items.length - 1;
		items[lastItem] = null;
		
		int i2 = element;
		while (i2 < makeSpaceArray.length - 1) {
			items[i2] = makeSpaceArray[i2 + 1];
			i2++;
		}
		
		return removedElement;
	}
	
}
