package com.zhiyou.action;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding.Use;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

import com.zhiyou.model.Blog;
import com.zhiyou.model.Blogtype;
import com.zhiyou.model.User;
import com.zhiyou.service.BlogService;
import com.zhiyou.service.BlogTypeService;
import com.zhiyou.service.UserService;

@Namespace("/view")
@Controller("viewAction")
@Scope("prototype")
@ParentPackage(value = "blogviews")

public class ViewAction extends ActionSupport implements ModelDriven<Blog> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Blog blog = new Blog();
	private int idd;
	private int blogTypeId;
	@Resource
	private BlogService blogService;
	@Resource
	private BlogTypeService blogTypeService;
	@Resource
	private UserService userService;

	
	@Action(value = "index", results = { @Result(name = "input",location="index.jsp") })
	public String index(){
		List<Blog> blogs=blogService.viewfdall();
		ValueStack vs=ActionContext.getContext().getValueStack();
		
    	vs.set("datas", blogs);
		
		
		return INPUT;
		
	}
	@Action(value = "info", results = { @Result(name = "input", location = "info.jsp") })
	public String info(){
		List<Blog> blogs=blogService.viewfdall();
		ValueStack vs=ActionContext.getContext().getValueStack();
		
    	vs.set("datas", blogs);
		return INPUT;
		
	}
	@Action(value = "datas", results = { @Result(name = "input", location = "datas.jsp") })
	public String datas(){
		List<Blog> blogs=blogService.sxfindall();
		ValueStack vs=ActionContext.getContext().getValueStack();
		
    	vs.set("datas", blogs);
		return INPUT;
		
	}
	
	

	public int getIdd() {
		return idd;
	}

	public void setIdd(int idd) {
		this.idd = idd;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public BlogTypeService getBlogTypeService() {
		return blogTypeService;
	}

	public void setBlogTypeService(BlogTypeService blogTypeService) {
		this.blogTypeService = blogTypeService;
	}

	public BlogService getBlogService() {
		return blogService;
	}

	public void setBlogService(BlogService blogService) {
		this.blogService = blogService;
	}

	@Override
	public Blog getModel() {
		// TODO Auto-generated method stub
		return blog;
	}

	public int getBlogTypeId() {
		return blogTypeId;
	}

	public void setBlogTypeId(int blogTypeId) {
		this.blogTypeId = blogTypeId;
	}

}