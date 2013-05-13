package com.acme.main.client;

import com.google.gwt.core.client.GWT;
import java.util.logging.Logger;

public class Foo {
	private final Logger logger = Logger.getLogger (getClass ().getName ());
   public void foo (final String msg) {
      GWT.log ("Foo says: "+msg);
      logger.warning ("Foo says: "+msg);
   }
}
