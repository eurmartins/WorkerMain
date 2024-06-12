package Entitie;

public class Department {

    //Atributos
    private String name;

    //Contrustor sem parâmetros
    public Department(){

    }

    //Construstor com parâmetros
    public Department(String name){
        this.name = name;
    }

    //Get e Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

