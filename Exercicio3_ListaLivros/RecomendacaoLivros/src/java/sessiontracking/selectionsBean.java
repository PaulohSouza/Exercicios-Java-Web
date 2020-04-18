
package sessiontracking;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.Set;

@Named(value = "selectionsBean")
@SessionScoped
public class selectionsBean implements Serializable {

    private static final HashMap<String, String> booksMap = new HashMap<String, String>();
    static{
        booksMap.put("java", "Java como Programar");
        booksMap.put(("cpp"), "C++ How to Program");
        booksMap.put("iphone", "Iphone programação");
        booksMap.put("android", "Desenvolvimento Android");
        
    }
    private Set<String> selections = new TreeSet<String>();
    private String selection;
    
    public selectionsBean() {
    }
    
    public int getNumberOfSelection(){
        return selections.size();
    }
    
    public String getSelection(){
        return selection;
    }
    
    public void setSelection(String topic){
        selection = booksMap.get(topic);
        selections.add(selection);
    }
    
    public String[] getSelections(){
        return selections.toArray(new String[selections.size()]);
            
   }
}
