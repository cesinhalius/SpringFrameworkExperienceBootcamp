import com.dio.desafio.Curso;
import com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.setTitulo("curso Java");
        curso.setDescricao("descricao do curso de Java");
        curso.setCargaHoraria(9);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria sobre o curso de Java");
        mentoria.setDescricao("Descricao da mentoria de Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoria);
    }
}
