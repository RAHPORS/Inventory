package com.rahpors.Inventory.repository;

import com.rahpors.Inventory.entity.LogApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by ramon on 8/09/17.
 */

@Repository("logAppRepository")
public interface LogAppRepository extends JpaRepository<LogApp, Serializable>{

}
