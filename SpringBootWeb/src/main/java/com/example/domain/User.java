package com.example.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity表明该类为一个实体类，它默认对应数据库中的表名是user。
//@Table当实体类与其映射的数据库表名不同名时需要使用
//@Table注解与@Entity注解并列使用，置于实体类声明语句之前，可写于单独语句行，也可与声明语句同行。
//@Table注解的常用选项是name，用于指明数据库的表名
//@Table注解还有两个选项catalog和schema用于设置表所属的数据库目录或模式，通常为数据库名
//如果缺省@Table注解，则class字段名即表中的字段名，
//所以需要@Column注解来改变class中字段名与db中表的字段名的映射规则
@Entity
public class User implements Serializable {
//@Column注解定义了将成员属性映射到关系表中的哪一列和该列的结构信息，属性如下：
//1）name：映射的列名。如：映射tbl_user表的name列，可以在name属性的上面或getName方法上面加入；
//2）unique：是否唯一；
//3）nullable：是否允许为空；
//4）length：对于字符型列，length属性指定列的最大字符长度；
//5）insertable：是否允许插入；
//6）updatetable：是否允许更新；
//7）columnDefinition：定义建表时创建此列的DDL；
//8）secondaryTable：从表名。如果此列不建在主表上（默认是主表），该属性定义该列所在从表的名字
	private static final long serialVersionUID = 1L;
	//@Id注解指定表的主键
	//它可以有多种生成方式：
	//1）TABLE：容器指定用底层的数据表确保唯一；
	//2）SEQUENCE：使用数据库德SEQUENCE列莱保证唯一（Oracle数据库通过序列来生成唯一ID）；
	//3）IDENTITY：使用数据库的IDENTITY列莱保证唯一；
	//4）AUTO：由容器挑选一个合适的方式来保证唯一；
	//5）NONE：容器不负责主键的生成，由程序来完成。
	//@GeneratorValue注解--JPA通用策略生成器
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, unique = true)
	private String userName;
	@Column(nullable = false)
	private String passWord;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = true, unique = true)
	private String nickName;
	@Column(nullable = false)
	private String regTime;

	public User() {
		super();
	}
	public User(String email, String nickName, String passWord, String userName, String regTime) {
		super();
		this.email = email;
		this.nickName = nickName;
		this.passWord = passWord;
		this.userName = userName;
		this.regTime = regTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getRegTime() {
		return regTime;
	}
	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

}