package hash;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyHashTest {
    @Test
    public void 삽입() {
        MyHashSet hash = new MyHashSet(20);
        hash.saveData("아녕", "하세오");
        hash.saveData("아녕", "하세오2");
        hash.saveData("아농", "하세오2");
        System.out.println("");
    }

    @Test
    public void 조회() {
        MyHashSet hash = new MyHashSet(20);
        hash.saveData("아녕", "하세오");
        hash.saveData("아녕", "하세오2");
        hash.saveData("아농", "하세오2");
        assertEquals(hash.getData("아녕"), "하세오");
        assertEquals(hash.getData("아농"), "하세오2");
    }

}