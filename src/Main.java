
class Bebida {
    public String getDescricao() {
        return "Bebida";
    }

    public double custo() {
        return 0.0;
    }
}

abstract class AdicionalDecorator extends Bebida {
    protected Bebida bebida;

    public AdicionalDecorator(Bebida bebida) {
        this.bebida = bebida;
    }
}

class Leite extends AdicionalDecorator {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Leite";
    }

    @Override
    public double custo() {
        return bebida.custo() + 0.50;
    }
}

class Chocolate extends AdicionalDecorator {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Chocolate";
    }

    @Override
    public double custo() {
        return bebida.custo() + 1.00;
    }
}

public class Main {
    public static void main(String[] args) {
        Bebida bebida = new Bebida();
        System.out.println(bebida.getDescricao() + " $" + bebida.custo());

        Bebida bebidaComLeite = new Leite(bebida);
        System.out.println(bebidaComLeite.getDescricao() + " $" + bebidaComLeite.custo());

        Bebida bebidaComLeiteEChocolate = new Chocolate(bebidaComLeite);
        System.out.println(bebidaComLeiteEChocolate.getDescricao() + " $" + bebidaComLeiteEChocolate.custo());
    }
}
