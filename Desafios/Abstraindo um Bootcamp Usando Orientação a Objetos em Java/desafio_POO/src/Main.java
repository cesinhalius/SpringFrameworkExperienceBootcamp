import com.dio.desafio.Bootcamp;
import com.dio.desafio.Curso;
import com.dio.desafio.Dev;
import com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();

        cursoJava.setTitulo("curso Java");
        cursoJava.setDescricao("descricao do curso de Java");
        cursoJava.setCargaHoraria(12);



        Curso cursoJavascript = new Curso();
        cursoJavascript.setTitulo("curso Js");
        cursoJavascript.setDescricao("descricao do curso de Javascript");
        cursoJavascript.setCargaHoraria(10);

        Curso cursoC = new Curso();
        cursoC.setTitulo("curso de C");
        cursoC.setDescricao("descricao do curso de Javascript");
        cursoC.setCargaHoraria(12);

        Curso cursoPython = new Curso();
        cursoPython.setTitulo("curso Python");
        cursoPython.setDescricao("descricao do curso de Python");
        cursoPython.setCargaHoraria(13);



        Mentoria mentoriaJava = new Mentoria();

        mentoriaJava.setTitulo("mentoria sobre o curso de Java");
        mentoriaJava.setDescricao("Descricao da mentoria de Java");
        mentoriaJava.setData(LocalDate.now());


        Mentoria mentoriaJs = new Mentoria();

        mentoriaJs.setTitulo("mentoria sobre o curso de Javascript");
        mentoriaJs.setDescricao("Descricao da mentoria de Javascript");
        mentoriaJs.setData(LocalDate.now());

        Mentoria mentoriaC = new Mentoria();

        mentoriaC.setTitulo("mentoria sobre o curso de C");
        mentoriaC.setDescricao("Descricao da mentoria de C");
        mentoriaC.setData(LocalDate.now());

        Mentoria mentoriaPython = new Mentoria();

        mentoriaJs.setTitulo("mentoria sobre o curso de Python");
        mentoriaJs.setDescricao("Descricao da mentoria de Python");
        mentoriaJs.setData(LocalDate.now());


        /*System.out.println(curso);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudo().add(cursoJava);
        bootcamp.getConteudo().add(cursoJavascript);
        bootcamp.getConteudo().add(cursoPython);
        bootcamp.getConteudo().add(mentoriaJava);
        bootcamp.getConteudo().add(mentoriaJs);
        bootcamp.getConteudo().add(mentoriaPython);


        Dev devJose = new Dev();
        devJose.setNome("JOSE");
        devJose.InscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscrito Jose:" + devJose.getConteudoInscritos());
        devJose.progredir();
        devJose.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscrito Jose:" + devJose.getConteudoInscritos());
        System.out.println("Conteudo Concluido Jose:" + devJose.getConteudoConcluido());


        System.out.println("--------------------");













    }
}
