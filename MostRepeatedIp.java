package codingexercise;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedIp {
	public static void main(String[] args) {



		String[] s = { "10.0.0.1-frank [10/dec/17 10:14:27]", "10.0.0.1-frank [10/dec/17 10:14:28]",

				"10.0.0.1-nancy [10/dec/17 10:14:28]", "10.0.0.2-frank [10/dec/17 10:14:27]" };

		Map<String, Integer> hashMap = new HashMap<String, Integer>();

		for (int i = 0; i < s.length; i++) {

			int sp_index = s[i].indexOf('-');			

			String ip = s[i].substring(0, sp_index);			

			hashMap.put(ip, hashMap.containsKey(ip) ? hashMap.get(ip) + 1 : 1);

		}
		int max = Integer.MIN_VALUE;
    	String mostRepeatedIp = "";
        for(Map.Entry<String, Integer> entry: hashMap.entrySet()) {
        	int value = entry.getValue();
        	if(value > max) {
        		max = value;
        		mostRepeatedIp = entry.getKey();
        	}
        }
        System.out.println(mostRepeatedIp);
		

		System.out.println(hashMap.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());		

	}

}
