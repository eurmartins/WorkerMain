package Entitie;

import java.util.Date;

public class HourContract {

    //Atributos
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    //Construtor sem parâmetros
    public HourContract(){

    }

    //Construtor com parâmetros
    public HourContract(Date date, Double valuePerHour, Integer hours){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    //Get e Setters
    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Double getValuePerHour(){
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour){
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours(){
        return hours;
    }

    public void setHours(Integer hours){
        this.hours = hours;
    }

    public double totalValue(){
        return valuePerHour * hours;
    }
}
