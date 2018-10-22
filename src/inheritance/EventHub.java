package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventHub {

    private HashMap<Class<? extends Event>, List<Subscribtion>>
            hashMap = new HashMap<>();

    private static EventHub instance = new EventHub();
    private EventHub() {}

    public static EventHub getInstance() {
        return instance;
    }

    public void pushEvent(Event event){
        List<Subscribtion> subscribtions =
                hashMap.get(event.getClass());

        for(Subscribtion subscribtion : subscribtions){
            subscribtion.onEvent(event);
        }
    }



    public void subscribe(Subscribtion subscribtion, Class<? extends Event> aClass){
        List<Subscribtion> subscribtions =
                hashMap.get(aClass);
        if(subscribtions == null){
            subscribtions = new ArrayList<>();
            hashMap.put(aClass, subscribtions);
        }

        subscribtions.add(subscribtion);
    }

    public void unSubscribe(Subscribtion subscribtion){
        for(List<Subscribtion> list : hashMap.values()){
            list.remove(subscribtion);
        }
    }

}