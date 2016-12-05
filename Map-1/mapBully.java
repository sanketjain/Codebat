/*
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.

mapBully({"b": "dirt", "a": "candy"}) → {"b": "candy", "a": ""}
mapBully({"a": "candy"}) → {"b": "candy", "a": ""}
mapBully({"b": "carrot", "c": "meh", "a": "candy"}) → {"b": "candy", "c": "meh", "a": ""}
*/

public Map<String, String> mapBully(Map<String, String> map) {
  
  if (map.get("a")!=null){  
    map.put("b", map.get("a"));
    map.put("a", "");
  }
  return map;
}
