/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package larrys;

/**
 *
 * @author thedoc
 */
public class cmitem {
    private String key;
    private String value;

    public cmitem(String key, String value) {
        this.key = key;
        this.value = value;
    }


    
    @Override
    public String toString()
    {
        return key;
    }
    
    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
    
}
