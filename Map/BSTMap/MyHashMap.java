package BSTMap;

import java.util.Iterator;
import java.util.Set;


public class MyHashMap <K extends Comparable<K>, V> implements Map61B <K, V>{
	
	private static final int RESIZE_FACTOR = 2;
	private static final int INIT_CAPACITY = 4;
	
	private int n;    //number of key-value pairs
	private int m;    //hash table size
	private MyHashMap<K, V>[] mhm;     //array of linked-list symbol tables
	
	
	/**
	 * Instantiate an empty symbol table.
	 * */
	public MyHashMap() {
		this(INIT_CAPACITY);
	}
	
	/**
	 * Instantiate an empty table with m chains.
	 * m is the initial number of chains.*/
	public MyHashMap(int initialSize) {
		this.m = initialSize;
		mhm = (MyHashMap<K, V>[]) new MyHashMap[initialSize];
		for (int i = 0; i < initialSize; i++)
			mhm[i] = new MyHashMap<K, V>();
	}
	
	/**
	 * Determine if the map need resizing.*/
	public MyHashMap(int initialSize, double loadFactor) {
		
	}
	
	//resize the hash table to have the given number of chains,
	//rehashing all of the keys
	private void resize(int chains) {
		MyHashMap<K, V> temp = new MyHashMap<K, V>(chains);
		for (int i = 0; i < m; i++) {
			for (K key : mhm[i].keySet()) {
				
			}
		}
	}

	
	//This need debug. will work on this later.
	@Override
	public Iterator<K> iterator() {
		Queue<K> queue = new Queue<K>();
		for (int i = 0; i < m; i++) {
			for (K key : mhm.iterator())
				queue.enqueue(key);
		}
		return (Iterator<K>) queue;		
	}
	
	//return keys in symbol table as an Iterable
	public Iterable<K> keys() {
		Queue<K> queue = new Queue<K>();
		for (int i = 0; i < m; i++) {
			for (K key : mhm.keys())
				queue.enqueue(key);
		}
		return queue;	
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void put(Object key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(Object key) {
		throw new UnsupportedOperationException("This remove operation is not supported.");
	}

	@Override
	public Object remove(Object key, Object value) {
		throw new UnsupportedOperationException("This remove operation is not supported.");
	}
	
	

}
