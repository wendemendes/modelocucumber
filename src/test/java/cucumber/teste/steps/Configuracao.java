package cucumber.teste.steps;

import java.util.Map;

import cucumber.modelo.Conta;
import io.cucumber.java.DataTableType;

public class Configuracao {

    @DataTableType
    public Conta contaEntry(Map<String, String> entry) {

        String dono = entry.get("dono");
        int numero = Integer.parseInt(entry.get("numero"));
        Double limite = 0d;
        Double saldo = Double.parseDouble(entry.get("saldo"));

        return new Conta(dono, numero, limite, saldo);
    }
}