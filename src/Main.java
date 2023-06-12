import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição curso JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Descrição mentoria JAVA");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso);
//        System.out.println(curso1);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDan = new Dev();
        devDan.setNome("Daniel");
        devDan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Daniel: " + devDan.getConteudosInscritos());
        devDan.progredir();
        devDan.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Daniel: " + devDan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Daniel: " + devDan.getConteudosConcluidos());
        System.out.println("XP: " + devDan.calcularTotalXp());

        System.out.println("--------");

        Dev devKel = new Dev();
        devKel.setNome("Kelly");
        devKel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Kelly: " + devKel.getConteudosInscritos());
        devKel.progredir();
        devKel.progredir();
        devKel.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Kelly: " + devKel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Kelly: " + devKel.getConteudosConcluidos());
        System.out.println("XP: " + devKel.calcularTotalXp());



    }
}