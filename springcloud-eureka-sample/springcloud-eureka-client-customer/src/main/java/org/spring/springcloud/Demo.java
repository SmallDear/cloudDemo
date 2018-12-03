package org.spring.springcloud;

import org.hibernate.validator.constraints.EAN;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {

    public static  void main(String args []){
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        System.out.println("hashdahsdfadskfhlkasjfdhkasjhfksajhdfkahdsfkahsdkfjhsakdjfksdhfksaj=====");


//       for (Map.Entry<String , Integer> entry : items.entrySet()){
//           System.out.println(entry.getKey() + entry.getValue());
//       }

       items.forEach((k,v) -> System.out.println( k + v));

//        authResult.getBody().forEach(assetAuth -> areaIdList.add(assetAuth.getAreaId()));
//        List<Object> list = new ArrayList<Object>();
//        list.forEach();

    }


}
