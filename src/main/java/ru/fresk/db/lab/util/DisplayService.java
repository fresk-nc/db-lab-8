package ru.fresk.db.lab.util;

import ru.fresk.db.lab.dto.GraphDTO;
import ru.fresk.db.lab.models.EdgeEntity;

import java.sql.SQLException;
import java.util.List;

public final class DisplayService {

    private DisplayService() {
    }

    public static String getGraphsInfo() {
        List<GraphDTO> graphs;

        try {
            graphs = DbUtils.getGraphs();
            StringBuilder builder = new StringBuilder();

            builder
                    .append("id\t")
                    .append("name\n");

            for (GraphDTO graph : graphs) {
                builder
                        .append(graph.getId()).append("\t")
                        .append(graph.getName()).append("\n");
            }

            return builder.toString();
        } catch (SQLException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getEdgesInfo() {
        List<EdgeEntity> edges;

        edges = DbUtils.getEdges();
        StringBuilder builder = new StringBuilder();

        builder
                .append("id\t")
                .append("in_vertex_id\t")
                .append("out_vertex_id\t")
                .append("graph_id\n");

        for (EdgeEntity edge : edges) {
            builder
                    .append(edge.getId()).append("\t")
                    .append(edge.getIncomingVertexId()).append("\t")
                    .append(edge.getOutcomingVertexId()).append("\t")
                    .append(edge.getGraphId()).append("\n");
        }

        return builder.toString();
    }
}
