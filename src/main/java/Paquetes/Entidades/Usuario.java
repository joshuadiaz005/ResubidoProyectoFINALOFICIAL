package Paquetes.Entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@NamedQueries({@NamedQuery(name="Usuario.findByUsername", query = "select u from Usuario u where u.username like :username")})
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true, nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Boolean administrador;
    private String occupation;
    private long dateOfBirth;
    private String profilePicture;
    private String email;
    private String phoneNumber;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Paste>pastes;

    public Usuario(){

    }

    public Usuario(String username, String password, String name, Boolean administrador, String occupation, long dateOfBirth, String profilePicture, String email, String phoneNumber, List<Paste> pastes) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.administrador = administrador;
        this.occupation = occupation;
        this.dateOfBirth = dateOfBirth;
        this.profilePicture = profilePicture;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.pastes = pastes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public List<Paste> getPastes() {
        return pastes;
    }

    public void setPastes(List<Paste> pastes) {
        this.pastes = pastes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }


}