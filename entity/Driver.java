
import java.io.Serializable;

public class Driver implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String hora;
	private int idPiloto;
	private String piloto;
	private int numVolta;
	private Long tempoVolta;
	private double velMediaVolta;
	
	public Driver() {
		
	}
	public Driver(String hora, int idPiloto, String piloto, int numVolta, Long tempoVolta,
			double velMediaVolta) {
		super();
		this.hora = hora;
		this.idPiloto = idPiloto;
		this.piloto = piloto;
		this.numVolta = numVolta;
		this.tempoVolta = tempoVolta;
		this.velMediaVolta = velMediaVolta;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public int getIdPiloto() {
		return idPiloto;
	}
	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}
	public String getPiloto() {
		return piloto;
	}
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	public int getNumVolta() {
		return numVolta;
	}
	public void setNumVolta(int numVolta) {
		this.numVolta = numVolta;
	}
	public Long getTempoVolta() {
		return tempoVolta;
	}
	public void setTempoVolta(Long tempoVolta) {
		this.tempoVolta = tempoVolta;
	}
	public double getVelMediaVolta() {
		return velMediaVolta;
	}
	public void setVelMediaVolta(double velMediaVolta) {
		this.velMediaVolta = velMediaVolta;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
