import br.com.desafio.dominio.desafiopoodio.Bootcamp;
import br.com.desafio.dominio.desafiopoodio.Curso;
import br.com.desafio.dominio.desafiopoodio.Dev;
import br.com.desafio.dominio.desafiopoodio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1=new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);


        Curso curso2=new Curso();

        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setDate(LocalDate.now());


        Bootcamp bootcamp=new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devPedro= new Dev();

        devPedro.setNome("Pedro Henrique");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Pedro:"+devPedro.getConteudosConcluidos());
        devPedro.progredir();
        devPedro.progredir();

        System.out.println("-");

        System.out.println("Conteudos Inscritos Pedro"+devPedro.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Pedro"+devPedro.getConteudosConcluidos());

        System.out.println("XP"+devPedro.calcularTotalXp());


        System.out.println("-----------");
    }


}
