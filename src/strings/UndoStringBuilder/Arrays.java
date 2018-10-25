package strings.UndoStringBuilder;

public class Arrays {

    public static abstract class Filter{
        abstract public boolean apply(Object o);
    }

    public static abstract class Converter{
        abstract public Object get(int index);
    }

    public static Object[] filter(Object[] array, Filter filter){
        int removed = 0;
        for(int i = 0; i < array.length; i++){
            if(!filter.apply(array[i])){
                for(int j = i; j < array.length - 1 - removed; j++){
                    array[j] = array[j + 1];
                }
                removed++;
            }
        }

        return java.util.Arrays.copyOf(array, array.length - removed);
    }

    public static void fill(Object[] objects, Converter converter){
        for(int i = 0; i < objects.length; i++){
            objects[i] = converter.get(i);
        }
    }
}