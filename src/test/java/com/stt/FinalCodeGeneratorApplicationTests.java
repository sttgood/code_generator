package com.stt;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FinalCodeGeneratorApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(System.getProperty("user.dir"));
		System.out.println("this is next version");
		System.out.println("this is next next version");
		System.out.println("this is hot-fix2 version");
		System.out.println("this is master change!");
		System.out.println("this is hot-fix2 change!");
		System.out.println("push test");
		System.out.println("pull test");
	}

}
