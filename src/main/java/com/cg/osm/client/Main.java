package com.cg.osm.client;

import java.util.Scanner;
import com.cg.osm.service.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Select option");
		System.out.println("1. Existing User 2. New User");
		Scanner input = new Scanner(System.in);
		int option = input.nextInt();
		switch (option) {
			case 1: {
				System.out.print("Login User\n");
				String username = input.next();
				System.out.println("Enter password\n");
				String password = input.next();
				UserService userService = new UserServiceImpl();
				break;
			}
			case 2: {
				break;
			}
			default: {
			}
		}

	}

}
