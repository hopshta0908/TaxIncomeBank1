package ua.lviv.lhz.services;

import org.springframework.web.multipart.MultipartFile;
import ua.lviv.lhz.dto.CreditAvtoDTO;
import ua.lviv.lhz.entity.CreditAvto;

import java.util.List;

/**
 * Created by Леся Гопшта on 08.10.2016.
 */
public interface CreditAvtoService {

    void addOrEdit(CreditAvto creditAvto);

    void delete(int idCredit);

    CreditAvtoDTO findOne(int idCredit);

    List<CreditAvtoDTO> findAll();

    void edit(int idCredit, String bankName, String type,
              double sumCredit, double percent, double term,
              double monthFee, double timeFee, String collateral,
              MultipartFile multipartFile);
    List<CreditAvtoDTO> findByName(String bankName);
}

