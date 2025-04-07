package com.mini.payment.permission.domain.entity;

import com.mini.payment.domain.DomainImpl;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PmsMenu extends DomainImpl {
    private static final long serialVersionUID = 1L;

    private String name;
    private String url;
    private String number;
    private String isLeaf;
    private long level;
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private PmsMenu parent;
    private String targetName;

    public PmsMenu() {
        super();
    }

    // -- getter & setter --

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf;
    }

    public long getLevel() {
        return level;
    }

    public void setLevel(long level) {
        this.level = level;
    }

    public PmsMenu getParent() {
        return parent;
    }

    public void setParent(PmsMenu parent) {
        this.parent = parent;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }
}
