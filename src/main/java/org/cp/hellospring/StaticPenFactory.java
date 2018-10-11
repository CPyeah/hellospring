package org.cp.hellospring;

import java.util.HashMap;
import java.util.Map;

public class StaticPenFactory {
	
	static Map<String,Pen> pens = new HashMap<String, Pen>();
	
	static {
		pens.put("hero", new Pen("hero", 5.5));
		pens.put("lamy", new Pen("lamy", 135.0));
	}
	
	public static Pen getPen(String name) {
		return pens.get(name);
	}

}
