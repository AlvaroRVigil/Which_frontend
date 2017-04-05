package proyecto.which.model;


import java.util.Date;

public class Smartphone {

    private Long id;
    private EnumMarca marca;
    private String modelo;
    private Integer camara;
    private Integer frontCamara;
    private Integer bateria;
    private Double pulgadasPantalla;
    private Integer resolucionPantallaAlto;
    private Integer resolucionPantallaAncho;
    private Double ram;
    private EnumOS so;
    private Integer rom;
    private Integer proteccionPolvo;
    private Integer puntuacion;
    private String descripcion;
    private Date fechaLancamiento;

    public Smartphone() {
    }

    public Smartphone(Long id, EnumMarca marca, String modelo, Integer camara, Integer frontCamara, Integer bateria, Double pulgadasPantalla, Integer resolucionPantallaAlto, Integer resolucionPantallaAncho, Double ram, EnumOS so, Integer rom, Integer proteccionPolvo, Integer puntuacion, String descripcion, Date fechaLancamiento) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.camara = camara;
        this.frontCamara = frontCamara;
        this.bateria = bateria;
        this.pulgadasPantalla = pulgadasPantalla;
        this.resolucionPantallaAlto = resolucionPantallaAlto;
        this.resolucionPantallaAncho = resolucionPantallaAncho;
        this.ram = ram;
        this.so = so;
        this.rom = rom;
        this.proteccionPolvo = proteccionPolvo;
        this.puntuacion = puntuacion;
        this.descripcion = descripcion;
        this.fechaLancamiento = fechaLancamiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnumMarca getMarca() {
        return marca;
    }

    public void setMarca(EnumMarca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCamara() {
        return camara;
    }

    public void setCamara(Integer camara) {
        this.camara = camara;
    }

    public Integer getFrontCamara() {
        return frontCamara;
    }

    public void setFrontCamara(Integer frontCamara) {
        this.frontCamara = frontCamara;
    }

    public Integer getBateria() {
        return bateria;
    }

    public void setBateria(Integer bateria) {
        this.bateria = bateria;
    }

    public Double getPulgadasPantalla() {
        return pulgadasPantalla;
    }

    public void setPulgadasPantalla(Double pulgadasPantalla) {
        this.pulgadasPantalla = pulgadasPantalla;
    }

    public Integer getResolucionPantallaAlto() {
        return resolucionPantallaAlto;
    }

    public void setResolucionPantallaAlto(Integer resolucionPantallaAlto) {
        this.resolucionPantallaAlto = resolucionPantallaAlto;
    }

    public Integer getResolucionPantallaAncho() {
        return resolucionPantallaAncho;
    }

    public void setResolucionPantallaAncho(Integer resolucionPantallaAncho) {
        this.resolucionPantallaAncho = resolucionPantallaAncho;
    }

    public Double getRam() {
        return ram;
    }

    public void setRam(Double ram) {
        this.ram = ram;
    }

    public EnumOS getSo() {
        return so;
    }

    public void setSo(EnumOS so) {
        this.so = so;
    }

    public Integer getRom() {
        return rom;
    }

    public void setRom(Integer rom) {
        this.rom = rom;
    }

    public Integer getProteccionPolvo() {
        return proteccionPolvo;
    }

    public void setProteccionPolvo(Integer proteccionPolvo) {
        this.proteccionPolvo = proteccionPolvo;
    }
    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaLancamiento() {
        return fechaLancamiento;
    }

    public void setFechaLancamiento(Date fechaLancamiento) {
        this.fechaLancamiento = fechaLancamiento;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Smartphone that = (Smartphone) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (marca != that.marca) return false;
        if (modelo != null ? !modelo.equals(that.modelo) : that.modelo != null) return false;
        if (camara != null ? !camara.equals(that.camara) : that.camara != null) return false;
        if (frontCamara != null ? !frontCamara.equals(that.frontCamara) : that.frontCamara != null)
            return false;
        if (bateria != null ? !bateria.equals(that.bateria) : that.bateria != null) return false;
        if (pulgadasPantalla != null ? !pulgadasPantalla.equals(that.pulgadasPantalla) : that.pulgadasPantalla != null)
            return false;
        if (resolucionPantallaAlto != null ? !resolucionPantallaAlto.equals(that.resolucionPantallaAlto) : that.resolucionPantallaAlto != null)
            return false;
        if (resolucionPantallaAncho != null ? !resolucionPantallaAncho.equals(that.resolucionPantallaAncho) : that.resolucionPantallaAncho != null)
            return false;
        if (ram != null ? !ram.equals(that.ram) : that.ram != null) return false;
        if (so != that.so) return false;
        if (rom != null ? !rom.equals(that.rom) : that.rom != null) return false;
        if (proteccionPolvo != null ? !proteccionPolvo.equals(that.proteccionPolvo) : that.proteccionPolvo != null)
            return false;
        if (puntuacion != null ? !puntuacion.equals(that.puntuacion) : that.puntuacion != null)
            return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null)
            return false;
        return fechaLancamiento != null ? fechaLancamiento.equals(that.fechaLancamiento) : that.fechaLancamiento == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (marca != null ? marca.hashCode() : 0);
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + (camara != null ? camara.hashCode() : 0);
        result = 31 * result + (frontCamara != null ? frontCamara.hashCode() : 0);
        result = 31 * result + (bateria != null ? bateria.hashCode() : 0);
        result = 31 * result + (pulgadasPantalla != null ? pulgadasPantalla.hashCode() : 0);
        result = 31 * result + (resolucionPantallaAlto != null ? resolucionPantallaAlto.hashCode() : 0);
        result = 31 * result + (resolucionPantallaAncho != null ? resolucionPantallaAncho.hashCode() : 0);
        result = 31 * result + (ram != null ? ram.hashCode() : 0);
        result = 31 * result + (so != null ? so.hashCode() : 0);
        result = 31 * result + (rom != null ? rom.hashCode() : 0);
        result = 31 * result + (proteccionPolvo != null ? proteccionPolvo.hashCode() : 0);
        result = 31 * result + (puntuacion != null ? puntuacion.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (fechaLancamiento != null ? fechaLancamiento.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "id=" + id +
                ", marca=" + marca +
                ", modelo='" + modelo + '\'' +
                ", camara=" + camara +
                ", frontCamara=" + frontCamara +
                ", bateria=" + bateria +
                ", pulgadasPantalla=" + pulgadasPantalla +
                ", resolucionPantallaAlto=" + resolucionPantallaAlto +
                ", resolucionPantallaAncho=" + resolucionPantallaAncho +
                ", ram=" + ram +
                ", so=" + so +
                ", rom=" + rom +
                ", proteccionPolvo=" + proteccionPolvo +
                ", puntuacion=" + puntuacion +
                ", descripcion='" + descripcion + '\'' +
                ", fechaLancamiento=" + fechaLancamiento +
                '}';
    }
}
