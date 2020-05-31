package services;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import model.Library;
import repository.LibraryRepository;

 
@Service
public class LibraryServImpl implements LibraryServ {
 
    // The dao repository will use the Elastic-Search-Repository to perform the database operations.
    @Autowired
    private LibraryRepository edao;
 
    @Override
    public void saveLibrary(List<Library> libra) {
        edao.saveAll(libra);
    }
 
    @Override
    public Iterable<Library> findAllLibraries() {
        return edao.findAll();
    }
 
    @Override
    public List<Library> findByOwner(String owner) {
        return edao.findByOwner(owner);
    }
}