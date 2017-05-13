package BSTMap;

import java.util.Iterator;
import java.util.Set;

public class BSTMap<K extends Comparable<K>, V> implements Map61B<K, V>{

	@Override
	public Iterator<K> iterator() {
		throw new UnsupportedOperationException("iterator is not supported!");
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsKey(K key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void put(K key, V value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<K> keySet() {
		throw new UnsupportedOperationException("keySet is not supported!");
	}

	@Override
	public V remove(K key) {
		throw new UnsupportedOperationException("remove is not supported!");
	}

	@Override
	public V remove(K key, V value) {
		throw new UnsupportedOperationException("remove is not supported!");
	}
	
	
	/** Print out map in order of increasing Key. */
	public void printInOrder(BSTMap<K, V> T) {
		
	}

	

}
