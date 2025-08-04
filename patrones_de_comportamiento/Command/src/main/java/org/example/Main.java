package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ServidorLinux servidor = new ServidorLinux();
        Command comandoApagar = new ApagarServidorCommand(servidor);

        ControladorDeServidores invoker = new ControladorDeServidores();
        invoker.setCommand(comandoApagar);
        invoker.ejecutarComando(); // Apaga el servidor paso a paso
    }
}
