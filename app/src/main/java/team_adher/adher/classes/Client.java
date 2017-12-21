package team_adher.adher.classes;

/**
 * Created by pezed on 19/12/17. hihi
 */

public class Client {
    private int id;
    private String nom;
    private String prenom;
    private int phone;
    private int num_rue;
    private String nom_rue;
    private int codepostal;
    private String ville;


    public Client(int id, String nom, String prenom, int phone, int num_rue, String nom_rue, int codepostal, String ville) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.phone = phone;
        this.num_rue = num_rue;
        this.nom_rue = nom_rue;
        this.codepostal = codepostal;
        this.ville = ville;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getNum_rue() {
        return num_rue;
    }

    public void setNum_rue(int num_rue) {
        this.num_rue = num_rue;
    }

    public String getNom_rue() {
        return nom_rue;
    }

    public void setNom_rue(String nom_rue) {
        this.nom_rue = nom_rue;
    }

    public int getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(int codepostal) {
        this.codepostal = codepostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}