public class TipoDePrenda {
  private Categoria categoria;
  public static TipoDePrenda ZAPATO = new TipoDePrenda(Categoria.CALZADO);
  public static TipoDePrenda REMERA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
  public static TipoDePrenda PANTALON = new TipoDePrenda(Categoria.PARTE_INFERIOR);


  public TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return categoria;
  }
  
}
