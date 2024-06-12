package Entitie;

import Entities.enums.WorkerLevel;

import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class Worker {

    //Atributos
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;

    //Instanciar a Lista para os contratos, Lista vazia.
    private List<HourContract> contracts = new ArrayList<>();

    //Construstor sem parâmetros
    public Worker(){

    }

    //Contrustor com parâmetros
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    //Get e Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public WorkerLevel getLevel(){
        return level;
    }

    public void setLevel(WorkerLevel level){
        this.level = level;
    }

    public Double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary){
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }
    public List getContracts(){
        return contracts;
    }

    //Metodo para adicionar
    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    //Metodo para remover
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    //Metodo para calcular a soma dos contratos
    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for(HourContract c : contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = cal.get(Calendar.MONTH);
            if(year == c_year && month == c_month){
                sum += c.totalValue();
            }
        }
        return sum;
    }


}
