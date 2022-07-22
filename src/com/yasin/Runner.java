package com.yasin;

import com.yasin.repository.UserRepositoryIml;

public class Runner {

	public static void main(String[] args) {

		System.out.println("*** UYGULAMA BAÞLADI DATALAR ÇEKÝLÝYOR... ***");
		UserRepositoryIml dbUser = new UserRepositoryIml(5);
//		dbUser.getUserList().stream()....;

	}

}
