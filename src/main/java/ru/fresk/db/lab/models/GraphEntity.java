package ru.fresk.db.lab.models;

import javax.persistence.*;

@Entity
@Table(name = "graph", schema = "public", catalog = "graphs")
public class GraphEntity {
    private int id;
    private char[] name;
    private int vertexCount;

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
    @Column(name = "vertex_count")
    public int getVertexCount() {
        return vertexCount;
    }

    public void setVertexCount(int vertexCount) {
        this.vertexCount = vertexCount;
    }
}
