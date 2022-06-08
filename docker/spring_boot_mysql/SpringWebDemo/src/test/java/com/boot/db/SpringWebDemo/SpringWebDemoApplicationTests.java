package com.boot.db.SpringWebDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class SpringWebDemoApplicationTests {

//	@LocalServerPort
//	private int port;
//	
//	
//	@Autowired
//	private TestRestTemplate restTemplate;
//	
	
	//@Test
//	void testAuthorCount() {
//		String count = this.restTemplate.getForObject("http://localhost:"+port+"/authors/count", String.class);
//		System.out.println(count);
//		try {
//			JSONObject obj = new JSONObject(count);
//			assertEquals(3, obj.get("count"));
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	
//	}
}
