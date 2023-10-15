/**
 * Esta clase abstracta denominada Animal modela un animal genérico
 * que cuenta con atributos como un sonido, alimentos que consume,
 * un hábitat y un nombre científico.
 * @version 1.2/2020
 */
public abstract class Animal {
    protected String sonido;
    protected String alimentos;
    protected String hábitat;
    protected String nombreCientífico;

    public abstract String getNombreCientífico();

    public abstract String getSonido();

    public abstract String getAlimentos();

    public abstract String getHábitat();
}
