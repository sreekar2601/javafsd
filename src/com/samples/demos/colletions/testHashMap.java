package com.samples.demos.colletions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class testHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> mp=new HashMap<>();
		mp.put(1,"sreekar");
		mp.put(2,"john");
		mp.put(3,"wilson");
		mp.put(4,"mark");
		mp.put(5,"robert");
		System.out.println(mp);
		mp.put(1, "evans");
		System.out.println(mp);
		System.out.println(mp.containsKey(2));
		System.out.println(mp.containsValue("sreekar"));
		System.out.println(mp.get(2));
		System.out.println(mp.keySet());
		System.out.println(mp.values());
		
		Set<Integer> name=mp.keySet();
		for(Integer check:name)
			System.out.println(check+" "+mp.get(check));
		
		Map<String , Map<String,Object>> userprofiles=new HashMap<String , Map<String,Object>>();
		Map<String,Object> profile=new HashMap<>();
		profile.put("age", 25);
		profile.put("dept", "admin");
		profile.put("salary", 45000);
		userprofiles.put("john", profile);
		//System.out.println(userprofiles);
		
		profile.put("age", 27);
		profile.put("dept", "HOD");
		profile.put("salary", 65000);
		userprofiles.put("micheal", profile);
		System.out.println(userprofiles);
		
			
		
		
		
	}

}
