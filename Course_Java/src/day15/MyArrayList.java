package day15;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//debug理想数据和得到的数据比较了如果一样就对了，如果不一样，就看哪里错了
public class MyArrayList implements List {
	private Object[] data = new Object[10];
	private int size = 0;

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator iterator() {
		//内部类可以共享外部类的资源
		return new Iterator(){
			//游标默认是第一个元素的前面 
			int cursor = -1;
			public boolean hasNext() {
				return cursor < size - 1;
			}
			public Object next() {
				return data[++cursor];
			}
			public void remove() {				
			}
		};
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		
		return Arrays.copyOf(data, size);
	}

	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean add(Object e) {
		// TODO Auto-generated method stub
		// 添加东西之前看看数组是不是需要加了，还能不能加了
		// 可以加空
		expandArray();
		data[size++] = e;

		return true;
	}

	/** 检查数组是不是满了如果潢了弄成1.5倍 */
	private void expandArray() {
		if (size == data.length) {
			// 原先数组长度是1的话永远不可能增长
			int length = data.length / 2 + data.length;
			// data = Arrays.copyOf(data, length);
			// copyOf里面就是下面三行代码
			// 1.6里面才有了copyof
			Object[] temp = new Object[length];
			System.arraycopy(data, 0, temp, 0, length);
			data = temp;
		}
	}

	public boolean remove(Object o) {
		int index = indexOf(o);
		if(index == -1){
			return false;
		}
		remove(index);
		return true;
	}

	public boolean containsAll(Collection c) {
		return false;
	}

	public boolean addAll(Collection c) {
		for(Iterator i =c.iterator(); i.hasNext();){
			add(i.next());
		}
		return true;
	}

	public boolean addAll(int index, Collection c) {
		return false;
	}

	public boolean removeAll(Collection c) {
		return false;
	}

	public boolean retainAll(Collection c) {
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		// 把数组删除了，Java中如果一个对象 没有被任何对象引用，那就会被回收了，旧数组回收了
		//
		data = new Object[10];
		size = 0;
	}

	public Object get(int index) {
		return null;
	}

	public Object set(int index, Object element) {
		return null;
	}

	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		expandArray();
		for (int i = size; i < index; i--) {
			data[i] = data[i - 1];
		}
		data[index] = element;
		// 插入完了之后要加一了，亲，表示了个元素
		size++;
	}

	public Object remove(int index) {
		Object o = data[index];
		for(int i = index; i <= size - 2; i++){
			data[i] = data[i++];
		}
		data[--size] = null;
		return o;
	}

	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++) {
			// 对象数组，
			// 假如data[i]是空的，那么空的引用是空的.调用equals方法 就会出现空指针异常
			// if(data[i] != null && data[i].equals(o)){
			// 可能为空，空和空相当
			// 凡是用equals方法的时候要看看前面的方法 会不会出现空的情况
			// 下面的这个举上个例子
			if (data[i] == o || data[i] != null && data[i].equals(o)) {
				return i;
			}
			return -1;
		}
		return 0;
	}

	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
