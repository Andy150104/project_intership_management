package swp.internmanagement.internmanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import swp.internmanagement.internmanagement.models.User_account;

@Repository
public interface UserRepository extends JpaRepository<User_account, Integer> {
    Optional<User_account> findByUserName(String userName); // Corrected method name
    Boolean existsByUserName(String userName); // Corrected method name
    Boolean existsByEmail(String email);
    @Query(value = "SELECT TOP 1 user_id FROM User_account ORDER BY user_id DESC", nativeQuery = true)
    int findLastUserId();

    @Query("SELECT u from User_account u where u.company.companyName like %?1% or u.role like %?1%")
    List<User_account> findUserAccountByParam(String param);
}
