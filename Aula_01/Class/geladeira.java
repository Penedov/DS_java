package Class;

public class Geladeira {
    String tipo;
    int quantidade;
    String cor;
    String modelo;
    int valor;
    Boolean off_power;

    public void buscar() {
        System.out.println("Selecione um tipo: ");
    }

    public void selecionar() {
        System.out.println("Quantidade de itens desejados: ");
    }

    public void pinte() {
        System.out.println("Adicione uma cor ao seu modelo: ");
    }

    public void total() {
        System.out.println("Esse é o valor total do seu item: ");
    }

    public void vejaFuncionar() {
        if (off_power) {
            System.out.println("Sua geladeira está desligada.");
        } else {
            System.out.println("Sua geladeira está ligada.");
        }
    }
}

