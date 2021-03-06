package com.glg.model.entity;

// Generated 26 d�c. 2013 10:57:05 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TestId generated by hbm2java
 */
@Embeddable
public class TestId implements java.io.Serializable {

	private long idTest;
	private String idTest1;
	private BigDecimal idTest2;
	private BigDecimal idTest3;

	public TestId() {
	}

	public TestId(long idTest) {
		this.idTest = idTest;
	}

	public TestId(long idTest, String idTest1, BigDecimal idTest2,
			BigDecimal idTest3) {
		this.idTest = idTest;
		this.idTest1 = idTest1;
		this.idTest2 = idTest2;
		this.idTest3 = idTest3;
	}

	@Column(name = "ID_TEST", nullable = false, precision = 12, scale = 0)
	public long getIdTest() {
		return this.idTest;
	}

	public void setIdTest(long idTest) {
		this.idTest = idTest;
	}

	@Column(name = "ID_TEST1", length = 0)
	public String getIdTest1() {
		return this.idTest1;
	}

	public void setIdTest1(String idTest1) {
		this.idTest1 = idTest1;
	}

	@Column(name = "ID_TEST2", precision = 22, scale = 0)
	public BigDecimal getIdTest2() {
		return this.idTest2;
	}

	public void setIdTest2(BigDecimal idTest2) {
		this.idTest2 = idTest2;
	}

	@Column(name = "ID_TEST3", precision = 22, scale = 0)
	public BigDecimal getIdTest3() {
		return this.idTest3;
	}

	public void setIdTest3(BigDecimal idTest3) {
		this.idTest3 = idTest3;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TestId))
			return false;
		TestId castOther = (TestId) other;

		return (this.getIdTest() == castOther.getIdTest())
				&& ((this.getIdTest1() == castOther.getIdTest1()) || (this
						.getIdTest1() != null && castOther.getIdTest1() != null && this
						.getIdTest1().equals(castOther.getIdTest1())))
				&& ((this.getIdTest2() == castOther.getIdTest2()) || (this
						.getIdTest2() != null && castOther.getIdTest2() != null && this
						.getIdTest2().equals(castOther.getIdTest2())))
				&& ((this.getIdTest3() == castOther.getIdTest3()) || (this
						.getIdTest3() != null && castOther.getIdTest3() != null && this
						.getIdTest3().equals(castOther.getIdTest3())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getIdTest();
		result = 37 * result
				+ (getIdTest1() == null ? 0 : this.getIdTest1().hashCode());
		result = 37 * result
				+ (getIdTest2() == null ? 0 : this.getIdTest2().hashCode());
		result = 37 * result
				+ (getIdTest3() == null ? 0 : this.getIdTest3().hashCode());
		return result;
	}

}
