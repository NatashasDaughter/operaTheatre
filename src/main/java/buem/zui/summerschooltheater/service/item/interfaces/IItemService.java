package buem.zui.summerschooltheater.service.item.interfaces;

import buem.zui.summerschooltheater.model.Item;

import java.util.List;

public interface IItemService {
    //CRUD
    Item create(Item item);
    Item update(Item item);
    Item get(String id);//like read
    void delete(String id);
    List<Item> getAll();
}
