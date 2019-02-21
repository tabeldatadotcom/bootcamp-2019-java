package example.java.module.tabungan;

import java.math.BigDecimal;
import example.java.module.deposito.HitungBungaAnual;

public class SetoranTunai {

    public BigDecimal setor(BigDecimal saldo){
        HitungBungaAnual bungaDeposito = new HitungBungaAnual();

        return saldo.multiply(bungaDeposito.hitung());
    }

}