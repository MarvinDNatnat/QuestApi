package quest.phil.diagnostic.information.system.ws.model.entity.laboratory.se;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import quest.phil.diagnostic.information.system.ws.model.entity.QisReferenceLaboratory;

@Entity
@DynamicUpdate
@Table(name = "qis_transaction_laboratory_se_covid")
public class QisTransactionLabCovid implements Serializable {

	private static final long serialVersionUID = 6007511227216911666L;

	@JsonIgnore
	@Id
	private Long id;
	
	@Column(name = "cov_igm", nullable = true, columnDefinition = "boolean default null")
	private Boolean covigm;

	@Column(name = "cov_igg", nullable = true, columnDefinition = "boolean default null")
	private Boolean covigg;

	@JsonIgnore
	@Column(name = "created_at", nullable = true, columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar createdAt = Calendar.getInstance();

	@JsonIgnore
	@Column(name = "updated_at", nullable = true, columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar updatedAt = Calendar.getInstance();

	@JsonIgnore
	@Column(name = "created_by", nullable = true)
	private Long createdBy = null;

	@JsonIgnore
	@Column(name = "updated_by", nullable = true)
	private Long updatedBy = null;

	@Column(name = "purpose", nullable = true)
	private String purpose;
	
	@JsonIgnore
	@Column(name = "molecular_lab_id", nullable = true)
	private Long referenceLabId;
	@ManyToOne(optional = true)
	@JoinColumn(name = "molecular_lab_id", insertable = false, updatable =false)
	@JsonManagedReference 
	private QisReferenceLaboratory referenceLab;


	public QisTransactionLabCovid() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getCovigm() {
		return covigm;
	}

	public void setCovigm(Boolean covigm) {
		this.covigm = covigm;
	}

	public Boolean getCovigg() {
		return covigg;
	}

	public void setCovigg(Boolean covigg) {
		this.covigg = covigg;
	}

	public Calendar getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Calendar createdAt) {
		this.createdAt = createdAt;
	}

	public Calendar getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Calendar updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Long getMolecularLab() {
		return referenceLabId;
	}

	public void setMolecularLab(Long molecularLab) {
		this.referenceLabId = molecularLab;
	}

	public QisReferenceLaboratory getReferenceLab() {
		return referenceLab;
	}

	public void setReferenceLab(QisReferenceLaboratory referenceLab) {
		this.referenceLab = referenceLab;
	}

	public Long getReferenceLabId() {
		return referenceLabId;
	}

	public void setReferenceLabId(Long referenceLabId) {
		this.referenceLabId = referenceLabId;
	}

}
