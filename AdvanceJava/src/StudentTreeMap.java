
public class StudentTreeMap {
           int id;
           String name;
           
        public StudentTreeMap(int id, String name) {
        	this.id=id;
        	this.name=name;
        }
        @Override
        public String toString() {
        	return "Name is: "+name+" and ID is: "+id+"\n";
        }
        public int compareTo(StudentTreeMap obj) {
        	if(this.id > obj.id) {
        		return 1;
        	}
        	else if(this.id<obj.id) {
        		return -1;
        	}
        	else {
        		return 0;
        	}
        }
}
