package om.techouts.springJdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class StudDao {
	
	private JdbcTemplate template;
	String query;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public void save(Student e)
	{
		 query="insert into student(firstName,lastName,age) values("
		 		+ "    '"+e.getFirstName()+"','"+e.getLastName()+"','"+e.getAge()+"')  ";
		template.update(query);
		
	}
    public void update(Student s,int id)
    {
    	query="update student set     "
    			+ "firstName='"+s.getFirstName()+"',lastName='"+s.getLastName()+"' ,age='"+s.getAge()
    					+ "'where id='"+id+"'";
    	template.update(query);
    }
    public void delete(int id)
    {
    	query="delete from student where id='"+id+"'";
    	template.update(query);
    }
    
    
    //preparedStatement

    public void saveStudentByPreparedStatement(final Student e)
    {  
        String query="insert into student(firstName,lastName,age) values(?,?,?)";  
        template.execute(query,new PreparedStatementCallback<Boolean>(){  
        public Boolean doInPreparedStatement(PreparedStatement ps)  
                throws SQLException, DataAccessException {        
            ps.setString(1,e.getFirstName());  
            ps.setString(2,e.getLastName());  
            ps.setInt(3,e.getAge());        
            return ps.execute();  
                  
        }  
        });  
    } 
    
    public Student getStudentById(final int id)
    {
    	query="select * from student where id='"+id+"'";
        return 	(Student) template.query(query,new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Student s=new Student();
				s.setId(rs.getInt(id));
				s.setFirstName(rs.getString(2));
				s.setLastName(rs.getString(3));
				s.setAge(rs.getInt(4));
				return s;
			}
    		
    		
		});
     }
    
    
    public List<Student> getAllStudents()
    {
    	query="select * from student";
     return	template.query(query,new ResultSetExtractor() {
	
			public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				List<Student> list=new ArrayList<Student>();
				while(rs.next()) {
				Student s=new Student();
				s.setId(rs.getInt(1));
				s.setFirstName(rs.getString(2));
				s.setLastName(rs.getString(3));
				s.setAge(rs.getInt(4));
				list.add(s);
				}
				return list;
			}
		});
    }

}
