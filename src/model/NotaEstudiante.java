package model;

public class NotaEstudiante {
    private String nombreCurso;
    private Integer puntuacion;

    public NotaEstudiante(String nombreCurso, Integer puntuacion) {
        this.nombreCurso = nombreCurso;
        this.puntuacion = puntuacion;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }
}
