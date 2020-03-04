package tr.com.cinigaz.dto;

import lombok.Getter;
import lombok.Setter;

public class Abone {

    @Setter
    @Getter

//todo hibernate bağlantısı yapılarak @coloumn,named vs anatasyonları verilecektir.
    private Long aboneId;
    private String aboneAdi;
    private String aboneSoyadi;
    private Long sozlesmeNo;
    private double adilKullanimBedeli;
    private double kartBakiye;

    private boolean aboneOkunuyorMu = true;

    //karta ait bilgiler.
    // 20 50 100 tl


}
