/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mydiary.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author RENT
 */
@Entity
@Table(name = "comments")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "nick")
    private String nick;
    @Column(name = "emal")
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    @Column(name = "content")
    private String text;
    @Column(name = "adddate")
    private Date createId;

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCreateId(Date createId) {
        this.createId = createId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getNick() {
        return nick;
    }

    public String getText() {
        return text;
    }

    public Date getCreateId() {
        return createId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comment)) {
            return false;
        }
        Comment other = (Comment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mydiary.model.Comment[ id=" + id + " ]";
    }
    
}
