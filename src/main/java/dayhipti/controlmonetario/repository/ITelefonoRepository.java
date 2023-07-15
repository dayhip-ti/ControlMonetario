package dayhipti.controlmonetario.repository;

import dayhipti.controlmonetario.entity.Telefono;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITelefonoRepository extends JpaRepository<Telefono,String> {
}
