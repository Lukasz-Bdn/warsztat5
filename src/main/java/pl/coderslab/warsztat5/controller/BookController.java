package pl.coderslab.warsztat5.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

	@RequestMapping("/hello")
	public String hello() {
		return "{hello:	World costam costam}";
	}

	@GetMapping("")
	public String getBooks() {
		String allBooks = "";
		return "{books: allbooks}";
	}
	
	@PostMapping("")
	public String postBook() {
		return "To create book from form parameters";
	}
	
	@GetMapping("/{id}")
	public String getBookById(@PathVariable int id) {
		return "{book id: "+id+"}";
	}
	
	@PutMapping("/{id}")
	public String putBooks(@PathVariable int id) {
		return "{book id for put: "+id+"}";
	}
	
	@DeleteMapping("")
	public String delBook(@PathVariable int id) {
		return "{book id for delete: "+id+"}";
	}
	
}