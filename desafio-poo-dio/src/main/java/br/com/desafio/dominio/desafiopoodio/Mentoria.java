package br.com.desafio.dominio.desafiopoodio;
import  java.time.LocalDate;

public class Mentoria extends Conteudo {
    public Mentoria(){}
    private  LocalDate data;

    @Override
    public  double calcularXp(){
        return XP_PADRAO+20d;
    }

    public LocalDate getData(){
        return data;
    }

    public void setDate(LocalDate data){
        this.data=data;
    }
   @Override
    public  String toString(){
        return "Mentorial{"+
                "titulo'"+getTitulo()+'\''+
                ", descricao='"+getDescricao()+'\''+
                ", data="+data+
                '}';
   }




}
