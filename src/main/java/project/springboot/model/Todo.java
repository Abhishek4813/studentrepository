package project.springboot.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.transaction.Transactional;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Transactional
public class Todo {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="user")
	private String user;
	
	@Size(min=10, message="Must be grater then 10")
	@NotBlank(message="Description is required.")
	@Column(name="description")
	private String desc;
	@Column(name="target_date")
	private Date targetDate;
	@Column(name="status")
	private boolean isDone;
	
	public Todo() {
		super();
	}
	
	public Todo(int id, String user, String desc, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.user = user;
		this.desc = desc;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", user=" + user + ", desc=" + desc + ", targetDate=" + targetDate + ", isDone="
				+ isDone + "]";
	}
	
	
	
}
