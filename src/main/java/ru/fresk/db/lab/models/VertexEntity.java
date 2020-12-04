package ru.fresk.db.lab.models;

import javax.persistence.*;

@Entity
@Table(name = "vertex", schema = "public", catalog = "graphs")
public class VertexEntity {
    private int id;
    private char[] name;
    private int width;
    private int height;
    private int top;
    private int left;
    private int graphId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public char[] getName() {
        return name;
    }

    public void setName(char[] name) {
        this.name = name;
    }

    @Basic
    @Column(name = "width")
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Basic
    @Column(name = "height")
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Basic
    @Column(name = "top")
    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    @Basic
    @Column(name = "left")
    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    @Basic
    @Column(name = "graph_id")
    public int getGraphId() {
        return graphId;
    }

    public void setGraphId(int graphId) {
        this.graphId = graphId;
    }
}
