package br.com.unip.tcc.bean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
 
import javax.faces.bean.*;
 
@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class UserBean implements Serializable{
 
    private static final long serialVersionUID = 4256272866128337548L;
 
    public String text = "Hello Java Code Geeks!" ;
    public String htmlInput = "<input type='text' size='20' /> " ;
     
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getHtmlInput() {
        return htmlInput;
    }
    public void setHtmlInput(String htmlInput) {
        this.htmlInput = htmlInput;
    }   
}
