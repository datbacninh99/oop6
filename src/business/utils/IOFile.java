package business.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
	
	public static final String PATH_CATEGORY = "D:\\Code\\Java\\practice_io_file\\src\\business\\data\\category.txt";
	public static final String PATH_PRODUCT = "D:\\Code\\Java\\practice_io_file\\src\\business\\data\\product.txt";
	
	public static <T> void writeObjectToFile(List<T> list, String path) {
		FileOutputStream fos = null; // output là đầu ra nên cái FileOutputStream nó là ghi file (đại diện cho file nào dựa vào path)
		ObjectOutputStream oos = null; // đối tượng ObjectOutputStream dành việc ghi object vào file
		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			
		} catch (IOException e) {
		
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (oos != null) {
					oos.close();
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			
		}
	}
	
	public static <T> List<T> readObjectFromFile(String path) {
		FileInputStream fis = null; // Input là đầu vào nên nó sẽ là lấy dữ liệu vào chương trình (đại diện cho file thông đường dẫn path)
		ObjectInputStream ois = null; // ObjectInputStream nó là đối tượng dùng để làm việc đọc file
		List<T> list = new ArrayList<>();
		try {
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);
			
			list = (List<T>) ois.readObject();
			
		} catch (IOException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return list;
	}
}
