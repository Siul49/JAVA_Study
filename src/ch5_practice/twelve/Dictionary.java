package ch5_practice.twelve;

public class Dictionary extends PairMap {
    int top;

    Dictionary(int a){
        top = 0;
        keyArray = new String[a];
        valueArray = new String[a];
    }

    @Override
    public String get(String key) {
        for (int i = 0; i < keyArray.length; i++) {
            if (!(keyArray[i] == null) && keyArray[i].equals(key)) {
                return valueArray[i];
            }
        }
        return null;
    }

    @Override
    public void put(String key, String value) {
        boolean exist = false;
        for (int i = 0; i < length(); i++) {
            if (keyArray[i].equals(key)) {
                exist = true;
            }
        }
        if (!exist) {
            keyArray[length()] = key;
            valueArray[length()] = value;
            top++;
        }
    }

    @Override
    public void delete(String key) {
        boolean delete = false;
        for (int i = 0; i < length()-1; i++) {
            if (keyArray[i].equals(key)) {
                delete = true;
            }
            if (delete) {
                keyArray[i] = keyArray[i + 1];
                valueArray[i] = valueArray[i + 1];
            }
        }
        top--;
    }

    @Override
    public int length() {
        return top;
    }
}
