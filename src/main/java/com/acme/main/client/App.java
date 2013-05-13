package com.acme.main.client;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.chrisgammage.ginjitsu.client.AfterInject;

@Singleton
public class App {

   @Inject
   Foo foo;
   String msg = "damn donkey!!!";

   @AfterInject
   public void afterInject () {
      msg = "It's amazing!!!";
   }

   @Inject
   public void init () {
      msg = "The hack works!!!";
   }
   
   public void run () {
      foo.foo (msg);
   }

}
