package hash;

public class MyHashSet {
    public Slot[] hashTable;

    public MyHashSet(int size) {
        this.hashTable = new Slot[size];
    }

    public static class Slot {
        String key;
        String value;
        Slot next;

        public Slot(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public void append(String key, String value) {
            Slot slot = this;
            while (slot.next != null) {
                slot = slot.next;
            }
            slot.next = new Slot(key, value);
        }

        public boolean search(String value) {
            Slot slot = this;
            while (slot.next != null) {
                if (this.value.equals(value)) {
                    return true;
                }
                slot = slot.next;
            }
            return false;
        }
    }

    public int hashFunc(String key) {
        return (int)(key.charAt(0)) % this.hashTable.length;
    }

    public void saveData(String key, String value) {
        int address = hashFunc(key);
        Slot slot = hashTable[address];

        if (slot != null) {
            hashTable[address].append(key, value);
            return;
        }

        hashTable[address] = new Slot(key, value);
    }

    public String getData(String key) {
        int address = hashFunc(key);
        Slot slot = hashTable[address];
        while (slot != null) {
            if (slot.key.equals(key)) {
                return slot.value;
            }
            slot = slot.next;
        }

        return null;
    }

}
