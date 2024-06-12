import Entitie.Department;
import Entitie.HourContract;
import Entitie.Worker;
import Entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        //Programa principal
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //String <-> Date
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter department name:");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.println("Name: ");
        String workerName = sc.nextLine();
        System.out.println("Level:");
        String workerLevel = sc.nextLine();
        System.out.println("Base salary: ");
        double baseSalary = sc.nextDouble();

        //Instanciar com base no construtor, departament instanciado.
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.println("How many contracts to this worker?");
        int n = sc.nextInt();

        for(int i = 0; i<n ;  i++){
            System.out.println("Enter contract #" + i + "data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour:");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration(hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }


        System.out.println();
        System.out.println("Enter month and year to calculate income(MM/YYYY):");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for" + monthAndYear + ":" + String.format("%.2f", worker.income(year, month)));



        sc.close();
    }
}