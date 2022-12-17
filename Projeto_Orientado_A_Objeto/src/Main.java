import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição do curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria para java");
        mentoria.setDescricao("Descrição da mentoria para java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJessica = new Dev();
        devJessica.setNome("Jessica Teixeira Araujo");
        devJessica.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Jessica" +  devJessica.getConteudosInscritos());
        devJessica.progredir();
        devJessica.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Jessica:" + devJessica.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Jessica:" + devJessica.getConteudosConcluidos());
        System.out.println("XP:" + devJessica.calcularTotalXp());

        System.out.println("-------");

        Dev devLorrane = new Dev();
        devLorrane.setNome("Lorrane");
        devLorrane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lorrane:" + devLorrane.getConteudosInscritos());
        devLorrane.progredir();
        devLorrane.progredir();
        devLorrane.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lorrane:" + devLorrane.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Lorrane:" + devLorrane.getConteudosConcluidos());
        System.out.println("XP:" + devLorrane.calcularTotalXp());
    }
}