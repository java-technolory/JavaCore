package mta.edu.vn;

/**
 * 
 * @author x
 *
 *         Factory Design Parttern được sử dụng khi có một super class có nhiều
 *         subclass, chúng ta cần tạo đối tượng của các class con theo đầu vào
 *         ví dụ PC vs Server thì khi này chúng ta sẽ sử dụng design parttern
 *         này.	
 * 
 *
 */

public class ComputerFactory {
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if ("PC".equalsIgnoreCase(type)) {
			return new PC(ram, hdd, cpu);
		} else if ("Server".equalsIgnoreCase(type)) {
			return new Server(ram, hdd, cpu);
		}
		return null;
	}
}
