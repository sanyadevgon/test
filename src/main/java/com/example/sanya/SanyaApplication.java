package com.example.sanya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SanyaApplication {

	public static void main(String[] args) {

		/*SpringApplication.run(SanyaApplication.class, args
		);
*/
		List<Integer> lst  = Arrays.asList(0, 2, 3, 4, 6, 8, 9);
		Optional<String > empty = Optional.empty();
		empty.isPresent();
		empty.get();
		empty.get();


		lst.stream().sorted().forEach(e-> {
			System.out.println(e);
			if(!lst.contains(e+1)){
				System.out.println(e);

			}

		});
	}

}
