import com.dio.desafio.dominio.Bootcamp;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Dev;
import com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descricao curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria do Java");
        mentoria1.setDescricao("Descricao Mentoria do Java");
        mentoria1.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudo Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudo Concluidos: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " +devCamila.calcularTotalXp());

        Dev devRyan = new Dev();
        devRyan.setNome("Ryan");
        devRyan.inscreverBootcamp(bootcamp);
        System.out.println("\nConteudo Inscritos Ryan: " + devRyan.getConteudosInscritos());
        devRyan.progredir();
        devRyan.progredir();
        devRyan.progredir();
        System.out.println("Conteudo Inscritos Ryan: " + devRyan.getConteudosInscritos());
        System.out.println("Conteudo Concluidos: " + devRyan.getConteudosConcluidos());
        System.out.println("XP: " + devRyan.calcularTotalXp());





    }
}
