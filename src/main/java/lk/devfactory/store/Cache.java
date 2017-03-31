package lk.devfactory.store;

import java.util.stream.Stream;

public interface Cache<K,E> {
	public E getCacheEntry(K id);
	
	public boolean addCacheEntry(K id, E entry);
	
	public void removeCacheEntry(K id);
	
	public Stream<E> getAllEntries();
}