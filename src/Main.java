import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Dev 1");
        dev1.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Dev 1: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-".repeat(50));

        System.out.println("Conteúdos Inscritos Dev 1: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Dev 1: " + dev1.getConteudosConcluidos());
        System.out.println("Xp total Dev 1: " + dev1.calcularXp());

        System.out.println("-".repeat(100));

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Dev João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-".repeat(50));

        System.out.println("Conteúdos Inscritos Dev João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Dev João: " + devJoao.getConteudosConcluidos());
        System.out.println("Xp total Dev João: " + devJoao.calcularXp());

    }
}
