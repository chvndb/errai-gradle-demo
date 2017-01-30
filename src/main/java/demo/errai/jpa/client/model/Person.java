package demo.errai.jpa.client.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jboss.errai.databinding.client.api.Bindable;

@NamedQuery(name = Person.SELECT_ALL, query = "SELECT i FROM Person i")
@Bindable
@Entity
public class Person {
  public static final String SELECT_ALL = "allPersons";

  @Id @GeneratedValue private int id;
  @NotNull @Size(min = 2) private String name;

  public Person() {}

  public Person(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
