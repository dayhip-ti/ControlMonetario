package dayhipti.controlmonetario.service.serviceinpl;

import dayhipti.controlmonetario.repository.IMesRepository;
import dayhipti.controlmonetario.service.IMesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("mesImpl")
public class MesImpl implements IMesService {
    @Autowired
    IMesRepository objMesRepo;
}
