package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity {
  public String destCity(List<List<String>> paths) {
    HashMap<String, String> cities = new HashMap<String, String>();
    for (List<String> path : paths) {
      cities.put(path.get(0), path.get(1));
    }

    for (String key : cities.keySet()) {
      String value = cities.get(key);
      if (!cities.containsKey(value)) {
        return value;
      }
    }

    return "";
  }

  public static void main(String[] args) {
    DestinationCity destinationCity = new DestinationCity();
    List<List<String>> paths = new ArrayList<>();
    List<String> first = new ArrayList<>();
    first.add("London");
    first.add("New York");
    List<String> second = new ArrayList<>();
    second.add("New York");
    second.add("Lima");
    List<String> third = new ArrayList<>();
    third.add("Lima");
    third.add("Sao Paulo");

    paths.add(first);
    paths.add(second);
    paths.add(third);
    System.out.println(destinationCity.destCity(paths));
  }
}
