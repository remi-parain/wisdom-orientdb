/*
 * Copyright 2014, Technologic Arts Vietnam.
 * All right reserved.
 */

package org.wisdom.orientdb.othermodel;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Olleh {
    public String getId() {
        return id;
    }

    @Id
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


    //We override equals and hascode to test value injected in the proxy

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Olleh hello = (Olleh) o;

        if (getId() != null ? !getId().equals(hello.getId()) : hello.getId() != null) return false;
        return !(getName() != null ? !getName().equals(hello.getName()) : hello.getName() != null);

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }
}