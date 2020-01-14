package com;/*
 * @author Xingqilin
 *
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Messages {
    private ArrayList<String> mes = new ArrayList<>();

    @Override
    public String toString() {
        return Arrays.toString(mes.toArray());
    }

    public void addone(String str) {
        mes.add(str);
    }

    public void useone(String str) {
        mes.remove(str);
    }

    public ArrayList<String> getMes() {
        return mes;
    }

    public void removeall() {
        mes.clear();
    }
}
