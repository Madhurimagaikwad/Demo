
package com.velocity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.UserLogin;

@Repository
public interface UserLoginRepository extends CrudRepository<UserLogin, Integer> {

}

package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginRepository extends JpaRepository<UserLoginRepository, Integer> {

}
