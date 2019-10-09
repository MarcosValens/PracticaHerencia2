public class AnyDeTraspas extends Data {
    String anyDeTraspas;

    public AnyDeTraspas(String anyDeTraspas) {
        this.anyDeTraspas = anyDeTraspas;
    }

    public String anyTraspas(String any) {
        if ((any % 2) == 0) {
            return any;
        }

        else return null;
    }
}
