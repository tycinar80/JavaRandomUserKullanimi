package com.yasin.repository;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import com.yasin.repository.entity.User;

public class UserRepositoryIml {
	private List<User> userList;

	public UserRepositoryIml(int cekilecekKisiSayisi) {
		super();
		getAllUsers(cekilecekKisiSayisi);
	}

	public List<User> getUserList() {
		return userList;
	}

	private void getAllUsers(int count) {
		Scanner sc = null;
		try {
			sc = new Scanner(new URL("https://randomuser.me/api/?results=500").openStream(), "UTF-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringBuilder sb = new StringBuilder();
		while (sc.hasNext()) {
			sb.append(sc.nextLine());
		}

//		List<Person> kisiListesi = new ArrayList();
//		Gson gson = new Gson();
//		JsonElement jsonElement = JsonParser.parseString(sb.toString());
//		JsonObject jsonObject = jsonElement.getAsJsonObject();
//		JsonArray jsonArray = jsonObject.get("results").getAsJsonArray();
//		int size = jsonArray.size();
//		for(int i=0; i<size; i++) {
//			JsonObject o = jsonArray.get(i).getAsJsonObject();
//			Person pp =  gson.fromJson(o,Person.class);
//			kisiListesi.add(pp);
//		}
//		kisiListesi.forEach(
//				x-> System.out.println(x.name.getFirst()+ " - "+ 
//						x.name.getLast()+ " - "+
//						x.getEmail()+ " - "+
//						x.getPhone()+ " - "+
//						x.getNat()
//				));
	}
}
