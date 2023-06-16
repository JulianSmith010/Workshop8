package com.js;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class DealershipDataManager {
    private BasicDataSource basicDataSource;

    public DealershipDataManager(BasicDataSource basicDataSource) {
        this.basicDataSource = basicDataSource;
    }

    public List<Dealership> getAll() {
        List<Dealership> dealerships = new ArrayList<>();

        String query = "SELECT * FROM dealership;";

        try (
                Connection connection = this.basicDataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                String phone = resultSet.getString("phone");


                Dealership dealership = new Dealership(id, name, address, phone);

                dealerships.add(dealership);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dealerships;
    }

    public Dealership getById(int id){
        Dealership dealership = null;
        String query ="Select * FROM dealership WHERE id=?";

        try(
                Connection connection = this.basicDataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ){
            preparedStatement.setInt(1, id);
            try(
                    ResultSet resultSet = preparedStatement.executeQuery();
                    ){
                if (resultSet.next()){
                    int idFromDB = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String address = resultSet.getString("address");
                    String phone = resultSet.getString("phone");

                    dealership = new Dealership(idFromDB, name, address, phone);
                } else {
                    System.out.println("No dealership found with that id");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dealership;
    }

    public List<Dealership> searchbyname(String nameToSearchBy){
        List<Dealership> dealershipsFound = new ArrayList<>();
        String query = "SELECT * FROM Dealership WHERE name LIKE ?;";

        try(
                Connection connection = this.basicDataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);

                ){
            PreparedStatement.setString(1, "%" + nameToSearchBy +)
    }
}

