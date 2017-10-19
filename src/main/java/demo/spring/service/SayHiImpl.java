package demo.spring.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class SayHiImpl implements SayHi{

	@Override
	public Map<String,String> sayHi() {
		Map<String, String> m = new HashMap<String,String>();
		m.put("1", "sdflskj");
		m.put("2", "sdflskj");
		m.put("3", "sdflskj");
		m.put("4", "sdflskj");
		m.put("5", "sdflskj");
		return m;
	}

}
