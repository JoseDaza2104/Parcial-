package core.controller.tables;

import core.controller.utils.Response;
import javax.swing.table.DefaultTableModel;


public interface Table {
    Response update(DefaultTableModel model);
}
