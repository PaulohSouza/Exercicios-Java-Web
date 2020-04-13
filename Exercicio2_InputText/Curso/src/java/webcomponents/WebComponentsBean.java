
package webcomponents;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "webComponentsBean")
@RequestScoped
public class WebComponentsBean {

    private String firstName;
    private String lastName;
    private String email;
    private String book;
    private String operatingSystem;
    
    public WebComponentsBean() {
        
    }

    public void setBook(String book) {
        this.book = book;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getBook() {
        return book;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    public String getResult(){
        if (firstName != null && lastName != null && email != null)
            return "<p style=\background-color:yellow;widht:200px;" +
                    "padding:5px\"> Nome: " + getFirstName() + 
                    "<br/>Sobrenome: " + getLastName() +
                    "<br/>e-MAIL: " + getEmail() + 
                    "<br/>Livro Selecionado: " + getBook() +
                    "<br/>Sistema: " + getOperatingSystem() +
                    "</p>";
     
                    else
                    return "";
    }
  }
    
  
  
