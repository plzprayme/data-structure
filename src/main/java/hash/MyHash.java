package hash;

public class MyHash {
    public Slot[] hashTable;

    public MyHash(Slot[] hashTable) {
        this.hashTable = hashTable;
    }

    public static class Slot {
        String value;
        Slot(String value) {
            this.value = value;
        }
    }

    public int hashFunc(String key) {
        return (int) (key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        int address = hashFunc(key);
        Slot slot = hashTable[address];

        if (slot != null) {
            slot.value = value;
            return true;
        }

        slot = new Slot(value);
        return true;
    }

    public String getData(String key) {
        int address = hashFunc(key);
        Slot slot = hashTable[address];

        if (slot != null) {
            return slot.value;
        }

        return null;
    }
}
