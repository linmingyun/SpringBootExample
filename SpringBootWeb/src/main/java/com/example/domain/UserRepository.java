package com.example.domain;

import org.springframework.data.jpa.repository.JpaRepository;

//Repository �ӿ��� spring Data ��һ�����Ľӿڣ������ṩ�κη�����
//��������Ҫ���Լ�����Ľӿ���������Ҫ�ķ�����
//������Repository�ṩ������������ݷ��ʹ��ܣ��伸���ӽӿ�����չ��һЩ���ܡ����ǵļ̳й�ϵ���£�
//Repository�� ������һ����ʶ�������κμ̳����ľ�Ϊ�ֿ�ӿ���
//��1��CrudRepository�� �̳� Repository��ʵ����һ�� CRUD ��صķ���
//��2��PagingAndSortingRepository�� �̳� CrudRepository��ʵ����һ���ҳ������صķ���
//��3��JpaRepository�� �̳� PagingAndSortingRepository��ʵ��һ�� JPA �淶��صķ���
//�Զ���� XxxxRepository ��Ҫ�̳� JpaRepository��
//������ XxxxRepository �ӿھ;߱���ͨ�õ����ݷ��ʿ��Ʋ��������
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);
    
}