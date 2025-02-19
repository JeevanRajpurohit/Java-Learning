package CrudOperation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

   @Autowired
   private JdbcTemplate springJdbcTemplate;
   private static String INSERT_QUERY = """
                insert into cource(id,name ,mentor)
                values(5,'LearnSpringboot','Rakesh');
           """;
   public void insert(){
       springJdbcTemplate.update(INSERT_QUERY);
   }

}
