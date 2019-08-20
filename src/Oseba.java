/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zanina
 */
class Oseba {

    private int id;
    private String priimek;
    private String stevilka;
    private int posta;

    public Oseba(int id, String priimek, String stevilka, int posta) {
        this.id = id;
        this.priimek = priimek;
        this.stevilka = stevilka;
        this.posta = posta;
    }

    public int getId() {
        return id;
    }

    public String getPriimek() {
        return priimek;
    }

    public String getStevilka() {
        return stevilka;
    }

    public int getPosta() {
        return posta;
    }
 public void setPriimek(String priimek)
    {
        //setting the userID variable value
        this.priimek = priimek;
    }
  public void setStevilka(String stevilka)
    {
        //setting the userID variable value
        this.stevilka = stevilka;
    }


}
