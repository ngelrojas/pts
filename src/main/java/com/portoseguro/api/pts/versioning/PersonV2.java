package com.portoseguro.api.pts.versioning;

public class PersonV2 {
    private Name name;

    public PersonV2() {
        super();
    }

    public PersonV2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
