package ua.lviv.lhz.services;


import org.springframework.web.multipart.MultipartFile;
import ua.lviv.lhz.dto.CreditIPDTO;
import ua.lviv.lhz.entity.CreditIP;

import java.util.List;

/**
 * Created by Леся Гопшта on 09.10.2016.
 */
public interface CreditIPService {

    void addOrEdit(CreditIP creditIP);

    void delete(int idCredit);

    CreditIPDTO findOne(int idCredit);

    List<CreditIPDTO> findAll();

    void edit(int idCredit, String bankName, String type,
              double sumCredit, double percent, double term,
              double monthFee, double timeFee, String collateral,
              MultipartFile multipartFile);

    List<CreditIPDTO> findByName(String bankName);
}