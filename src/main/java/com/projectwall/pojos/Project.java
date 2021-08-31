package com.projectwall.pojos;

import java.util.Date;

public class Project {
	
	private Long id ;
	private String project_name ;
	private String project_descp ;
	private String icon ;
	private String project_stage ;
	private Boolean project_status ;
	private String client_name ;
	private String manager_name ;
	private Date created_on;
	private Date updated_on;


	public Project() {
		// TODO Auto-generated constructor stub
	}


	public Project(Long id, String project_name, String project_descp, String icon, String project_stage,
			Boolean project_status, String client_name, String manager_name, Date created_on, Date updated_on) {
		super();
		this.id = id;
		this.project_name = project_name;
		this.project_descp = project_descp;
		this.icon = icon;
		this.project_stage = project_stage;
		this.project_status = project_status;
		this.client_name = client_name;
		this.manager_name = manager_name;
		this.created_on = created_on;
		this.updated_on = updated_on;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getProject_name() {
		return project_name;
	}


	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}


	public String getProject_descp() {
		return project_descp;
	}


	public void setProject_descp(String project_descp) {
		this.project_descp = project_descp;
	}


	public String getIcon() {
		return icon;
	}


	public void setIcon(String icon) {
		this.icon = icon;
	}


	public String getProject_stage() {
		return project_stage;
	}


	public void setProject_stage(String project_stage) {
		this.project_stage = project_stage;
	}


	public Boolean getProject_status() {
		return project_status;
	}


	public void setProject_status(Boolean project_status) {
		this.project_status = project_status;
	}


	public String getClient_name() {
		return client_name;
	}


	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}


	public String getManager_name() {
		return manager_name;
	}


	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
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
		return "Project [id=" + id + ", project_name=" + project_name + ", project_descp=" + project_descp + ", icon="
				+ icon + ", project_stage=" + project_stage + ", project_status=" + project_status + ", client_name="
				+ client_name + ", manager_name=" + manager_name + ", created_on=" + created_on + ", updated_on="
				+ updated_on + "]";
	}
	
	
	
	

}
