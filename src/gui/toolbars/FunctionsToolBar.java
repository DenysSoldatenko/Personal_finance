package gui.toolbars;

import gui.MainButton;
import gui.handlers.Handler;
import gui.interfaces.EnableEditDelete;
import settings.HandlerCode;
import settings.Text;
import settings.styles.BorderStyle;
import settings.styles.ImageIconStyle;

/**
 * The FunctionsToolBar class represents a toolbar with common functions.
 */
public final class FunctionsToolBar extends AbstractToolBar implements EnableEditDelete {

  private MainButton editButton;
  private MainButton deleteButton;

  public FunctionsToolBar(Handler handler) {
    super(BorderStyle.BORDER_FUNCTIONS_TOOLBAR, handler);
    init();
  }

  @Override
  protected void init() {
    addButton(Text.get("ADD"), ImageIconStyle.ICON_ADD,
        HandlerCode.ADD, false);
    editButton = addButton(Text.get("EDIT"), ImageIconStyle.ICON_EDIT,
        HandlerCode.EDIT, false);
    deleteButton = addButton(Text.get("DELETE"), ImageIconStyle.ICON_DELETE,
        HandlerCode.DELETE, false);
  }

  @Override
  public void setEnableEditDelete(boolean enable) {
    editButton.setEnabled(enable);
    deleteButton.setEnabled(enable);
  }
}

