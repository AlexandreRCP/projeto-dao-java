package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println(" ============= TEST 1: Department Insert =============== ");
		
		Department newDepartment = new Department(null, "Sorveteria");
		departmentDao.insert(newDepartment);		
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println(" ============== TEST 2: Department FindById ================ ");
		Department department = departmentDao.findById(2);
		System.out.println(department);

		
		System.out.println("\n =============== TEST 2: Department Update ================= ");
		department = departmentDao.findById(1); 
		department.setName("Cozinha");
		departmentDao.update(department);
		System.out.println("Update completed!");
		
		
		System.out.println("\n =============== TEST 3: Department FindAll ================= ");
		List<Department> list = departmentDao.findAll();
		list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}	
		
		System.out.println("\n =============== TEST 4: Department FindById ================= ");
		
		list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}	
		
		System.out.println("\n =============== TEST 5: Department DeleteById ================= ");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
	}

}
