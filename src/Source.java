import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Source {

	public static void main(String[] args) {
		List<Employee> lstemp=new ArrayList<Employee>();
        Employee emp1=new Employee(102,"Haneesh", 22000, 20, "Developer",'M');
        lstemp.add(emp1);
        lstemp.add(new Employee(103, "Navya", 21000, 19, "Java Developer",'F'));
        lstemp.add(new Employee(101, "Varshitha", 23000, 21, "Sr. Developer",'F'));
        lstemp.add(new Employee(104, "Likhitha", 22500, 22, "Team leader",'F'));
        lstemp.add(new Employee(105, "Abirami", 22500, 22, "HR",'F'));
        lstemp.add(new Employee(106, "Prabu", 23500, 22, "team leader",'M'));
        lstemp.add(new Employee(108, "Abinash", 25500, 22, "Project leader",'M'));
        lstemp.add(new Employee(107, "Bala", 24500, 22, "Team leader",'M'));
        
        
        System.out.println("count employee by gender");
        Map<Object,Long> obj=lstemp.stream()
        		.collect(Collectors.groupingBy(x->x.getGender(),Collectors.counting()));
        System.out.println(obj);
        
        

	}

}
