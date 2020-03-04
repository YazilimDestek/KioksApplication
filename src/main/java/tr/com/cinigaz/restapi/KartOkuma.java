package tr.com.cinigaz.restapi;

import org.springframework.stereotype.Service;
import tr.com.cinigaz.dto.Abone;

public class KartOkuma {
    private Abone abone;
    private boolean AboneMi = true;

    public Abone getKartOkuma() {
        return abone;
    }

    public boolean getaboneMi() {
        return AboneMi;

    }


}