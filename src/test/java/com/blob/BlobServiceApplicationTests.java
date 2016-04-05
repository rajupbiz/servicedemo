package com.blob;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BlobServiceApplication.class)
public class BlobServiceApplicationTests {

	/*@Resource
	private ContactServiceImpl contactService;*/
	
	@Test
	public void contextLoads() {
		
	}

	@Test
	public void testCore(){
		
		/*Long noOfContacts = contactService.getContactCount();
		
		System.out.println(" noOfContacts >>  "+noOfContacts);
		
		
		System.out.println(" noOfContacts >>  "+noOfContacts);*/
	}
	
}
