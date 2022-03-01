package springexamples;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class Student{
	int htno;
	String name;
	Address address;
	public int getHtno() {
		return htno;
	}
	public void setHtno(int htno) {
		this.htno = htno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	Student(){
	
	}
	@Override
	public String toString() {
		return "Student [htno=" + htno + ", name=" + name + ", address=" + address + "]";
	}
	
}


public class SpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Address address = (Address) context.getBean("addr");
		
		System.out.println(address);
		
		Student student = (Student) context.getBean("stu");
		System.out.println(student);

	}

}
