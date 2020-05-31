package repository;

import java.util.*;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import model.Library;
 
@Repository
public interface LibraryRepository extends ElasticsearchRepository<Library, String> {
 
    /**
     * Method to fetch the employee details on the basis of designation by using Elastic-Search-Repository.
     * @param designation
     * @return
     */
    public List<Library> findByOwner(String owner);
 
}
