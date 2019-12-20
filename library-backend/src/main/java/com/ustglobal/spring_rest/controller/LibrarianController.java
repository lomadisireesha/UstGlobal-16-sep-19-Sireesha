package com.ustglobal.spring_rest.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ustglobal.spring_rest.dto.Book;
import com.ustglobal.spring_rest.dto.BookIssue;
import com.ustglobal.spring_rest.dto.BookRegistration;
import com.ustglobal.spring_rest.dto.User;
import com.ustglobal.spring_rest.dto.UserResponse;
import com.ustglobal.spring_rest.service.LibrarianService;

@CrossOrigin(origins = "*",allowedHeaders = "*", allowCredentials = "true")
@RestController
public class LibrarianController {

	@Autowired
	private LibrarianService service;

	UserResponse response = new UserResponse();

	//	@PostMapping(path = "/register" , 
	//			consumes = MediaType.APPLICATION_JSON_VALUE,
	//			produces = MediaType.APPLICATION_JSON_VALUE)
	//	public UserResponse registerStudent(@RequestBody User user) {
	//
	//		if(service.registerStudent(user) != null) {
	//
	//			response.setStatus(201);
	//			response.setMessage("Success");
	//			response.setDescription("Data added to DB");
	//		}else {
	//			response.setStatus(401);
	//			response.setMessage("Failure");
	//			response.setDescription("Data not added to DB");
	//
	//
	//		}
	//
	//		return response;
	//	}
	//
//		@DeleteMapping(path = "/delete/{id}" , 
//				produces = MediaType.APPLICATION_JSON_VALUE )
//		public UserResponse deleteStudent(@PathVariable("id") int id) {
//	
//			if(service.de) {
//	
//				response.setStatus(201);
//				response.setMessage("Success");
//				response.setDescription("Data Deleted from DB");
//			}else {
//				response.setStatus(401);
//				response.setMessage("Failure");
//				response.setDescription("Data not Deleted from DB");
//	
//	
//			}
//	
//			return response;
//		}

	@PostMapping(path = "/addbook" , 
			consumes = MediaType.APPLICATION_JSON_VALUE ,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse addBooks(@RequestBody Book book) {

		if(service.addBooks(book)) {

			response.setStatus(200);
			response.setMessage("Success");
			response.setDescription("books added to DB");
			response.setBook(Arrays.asList(book));
		}else {
			response.setStatus(404);
			response.setMessage("Failure");
			response.setDescription("books not added to DB");
		}
		return response;
	}//end of add
	
	@DeleteMapping(path = "/deletebook/{bid}" ,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse deleteBook(@PathVariable("bid") int bid) {

		if(service.deleteBook(bid)) {
			response.setStatus(201);
			response.setMessage("Success");
			response.setDescription("book Deleted from DB");
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("book not Deleted from DB");
		}
		return response;
	}//end of delete
	
	@DeleteMapping(path = "/deletereq/{bookid}" ,
			produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponse deleterequest(@PathVariable("bookid") int bookid ) {
    	
		if(service.deleterequest(bookid)) {

			response.setStatus(201);
			response.setMessage("Success");
			response.setDescription("book Deleted from DB");
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("book not Deleted from DB");
		}
		return response;
	}//end of delete


	@GetMapping(path = "/getstudent",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse getStudentInfo(@RequestParam("id") int id) {

		User bean = service.getStudentInfo(id);
		if(bean!=null) {
			response.setStatus(201);
			response.setMessage("Success");
			response.setDescription("Data found in DB");
			response.setUsers(Arrays.asList(bean)); // a single object to list type and stored
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in DB");


		}
		return response;
	}//end of get
	@GetMapping(path = "/bookrequested" ,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse viewRequest(){
		List<BookRegistration> bean = service.viewRequest();
		if(bean != null) {
			response.setStatus(201);
			response.setMessage("Success");
			response.setDescription("Data found in DB");
			response.setRequestedbook(bean);
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in DB");
		}
		return response;
	}//end of viewRequest

	@GetMapping(path="/showbooks" , 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse showAllBooks(){

		List<Book> bean = service.showAllBooks();
		if(!bean.isEmpty()) {
			response.setStatus(201);
			response.setMessage("Success");
			response.setDescription("Data found in DB");
			response.setBook(bean); // a single object to list type and stored
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in DB");
		}
		return response;
	}//end of get all

//	@GetMapping(path = "/check/{bid}",
//			produces = MediaType.APPLICATION_JSON_VALUE)
//	public UserResponse  checkAvailability(@PathVariable("bid")int bid) {
//		Book bean = service.checkAvailability(bid);
//		if(bean!=null) {
//			response.setStatus(201);
//			response.setMessage("Success");
//			response.setDescription("Data found in DB");
//			response.setBook(Arrays.asList(bean)); // a single object to list type and stored
//		}else {
//			response.setStatus(401);
//			response.setMessage("Failure");
//			response.setDescription("Data not found in DB");
//		}
//		return response;
//	}//end of check

	@PostMapping(path = "/issuedbook" , 
			consumes = MediaType.APPLICATION_JSON_VALUE ,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse issuedBook(@RequestBody BookIssue bookissue) {

		if(service.issuedBook(bookissue)) {
			response.setStatus(201);
			response.setMessage("Success");
			response.setDescription("Data added to DB");
			response.setBookissue(Arrays.asList(bookissue));
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("Data not added to DB");
		}
		return response;

	}//end of issuedBook

	@GetMapping(path="/showissuedbooks" , 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse diplayIssuedBooks() {

		List<BookIssue> bean = service.diplayIssuedBooks();
		if(!bean.isEmpty()) {
			response.setStatus(201);
			response.setMessage("Success");
			response.setDescription("Data found in DB");
			response.setBookissue(bean);; // a single object to list type and stored
		}else {
			response.setStatus(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in DB");
		}
		return response;

	}//end of displayissuedBooks


	
}