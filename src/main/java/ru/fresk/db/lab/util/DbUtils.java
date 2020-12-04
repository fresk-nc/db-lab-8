package ru.fresk.db.lab.util;

import ru.fresk.db.lab.dto.GraphDTO;
import ru.fresk.db.lab.models.EdgeEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static ru.fresk.db.lab.util.DbParams.*;

public class DbUtils {
    public static List<GraphDTO> getGraphs() throws SQLException {
        try (Connection connection = DriverManager.getConnection(DB_URL, PROPERTIES)) {
            ResultSet rs = connection.createStatement()
                    .executeQuery("select * from public.graph");
            List<GraphDTO> graphs = new ArrayList<>();

            while (rs.next()) {
                GraphDTO graph = new GraphDTO();
                graph.setId(rs.getInt("id"));
                graph.setName(rs.getString("name"));
                graphs.add(graph);
            }

            return graphs;
        }
    }

    public static List<EdgeEntity> getEdges() {
        return (List<EdgeEntity>) HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .createQuery("from EdgeEntity")
                .list();
    }
}
