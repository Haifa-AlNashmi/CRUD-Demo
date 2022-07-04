package com.API.RestAPI.Models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name = "crudusers")
public class User {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
@Column(name = "firstName")
        private String firstName;
@Column(name = "lastName")
        private String lastName;
@Column(name = "age")
        private int age;
@Column(name = "nationality")
        private String nationality;
@Column(name = "education")
        private String education;


        public long getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public String getEducation() {
            return education;
        }

        public void setEducation(String education) {
            this.education = education;
        }


}
