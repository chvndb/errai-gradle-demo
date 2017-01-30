package demo.errai.client.view;

import java.util.Comparator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Panel;

import demo.errai.client.model.Person;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.data.AbstractDataView;
import gwt.material.design.client.data.component.RowComponent;
import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.table.MaterialDataTable;
import gwt.material.design.client.ui.table.cell.TextColumn;

public class PersonTable extends Composite {
  @Inject EntityManager em;
  MaterialRow content = new MaterialRow();
  MaterialDataTable<Person> table = new MaterialDataTable<>(new AbstractDataView<Person>() {});
  MaterialIcon create = new MaterialIcon(IconType.ADD);

  private PersonTable() {}

  @PostConstruct
  void constuct() {
    initWidget(content);
    table.setId("persons-table");
  }

  @Override
  protected void onLoad() {
    super.onLoad();
    content.add(table);

    table.getTableTitle().setText("Persons");
    table.setShadow(1);
    table.setUseStickyHeader(true);

    Panel panel = table.getScaffolding().getToolPanel();
    panel.clear();
    panel.add(create);

    table.addColumn(new TextColumn<Person>() {
      @Override
      public Comparator<? super RowComponent<Person>> getSortComparator() {
        return (o1, o2) -> o1.getData().getName().compareToIgnoreCase(o2.getData().getName());
      }

      @Override
      public String getValue(Person object) {
        return object.getName();
      }
    }, "Name");

    refresh();
  }

  private void refresh() {
    List<Person> results = em.createNamedQuery(Person.SELECT_ALL, Person.class).getResultList();
    table.setRowData(0, results);
  }
}
