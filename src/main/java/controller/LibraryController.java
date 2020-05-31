package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Library;
import services.LibraryServ;

@RestController
@RequestMapping(value = "/library")
public class LibraryController {

	@Autowired
	LibraryServ eserv;

	/**
	 * Method to save the employees in the database.
	 * 
	 * @param myemployees
	 * @return
	 */
	@PostMapping(value = "/savelibraries")
	public String saveEmployee(@RequestBody List<Library> myemployees) {
		eserv.saveLibrary(myemployees);
		return "Records saved in the db.";
	}

	/**
	 * Method to fetch all employees from the database.
	 * 
	 * @return
	 */
	@GetMapping(value = "/getall")
	public Iterable<Library> getAllEmployees() {
		return eserv.findAllLibraries();
	}

	/**
	 * Method to fetch the employee details on the basis of designation.
	 * 
	 * @param designation
	 * @return
	 */
	@GetMapping(value = "/findbyowner/{employee-designation}")
	public Iterable<Library> getByDesignation(@PathVariable(name = "employee-designation") String designation) {
		return eserv.findByOwner(designation);
	}

//	@RequestMapping(value = "/library/getBooks", method = RequestMethod.GET, produces = {
//			MediaType.APPLICATION_JSON_VALUE })
//	public Response index(@RequestParam(required = false) String name) {
//		Response res = new Response();
//		Library lib = new Library();
//		Library lib1 = new Library();
//		lib.setName("Name");
//		lib.setOwner("Owner");
//		lib1.setName("Name1");
//		lib1.setOwner("Owner1");
//		ArrayList<Library> libs = new ArrayList<>();
//		if(name != null && name.length()>0) {
//			libs.add(lib1);	
//		}
//		libs.add(lib);
//		res.setData(libs);
//		res.setCode("200");
//		res.setStatus("success");
//		return res;
//	}
}
