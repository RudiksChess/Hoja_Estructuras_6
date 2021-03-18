
public interface IMap<K,V>
{
    /**
     * @return  el tamaño del HashMap
     */
    public int size();

    /**
     * @param stra  un elemento que se quiere meter al HashMap
     */
    public void put(K stra);
    /**
     * @param stra  un elemento que se ubicar en el HashMap por medio de un key.
     */
    public void get(V stra);
}