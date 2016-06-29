
package Sistemaa;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class Limite_Digitos extends PlainDocument {
    private int quantidadeMax;
    public Limite_Digitos(int MaxLen){
        super();
        if (MaxLen<=0)
            throw new IllegalArgumentException("Especifique a quantidade!");
        quantidadeMax = MaxLen;
    }
@Override
public void insertString(int offset, String str, AttributeSet attr)
        throws BadLocationException{
if (str == null|| getLength()==quantidadeMax)
return;
        int totalquantia = (getLength()+str.length());
        if(totalquantia<=quantidadeMax){
            super.insertString(offset, str.replace("[^a-z|^0-9]",""), attr);
       return;
       
        }
        String nova = str.substring(0,getLength()-quantidadeMax);
super.insertString(offset, nova, attr);
}
}