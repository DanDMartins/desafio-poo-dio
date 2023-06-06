import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso JAVA");
        curso.setDescricao("Descrição curso JAVA");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso.setTitulo("Curso JS");
        curso.setDescricao("Descrição curso JS");
        curso.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Descrição mentoria JAVA");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);

    }
}