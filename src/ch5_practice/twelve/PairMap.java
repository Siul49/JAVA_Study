package ch5_practice.twelve;

abstract public class PairMap {
    protected String keyArray[];
    protected String valueArray[];
    abstract public String get(String key);
    abstract public void put(String key, String value);
    abstract public void delete(String key);
    abstract public int length();
}
