package services;

import java.util.List;

import model.Library;

public interface LibraryServ {

	/**
	 * Method to save the collection of employees in the database.
	 * @param employees
	 */
	public void saveLibrary(List<Library> employees);

	/**
	 * Method to fetch all employees from the database.
	 * @return
	 */
	public Iterable<Library> findAllLibraries();

	/**
	 * Method to fetch the employee details on the basis of designation.
	 * @param designation
	 * @return
	 */
	public List<Library> findByOwner(String designation);	
}