
public class Principal {
	public static void main(String[] args) {
		Student st= new Student();
		System.out.println(st.name + "\n" + st.id + "\n"+ st.status);
		
		puntoSiete();
		
		
	}




public static void puntoSiete() {
	 Person p1= new Person("arial", 37);
	 Person p2 = new Person("joseph", 15);
	 
	 if(p1.getAge()== p2.getAge()) {
		 
		 System.out.println(p1.getName()+ "tiene el mismo nombre que "+ p2.getName());
	 } 
	 else {
		 System.out.println(p1.getName()+ " NO tiene el mismo nombre que "+ p2.getName());
		 
	 }
} 

}
