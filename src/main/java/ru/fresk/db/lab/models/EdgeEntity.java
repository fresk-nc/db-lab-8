package ru.fresk.db.lab.models;

import javax.persistence.*;

@Entity
@Table(name = "edge", schema = "public", catalog = "graphs")
public class EdgeEntity {
    private int id;
    private int graphId;
    private int incomingVertexId;
    private int outcomingVertexId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "graph_id")
    public int getGraphId() {
        return graphId;
    }

    public void setGraphId(int graphId) {
        this.graphId = graphId;
    }

    @Basic
    @Column(name = "incoming_vertex_id")
    public int getIncomingVertexId() {
        return incomingVertexId;
    }

    public void setIncomingVertexId(int incomingVertexId) {
        this.incomingVertexId = incomingVertexId;
    }

    @Basic
    @Column(name = "outcoming_vertex_id")
    public int getOutcomingVertexId() {
        return outcomingVertexId;
    }

    public void setOutcomingVertexId(int outcomingVertexId) {
        this.outcomingVertexId = outcomingVertexId;
    }
}
