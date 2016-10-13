package ua.lviv.lhz.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ua.lviv.lhz.dto.CreditAvtoDTO;
import ua.lviv.lhz.entity.CreditAvto;
import ua.lviv.lhz.repository.CreditAvtoRepo;

import ua.lviv.lhz.services.CreditAvtoService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 * Created by Леся Гопшта on 08.10.2016.
 */
@Service
public class CreditAvtoServiceImpl implements CreditAvtoService {
    @Autowired
    private CreditAvtoRepo creditAvtoRepo;

    public void addOrEdit (CreditAvto creditAvto){
        creditAvtoRepo.save(creditAvto);
    }

    public void delete (int idCredit){
        creditAvtoRepo.delete(idCredit);
    }


    @Override
    public List<CreditAvtoDTO> findAll() {
        List<CreditAvtoDTO> creditAvtoDTOs = new ArrayList<>();
        List<CreditAvto> creditAvtoList = creditAvtoRepo.findAll();

        for (CreditAvto creditAvto : creditAvtoList) {
            CreditAvtoDTO creditAvtoDTO = new CreditAvtoDTO();
            creditAvtoDTO.setIdCredit( creditAvto.getIdCredit() );
            creditAvtoDTO.setBankName(creditAvto.getBankName());
            creditAvtoDTO.setType(creditAvto.getType());
            creditAvtoDTO.setSumCredit(creditAvto.getSumCredit());
            creditAvtoDTO.setPercent(creditAvto.getPercent());
            creditAvtoDTO.setTerm(creditAvto.getTerm());
            creditAvtoDTO.setTimeFee(creditAvto.getTimeFee());
            creditAvtoDTO.setMonthFee(creditAvto.getMonthFee());
            creditAvto.setCollateral(creditAvtoDTO.getCollateral());

            String image = Base64.getEncoder().encodeToString( creditAvto.getImage() );
            creditAvtoDTO.setImage( image );
            creditAvtoDTOs.add( creditAvtoDTO );
        }
        return creditAvtoDTOs;
    }

    @Override
    public void edit(
            int idCredit, String bankName, String type, double sumCredit,
            double percent, double term, double monthFee, double timeFee,
            String collateral, MultipartFile multipartFile) {
        CreditAvto credit = creditAvtoRepo.findOne(idCredit);
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
        creditAvtoRepo.save(credit);}
   @Override
    public CreditAvtoDTO findOne(int idCredit) {
        CreditAvto creditAvto = creditAvtoRepo.findOne( idCredit );
        CreditAvtoDTO creditAvtoDTO = new CreditAvtoDTO();
        creditAvtoDTO.setIdCredit( creditAvto.getIdCredit() );
        creditAvtoDTO.setBankName( creditAvto.getBankName() );
        creditAvtoDTO.setType( creditAvto.getType() );
        creditAvtoDTO.setSumCredit( creditAvto.getSumCredit() );
        creditAvtoDTO.setPercent( creditAvto.getPercent() );
        creditAvtoDTO.setTerm(creditAvto.getTerm());
        creditAvtoDTO.setMonthFee(creditAvto.getMonthFee());
        creditAvtoDTO.setTimeFee(creditAvto.getTimeFee());
        creditAvtoDTO.setCollateral(creditAvto.getCollateral());

        String image = Base64.getEncoder().encodeToString( creditAvto.getImage() );
        creditAvtoDTO.setImage( image );

        return creditAvtoDTO;

}


    @Override
    public List<CreditAvtoDTO> findByName(String bankName) {
        List<CreditAvtoDTO>creditAvtoDTOs = new ArrayList<>();
        List<CreditAvto>creditAvtoList = creditAvtoRepo.findByName(bankName);
        for (CreditAvto creditAvto: creditAvtoList){
            CreditAvtoDTO creditAvtoDTO = new CreditAvtoDTO();
            creditAvtoDTO.setIdCredit( creditAvto.getIdCredit() );
            creditAvtoDTO.setBankName( creditAvto.getBankName() );
            creditAvtoDTO.setType( creditAvto.getType() );
            creditAvtoDTO.setSumCredit( creditAvto.getSumCredit() );
            creditAvtoDTO.setPercent( creditAvto.getPercent() );
            creditAvtoDTO.setTerm(creditAvto.getTerm());
            creditAvtoDTO.setMonthFee(creditAvto.getMonthFee());
            creditAvtoDTO.setTimeFee(creditAvto.getTimeFee());
            creditAvtoDTO.setCollateral(creditAvto.getCollateral());
            String image = Base64.getEncoder().encodeToString( creditAvto.getImage() );
            creditAvtoDTO.setImage( image );
            creditAvtoDTOs.add( creditAvtoDTO );
        }
        return creditAvtoDTOs;
    }
    }
