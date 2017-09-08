package com.rahpors.Inventory.service.impl;

import com.rahpors.Inventory.entity.Item;
import com.rahpors.Inventory.repository.ItemRepository;
import com.rahpors.Inventory.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ramon on 8/09/17.
 */

@Service("itemServiceImpl")
public class ItemServiceImpl implements ItemService {

    @Autowired
    @Qualifier("itemRepository")
    private ItemRepository itemRepository;

    @Override
    public List<Item> listAllItems() {
        return itemRepository.findAll();
    }
}
