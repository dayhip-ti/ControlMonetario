package dayhipti.controlmonetario.service.serviceinpl;

import dayhipti.controlmonetario.repository.IMesRepository;
import dayhipti.controlmonetario.service.IMesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("mesImpl")
public interface MesImpl implements IMesService {
    @Autowired
    IMesRepository objMesRepo;
}
