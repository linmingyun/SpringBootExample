package com.example.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity��������Ϊһ��ʵ���࣬��Ĭ�϶�Ӧ���ݿ��еı�����user��
//@Table��ʵ��������ӳ������ݿ������ͬ��ʱ��Ҫʹ��
//@Tableע����@Entityע�Ⲣ��ʹ�ã�����ʵ�����������֮ǰ����д�ڵ�������У�Ҳ�����������ͬ�С�
//@Tableע��ĳ���ѡ����name������ָ�����ݿ�ı���
//@Tableע�⻹������ѡ��catalog��schema�������ñ����������ݿ�Ŀ¼��ģʽ��ͨ��Ϊ���ݿ���
//���ȱʡ@Tableע�⣬��class�ֶ��������е��ֶ�����
//������Ҫ@Columnע�����ı�class���ֶ�����db�б���ֶ�����ӳ�����
@Entity
public class User implements Serializable {
//@Columnע�ⶨ���˽���Ա����ӳ�䵽��ϵ���е���һ�к͸��еĽṹ��Ϣ���������£�
//1��name��ӳ����������磺ӳ��tbl_user���name�У�������name���Ե������getName����������룻
//2��unique���Ƿ�Ψһ��
//3��nullable���Ƿ�����Ϊ�գ�
//4��length�������ַ����У�length����ָ���е�����ַ����ȣ�
//5��insertable���Ƿ�������룻
//6��updatetable���Ƿ�������£�
//7��columnDefinition�����彨��ʱ�������е�DDL��
//8��secondaryTable���ӱ�����������в����������ϣ�Ĭ���������������Զ���������ڴӱ������
	private static final long serialVersionUID = 1L;
	//@Idע��ָ���������
	//�������ж������ɷ�ʽ��
	//1��TABLE������ָ���õײ�����ݱ�ȷ��Ψһ��
	//2��SEQUENCE��ʹ�����ݿ��SEQUENCE������֤Ψһ��Oracle���ݿ�ͨ������������ΨһID����
	//3��IDENTITY��ʹ�����ݿ��IDENTITY������֤Ψһ��
	//4��AUTO����������ѡһ�����ʵķ�ʽ����֤Ψһ��
	//5��NONE���������������������ɣ��ɳ�������ɡ�
	//@GeneratorValueע��--JPAͨ�ò���������
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