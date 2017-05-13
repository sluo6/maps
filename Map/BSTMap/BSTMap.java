package BSTMap;

import java.util.Iterator;
import java.util.Set;

public class BSTMap<K extends Comparable<K>, V> implements Map61B<K, V>{
	private Node root;		//root of BSTMap
	
//Node definition
	private class Node {
		private K key;		//sorted by key
		private V val;		//associated data
		private Node left, right;		//number of nodes in subtree
		private int size;		//number of nodes in subtree
		
		public Node (K key, V val, int size) {
			this.key = key;
			this.val = val;
			this.size = size;
		}
	}
/** Initializes an empty BSTMap.	
 */
public BSTMap() {
}


	@Override
	public Iterator<K> iterator() {
		throw new UnsupportedOperationException("iterator is not supported!");
	}

	
	@Override
	/** Removes all of the mappings from this map. */
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
		return size(root);
	}
	
	/** return number of k-v pairs in BSTMap rooted at x. */
	private int size(Node x) {
		if (x == null) return 0;
		else return x.size;
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
