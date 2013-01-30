package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VdsetorrotaId generated by hbm2java
 */
@Embeddable
public class VdsetorrotaId implements java.io.Serializable {

	private int codemp;
	private short codfilial;
	private int codsetor;
	private int sequencia;

	public VdsetorrotaId() {
	}

	public VdsetorrotaId(int codemp, short codfilial, int codsetor,
			int sequencia) {
		this.codemp = codemp;
		this.codfilial = codfilial;
		this.codsetor = codsetor;
		this.sequencia = sequencia;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODSETOR", nullable = false)
	public int getCodsetor() {
		return this.codsetor;
	}

	public void setCodsetor(int codsetor) {
		this.codsetor = codsetor;
	}

	@Column(name = "SEQUENCIA", nullable = false)
	public int getSequencia() {
		return this.sequencia;
	}

	public void setSequencia(int sequencia) {
		this.sequencia = sequencia;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VdsetorrotaId))
			return false;
		VdsetorrotaId castOther = (VdsetorrotaId) other;

		return (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodsetor() == castOther.getCodsetor())
				&& (this.getSequencia() == castOther.getSequencia());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodsetor();
		result = 37 * result + this.getSequencia();
		return result;
	}

}
