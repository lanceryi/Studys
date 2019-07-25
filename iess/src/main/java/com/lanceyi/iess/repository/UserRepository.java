package com.lanceyi.iess.repository;

import com.lanceyi.iess.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lance YI
 * @date 2019/7/24 9:26
 */

public interface UserRepository extends JpaRepository<User, Long> {

}
