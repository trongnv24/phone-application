package Training_java_Springg.boot.phone.repository;

import Training_java_Springg.boot.phone.entity.PhoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<PhoneEntity, String> {
}
