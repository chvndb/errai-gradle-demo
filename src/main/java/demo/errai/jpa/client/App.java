package demo.errai.jpa.client;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.jboss.errai.ioc.client.api.AfterInitialization;
import org.jboss.errai.ioc.client.api.EntryPoint;

import com.google.gwt.user.client.ui.RootPanel;

import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialSplashScreen;

@EntryPoint
public class App {
  MaterialSplashScreen splash = new MaterialSplashScreen();
  MaterialLabel label = new MaterialLabel("Hello from chvndb !!");

  @Inject RootPanel root;

  public App() {
    RootPanel.get().add(splash);
    splash.show();
  }

  @PostConstruct
  void construct() {
    root.add(label);
  }

  @AfterInitialization
  void init() {
    splash.hide();
  }
}
