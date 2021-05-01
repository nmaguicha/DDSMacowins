import static java.util.Objects.nonNull;

public class BorradorPrenda {
  private TipoDePrenda tipoPrenda;
  private Material material;
  private Color color;
  private Color colorsec;
  private Trama trama = Trama.LISA;

  public void especificarTipoDePrenda(TipoDePrenda tipoPrenda){
    nonNull(tipoPrenda);
    this.tipoPrenda = tipoPrenda;
  }

  public void especificarColorPrimario(Color color){
    nonNull(color);
    this.color = color;
  }

  public void especificarColorSecundario(Color colorsec){
    this.colorsec = colorsec;
  }

  public void especificarMaterial(Material material){
    nonNull(material);
  this.material = material;
  }

  public void especificarTrama(Trama trama){
    this.trama = (trama == null) ? Trama.LISA : trama;
  }

  public Prenda crearPrenda(TipoDePrenda tipo, Material material, Color color, Color colorsec, Trama trama){
    return new Prenda(tipo, material, color, colorsec, trama);
  }
}
