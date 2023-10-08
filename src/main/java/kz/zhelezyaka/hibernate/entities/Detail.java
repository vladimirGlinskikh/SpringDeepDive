package kz.zhelezyaka.hibernate.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "details")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "city")
    private String city;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    public Detail(String city, String phoneNumber, String email) {
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
