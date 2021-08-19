import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo(("curso java"));
        curso1.setDescricao(("descrição curso java"));
        curso1.setCargaHoraria((8));

        Curso curso2 = new Curso();
        curso2.setTitulo(("curso js"));
        curso2.setDescricao(("descrição curso js"));
        curso2.setCargaHoraria((4));

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGiovanna = new Dev();
        devGiovanna.setNome("Giovanna");
        devGiovanna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Giovanna:" + devGiovanna.getConteudosInscritos());
        devGiovanna.progredir();
        devGiovanna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Giovanna:" + devGiovanna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Giovanna:" + devGiovanna.getConteudosConcluidos());
        System.out.println("XP:" + devGiovanna.calcularTotalXP());

        System.out.println("-------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro:" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Pedro:" + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Pedro:" + devPedro.getConteudosConcluidos());
        System.out.println("XP:" +devPedro.calcularTotalXP());




    }
}
