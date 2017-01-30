package demo.errai.jpa.client;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.jboss.errai.ioc.client.api.AfterInitialization;
import org.jboss.errai.ioc.client.api.EntryPoint;

import com.google.gwt.user.client.ui.RootPanel;

import demo.errai.jpa.client.view.PersonTable;
import gwt.material.design.client.ui.MaterialSplashScreen;

@EntryPoint
public class App {
  MaterialSplashScreen splash = new MaterialSplashScreen();

  @Inject RootPanel root;
  @Inject PersonTable personTable;

  public App() {
    RootPanel.get().add(splash);
    splash.show();
  }

  @PostConstruct
  void construct() {
    root.add(personTable);
  }

  @AfterInitialization
  void init() {
    splash.hide();
  }
}
