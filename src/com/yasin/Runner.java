package com.yasin;

import com.yasin.repository.UserRepositoryIml;

public class Runner {

	public static void main(String[] args) {

		System.out.println("*** UYGULAMA BA�LADI DATALAR �EK�L�YOR... ***");
		UserRepositoryIml dbUser = new UserRepositoryIml(5);
//		dbUser.getUserList().stream()....;

	}

}
