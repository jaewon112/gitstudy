package service;

import service.entity.User;

 class UserService {
  private static UserService instance;

 public static void register() {
  new User("a1", "1", "김",
          "@a", "010", "동래", 12, "롤");
 }

 public void printAll() {

 }


}
