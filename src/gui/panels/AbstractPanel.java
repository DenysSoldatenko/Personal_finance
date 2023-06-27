package gui.panels;

import gui.MainFrame;
import gui.Refresh;
import javax.swing.JPanel;

public abstract class AbstractPanel extends JPanel implements Refresh {

  protected final MainFrame frame;

  public AbstractPanel(MainFrame frame) {
    this.frame = frame;
  }

  @Override
  public void refresh() {
    removeAll();
    init();
  }

  protected abstract void init();
}
