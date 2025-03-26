package Entities;

public class Aluno {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double media(){
        return nota1+nota2+nota3;
    }

    public String passou(){
        String resultado;
        double media = media();
        if (media < 60.00){
            resultado = "FAILED";
        }else{
            resultado = "PASS";
        }
        return resultado;
    }

    public String toString(){
        return "FINAL GRADE = " + String.format("%.2f",media()) + " " + passou();
    }


}
