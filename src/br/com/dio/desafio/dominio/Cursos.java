package br.com.dio.desafio.dominio;

public class Cursos extends Conteudo {
    private int cargaHoraria;

    public Cursos(){}
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double calcularXP(){
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
