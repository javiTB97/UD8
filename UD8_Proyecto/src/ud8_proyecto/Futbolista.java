
import java.util.Objects;

public class Futbolista {
    
    private String dorsal;
    private String nombre;
    private String demarcación;

    public Futbolista() {
    }

    public Futbolista(String dorsal, String nombre, String demarcación) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.demarcación = demarcación;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDemarcación() {
        return demarcación;
    }

    public void setDemarcación(String demarcación) {
        this.demarcación = demarcación;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "dorsal=" + dorsal + ", nombre=" + nombre + ", demarcación=" + demarcación + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Futbolista other = (Futbolista) obj;
        if (!Objects.equals(this.dorsal, other.dorsal)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.demarcación, other.demarcación)) {
            return false;
        }
        return true;
    }
    
    
}


