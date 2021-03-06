package au.csiro.feedback.model;

// Generated 24/10/2015 11:50:16 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * TargetContext generated by hbm2java
 */
@Entity
@Table(name = "target_context", catalog = "userfeedback")
public class TargetContext implements java.io.Serializable {

	private Integer contextId;
	private FeedbackTarget feedbackTarget;
	private String source;
	private String owner;
	private String description;
	private Date accessDate;

	public TargetContext() {
	}

	public TargetContext(FeedbackTarget feedbackTarget, Date accessDate) {
		this.feedbackTarget = feedbackTarget;
		this.accessDate = accessDate;
	}

	public TargetContext(FeedbackTarget feedbackTarget, String source, String owner, String description, Date accessDate) {
		this.feedbackTarget = feedbackTarget;
		this.source = source;
		this.owner = owner;
		this.description = description;
		this.accessDate = accessDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "context_id", unique = true, nullable = false)
	public Integer getContextId() {
		return this.contextId;
	}

	public void setContextId(Integer contextId) {
		this.contextId = contextId;
	}

	@Cascade({CascadeType.ALL})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "feedback_target", nullable = false)
	public FeedbackTarget getFeedbackTarget() {
		return this.feedbackTarget;
	}

	public void setFeedbackTarget(FeedbackTarget feedbackTarget) {
		this.feedbackTarget = feedbackTarget;
	}

	@Column(name = "source", length = 150)
	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Column(name = "owner", length = 400)
	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Column(name = "description", length = 500)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "access_date", nullable = false, length = 19)
	public Date getAccessDate() {
		return this.accessDate;
	}

	public void setAccessDate(Date accessDate) {
		this.accessDate = accessDate;
	}

}
