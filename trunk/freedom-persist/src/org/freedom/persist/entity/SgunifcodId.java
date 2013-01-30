package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SgunifcodId generated by hbm2java
 */
@Embeddable
public class SgunifcodId implements java.io.Serializable {

	private int codunifcod;
	private short codfilial;
	private int codemp;

	public SgunifcodId() {
	}

	public SgunifcodId(int codunifcod, short codfilial, int codemp) {
		this.codunifcod = codunifcod;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODUNIFCOD", nullable = false)
	public int getCodunifcod() {
		return this.codunifcod;
	}

	public void setCodunifcod(int codunifcod) {
		this.codunifcod = codunifcod;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SgunifcodId))
			return false;
		SgunifcodId castOther = (SgunifcodId) other;

		return (this.getCodunifcod() == castOther.getCodunifcod())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodunifcod();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
