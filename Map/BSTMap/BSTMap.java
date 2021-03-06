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
		this.root = null;	
	}

	@Override
	public boolean containsKey(K key) {
		if (key == null) throw new IllegalArgumentException("argument to contains() is null");
		return get(key) != null;
	}

	@Override
	/** Search the BSTMap for the value that associates with a key. */
	public V get(K key) {
		return get(root, key);
	}
	
	private V get(Node x, K key) {
		if (key == null) throw new IllegalArgumentException("called get() with a null key");
		if (x == null) 
			return null;
		int cmp = key.compareTo(x.key);
		if (cmp < 0) 
			return get(x.left, key);
		else if (cmp > 0) 
			return get(x.right, key);
		else 
			return x.val;
	}

	@Override
	/** Return number of key-value pairs. */
	public int size() {
		return size(root);
	}
	
	/** return number of k-v pairs in BSTMap rooted at x. */
	private int size(Node x) {
		if (x == null) return 0;
		else return x.size;
	}

	@Override
	/** Insert a key-value pair in BSTMap. */
	public void put(K key, V value) {
		if (key == null) throw new IllegalArgumentException("called put() with a null key");
		if (value == null) {
			remove(key);
			return;
		}
		root = put(root, key, value);		
	}

	private Node put(Node x, K key, V value) {
		if (x == null)
			return new Node(key, value, 1);
		int cmp = key.compareTo(x.key);
		if (cmp < 0) x.left = put(x.left, key, value);
		else if (cmp > 0) x.right = put(x.right, key, value);
		else x.val = value;     //overwriting the old value with the new value
		x.size = 1 + size(x.left) + size(x.right);
		return x;
	}
	
	@Override
	public Set<K> keySet() {
		throw new UnsupportedOperationException("keySet is not supported!");
	}

	@Override
	/** Remove the specified key and its associated value. */
	public V remove(K key) {
	    
	}

	@Override
	public V remove(K key, V value) {
		throw new UnsupportedOperationException("remove is not supported!");
	}
	
	
	/** Print out map in order of increasing Key. */
	public void printInOrder(BSTMap<K, V> T) {
		
	}

	

}
