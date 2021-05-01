import static java.util.Objects.requireNonNull;

public class Prenda {
  private TipoDePrenda tipo;
  private Material material;
  private Color color;
  private Color colorsecundario;
  private Trama trama;

  public Prenda(TipoDePrenda tipo, Material material, Color color, Color colorsecundario, Trama trama) {
    this.tipo = tipo;
    this.material = material;
    this.color = color;
    this.color = colorsecundario;
    this.trama = trama;
  }

  public Categoria categoria(){
    return tipo.getCategoria();
    }

}


