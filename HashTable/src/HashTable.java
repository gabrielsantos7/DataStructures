import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class HashTable<K, V> {
    private class Entry {
        private final K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    private LinkedList<Entry>[] table;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    // Suprimir avisos de validação de declaração de array de genéricos
    @SuppressWarnings("unchecked")
    public HashTable() {
        this.table = new LinkedList[DEFAULT_CAPACITY];
        this.size = 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % this.table.length;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void put(K key, V value) {
        int index = this.hash(key);

        if (this.table[index] == null) {
            this.table[index] = new LinkedList<>();
        }

        for (Entry entry : this.table[index]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        this.table[index].add(new Entry(key, value));
        this.size++;

        if ((double) this.size / this.table.length >= DEFAULT_LOAD_FACTOR) {
            this.resize();
        }
    }

    public V get(K key) {
        int index = this.hash(key);

        if (this.table[index] == null) {
            return null;
        }

        for (Entry entry : this.table[index]) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        return null;
    }

    public boolean remove(K key) {
        int index = this.hash(key);

        if (this.table[index] == null) {
            return false;
        }

        for (Entry entry : this.table[index]) {
            if (entry.getKey().equals(key)) {
                this.table[index].remove(entry);
                this.size--;
                return true;
            }
        }

        return false;
    }

    public boolean containsKey(K key) {
        return this.get(key) != null;
    }

    public boolean containsValue(V value) {
        for (LinkedList<Entry> bucket : this.table) {
            if (bucket != null) {
                for (Entry entry : bucket) {
                    if (entry.getValue().equals(value)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    // Suprimir avisos de validação de declaração de array de genéricos
    @SuppressWarnings("unchecked")
    private void resize() {
        LinkedList<Entry>[] oldTable = this.table;
        this.table = new LinkedList[this.table.length * 2];
        this.size = 0;

        for (LinkedList<Entry> bucket : oldTable) {
            if (bucket != null) {
                for (Entry entry : bucket) {
                    this.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public Set<K> keySet() {
        Set<K> keySet = new HashSet<>();
        for (LinkedList<Entry> bucket : this.table) {
            if (bucket != null) {
                for (Entry entry : bucket) {
                    keySet.add(entry.getKey());
                }
            }
        }

        return keySet;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ "); 
    
        boolean first = true;
        for (int i = 0; i < this.table.length; i++) {
            if (this.table[i] != null) {
                for (Entry entry : this.table[i]) {
                    if (!first) {
                        sb.append(", "); 
                    }
                    first = false; 
    
                    sb.append(entry.getKey()).append(": ").append(entry.getValue()); // Chave e valor
                }
            }
        }
    
        sb.append(" }");
        return sb.toString();
    }
    
}
