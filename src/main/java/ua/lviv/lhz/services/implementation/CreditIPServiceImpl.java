package ua.lviv.lhz.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ua.lviv.lhz.dto.CreditAvtoDTO;
import ua.lviv.lhz.dto.CreditIPDTO;
import ua.lviv.lhz.entity.CreditAvto;
import ua.lviv.lhz.entity.CreditIP;
import ua.lviv.lhz.repository.CreditAvtoRepo;
import ua.lviv.lhz.repository.CreditIPRepo;
import ua.lviv.lhz.services.CreditAvtoService;
import ua.lviv.lhz.services.CreditIPService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 * Created by Леся Гопшта on 09.10.2016.
 */
@Service
public class CreditIPServiceImpl implements CreditIPService {
    @Autowired
    private CreditIPRepo creditIPRepo;

    public void addOrEdit (CreditIP creditIP){
        creditIPRepo.save(creditIP);
    }

    public void delete (int idCredit){
        creditIPRepo.delete(idCredit);
    }


    @Override
    public List<CreditIPDTO> findAll() {
        List<CreditIPDTO> creditIPDTOs = new ArrayList<>();
        List<CreditIP> creditIPList = creditIPRepo.findAll();

        for (CreditIP creditIP : creditIPList) {
            CreditIPDTO creditIPDTO = new CreditIPDTO();
            creditIPDTO.setIdCredit( creditIP.getIdCredit() );
            creditIPDTO.setBankName(creditIP.getBankName());
            creditIPDTO.setType(creditIP.getType());
            creditIPDTO.setSumCredit(creditIP.getSumCredit());
            creditIPDTO.setPercent(creditIP.getPercent());
            creditIPDTO.setTerm(creditIP.getTerm());
            creditIPDTO.setTimeFee(creditIP.getTimeFee());
            creditIPDTO.setMonthFee(creditIP.getMonthFee());
            creditIP.setCollateral(creditIPDTO.getCollateral());

            String image = Base64.getEncoder().encodeToString( creditIP.getImage() );
            creditIPDTO.setImage( image );
            creditIPDTOs.add( creditIPDTO );
        }
        return creditIPDTOs;
    }

    @Override
    public void edit(
            int idCredit, String bankName, String type, double sumCredit,
            double percent, double term, double monthFee, double timeFee,
            String collateral, MultipartFile multipartFile) {
        CreditIP credit = creditIPRepo.findOne(idCredit);
        credit.setBankName(bankName);
        credit.setType(type);
        credit.setSumCredit(sumCredit);
        credit.setPercent(percent);
        credit.setTerm(term);
        credit.setMonthFee(monthFee);
        credit.setTimeFee(timeFee);
        credit.setCollateral(collateral);
        try {
            credit.setImage(multipartFile.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        creditIPRepo.save(credit);}
    @Override
    public CreditIPDTO findOne(int idCredit) {
        CreditIP creditIP = creditIPRepo.findOne( idCredit );
        CreditIPDTO creditIPDTO = new CreditIPDTO();
        creditIPDTO.setIdCredit( creditIP.getIdCredit() );
        creditIPDTO.setBankName( creditIP.getBankName() );
        creditIPDTO.setType( creditIP.getType() );
        creditIPDTO.setSumCredit( creditIP.getSumCredit() );
        creditIPDTO.setPercent( creditIP.getPercent() );
        creditIPDTO.setTerm(creditIP.getTerm());
        creditIPDTO.setMonthFee(creditIP.getMonthFee());
        creditIPDTO.setTimeFee(creditIP.getTimeFee());
        creditIPDTO.setCollateral(creditIP.getCollateral());

        String image = Base64.getEncoder().encodeToString( creditIP.getImage() );
        creditIPDTO.setImage( image );

        return creditIPDTO;

    }


    @Override
    public List<CreditIPDTO> findByName(String bankName) {
        List<CreditIPDTO>creditIPDTOs = new ArrayList<>();
        List<CreditIP>creditIPList = creditIPRepo.findByName(bankName);
        for (CreditIP creditIP: creditIPList){
            CreditIPDTO creditIPDTO = new CreditIPDTO();
            creditIPDTO.setIdCredit( creditIP.getIdCredit() );
            creditIPDTO.setBankName( creditIP.getBankName() );
            creditIPDTO.setType( creditIP.getType() );
            creditIPDTO.setSumCredit( creditIP.getSumCredit() );
            creditIPDTO.setPercent( creditIP.getPercent() );
            creditIPDTO.setTerm(creditIP.getTerm());
            creditIPDTO.setMonthFee(creditIP.getMonthFee());
            creditIPDTO.setTimeFee(creditIP.getTimeFee());
            creditIPDTO.setCollateral(creditIP.getCollateral());
            String image = Base64.getEncoder().encodeToString( creditIP.getImage() );
            creditIPDTO.setImage( image );
            creditIPDTOs.add( creditIPDTO );
        }
        return creditIPDTOs;
    }
}


