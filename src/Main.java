import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Cursos;
import br.com.dio.desafio.dominio.Devs;
import br.com.dio.desafio.dominio.Mentorias;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cursos curso1 = new Cursos();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(4);

        Mentorias mentorias = new Mentorias();
        mentorias.setTitulo("mentoria java");
        mentorias.setDescricao("descrição mentoria java");
        mentorias.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentorias);

        Devs devGabrielle = new Devs();
        devGabrielle.setNome("Gabrielle");
        devGabrielle.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Gabrielle: " + devGabrielle.getConteudosInscritos());
        devGabrielle.progredir();
        devGabrielle.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Gabrielle: " + devGabrielle.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Gabrielle: " + devGabrielle.getConteudosConcluidos());
        System.out.println("XP:" + devGabrielle.calcularTotalXP());

        System.out.println("-----------");

        Devs devJoao = new Devs();
        devJoao.setNome("Denys");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Denys: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Denys: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Denys: " + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXP());
    }
}