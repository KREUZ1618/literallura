package com.api;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Results {
	
	private int count;
	private ArrayList<Book> results; 
	
	

@Getter
@Setter
public class Book  {
		
	private String id;
	private String title;
	private ArrayList<String> subjects;
	private ArrayList<Person> authors;
	private ArrayList<String> languages;
	
	

    @Getter
    @Setter
    public class Person {
        private int birth_year;
        private int death_year;
        private String name;
       
    }

}

}


