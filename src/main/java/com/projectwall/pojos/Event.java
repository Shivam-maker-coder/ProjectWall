package com.projectwall.pojos;

import java.util.Date;

public class Event {
	
	private Long id ;
	private String descp ;
	private String type_of_update ;
	private String activity ;
	private String event_status ;
	private enum  internal_flag
	{
	    RED, GREEN , YELLOW ;
	}
	private enum  external_flag
	{
	    RED, GREEN , YELLOW ;
	}
	private String attachment ;
	private Date  created_on  ;
	private Date updated_on ;
	

	public Event() {
		// TODO Auto-generated constructor stub
	}


	public Event(Long id, String descp, String type_of_update, String activity, String event_status, String attachment,
			Date created_on, Date updated_on) {
		super();
		this.id = id;
		this.descp = descp;
		this.type_of_update = type_of_update;
		this.activity = activity;
		this.event_status = event_status;
		this.attachment = attachment;
		this.created_on = created_on;
		this.updated_on = updated_on;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescp() {
		return descp;
	}


	public void setDescp(String descp) {
		this.descp = descp;
	}


	public String getType_of_update() {
		return type_of_update;
	}


	public void setType_of_update(String type_of_update) {
		this.type_of_update = type_of_update;
	}


	public String getActivity() {
		return activity;
	}


	public void setActivity(String activity) {
		this.activity = activity;
	}


	public String getEvent_status() {
		return event_status;
	}


	public void setEvent_status(String event_status) {
		this.event_status = event_status;
	}


	public String getAttachment() {
		return attachment;
	}


	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}


	public Date getCreated_on() {
		return created_on;
	}


	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}


	public Date getUpdated_on() {
		return updated_on;
	}


	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}


	@Override
	public String toString() {
		return "Event [id=" + id + ", descp=" + descp + ", type_of_update=" + type_of_update + ", activity=" + activity
				+ ", event_status=" + event_status + ", attachment=" + attachment + ", created_on=" + created_on
				+ ", updated_on=" + updated_on + "]";
	}
	
	

}
