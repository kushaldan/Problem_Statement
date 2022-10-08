package greatlearning;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {
			AdminDepartment admin = new AdminDepartment();
			HrDepartment hr = new HrDepartment();
			TechDepartment tech = new TechDepartment();
			SuperDepartment sup = new SuperDepartment();
			int n;
			do {
				System.out.println("Choose from the following Departments:-" + "\n" + "1. Super Department" + "\n"
						+ "2. Admin Department" + "\n" + "3. HR Department" + "\n" + "4. Tech Department" + "\n"
						+ "5. All Department at a glance" + "\n");
				n = s.nextInt();
				switch (n) {
				case 1: {
					System.out.println("Welcome to " + sup.departmentName() + "\n" + sup.getTodaysWork() + "\n"
							+ sup.getWorkDeadline() + "\n" + sup.isTodayHoliday() + "\n");
				}
					break;

				case 2: {
					System.out.println("Welcome to " + admin.departmentName() + "\n" + admin.getTodaysWork() + "\n"
							+ admin.getWorkDeadline() + "\n" + admin.isTodayHoliday());
					System.out.println();
				}
					break;

				case 3: {
					System.out.println("Welcome to " + hr.departmentName() + "\n" + hr.doActivitye() + "\n"
							+ hr.getTodaysWork() + "\n" + hr.getWorkDeadline() + "\n" + hr.isTodayHoliday());
					System.out.println();
				}
					break;

				case 4: {
					System.out.println("Welcome to " + tech.departmentName() + "\n" + tech.getTodaysWork() + "\n"
							+ tech.getWorkDeadline() + "\n" + tech.getTechStackInformation() + "\n"
							+ tech.isTodayHoliday());
					System.out.println();
				}
					break;
				case 5: {
					System.out.println("Welcome to " + admin.departmentName() + "\n" + admin.getTodaysWork() + "\n"
							+ admin.getWorkDeadline() + "\n" + admin.isTodayHoliday());
					System.out.println();
					System.out.println("Welcome to " + hr.departmentName() + "\n" + hr.doActivitye() + "\n"
							+ hr.getTodaysWork() + "\n" + hr.getWorkDeadline() + "\n" + hr.isTodayHoliday());
					System.out.println();
					System.out.println("Welcome to " + tech.departmentName() + "\n" + tech.getTodaysWork() + "\n"
							+ tech.getWorkDeadline() + "\n" + tech.getTechStackInformation() + "\n"
							+ tech.isTodayHoliday());
					System.out.println();
				}
					break;
				}
			} while (true);
		}

	}
}