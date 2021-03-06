import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class Month_Event_P extends MyPanel {
  private Month_P m_P;
  private Event_P e_P;
  /**
    Constructor
    */
  public Month_Event_P(Model m, View v) {
    super(m, v);
    m_P = new Month_P(getModel(), getView());
    e_P = new Event_P(getModel(), getView());

    setLayout(new BorderLayout());
    add(m_P, BorderLayout.LINE_START);
    add(e_P, BorderLayout.LINE_END);
  }
  /**
    update all data in GUI tree branch in depth first order.
    */
  @Override
  public void updateData() {
    m_P.updateData();
    e_P.updateData();
  }
}
