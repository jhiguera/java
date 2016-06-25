package cl.prueba;
import cl.model.*;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by acer on 31-05-2016.
 */
public class Prueba {

    public  static  void main(String[] args){

        HashMap<Integer,List<Persona>> map = new HashMap<Integer, List<Persona>>();
        List<Persona> personas  = new LinkedList<Persona>();
        if(null == map.get(1)){
            map.put(1,new LinkedList<Persona>());
        }

        Persona per = new Persona(1,"Jaime", Calendar.getInstance().getTime());
        Persona per2 = new Persona(1,"Jaimess º", Calendar.getInstance().getTime());
        map.get(1).add(per);
        map.get(1).add(per2);

        System.out.println(map.get(1));
       /*
        map.put(1 , map.get(1).stream().distinct()
                .map(e->(Persona) e)
                .collect(Collectors.toList()) );
        */
        System.out.println(map.get(1));


    }
}
