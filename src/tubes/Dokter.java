/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Kukuh Sanddi
 */
public class Dokter extends Orang{
    protected long nip;
    protected String spesialis;
    
    public String gelar{
        return "dr. "+super.getNama;
    }
}