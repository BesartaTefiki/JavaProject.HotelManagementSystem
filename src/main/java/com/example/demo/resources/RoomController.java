package com.example.demo.resources;

import com.example.demo.model.Room;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@RestController
@RequestMapping("api/rooms")
public class RoomController {
    @GetMapping("/test/{id}")   //test
    public boolean test(@PathVariable int id) {     //test
        Room room = null;
        try {
            PreparedStatement preparedStatement = DatabaseConnection.getConnection().prepareStatement(
                    "SELECT * FROM rooms WHERE room_number=?");
            preparedStatement.setInt(1, id);
            ResultSet result = preparedStatement.executeQuery();
            while (result.next()) {
                room = new Room(
                        result.getInt("room_number"),
                        result.getString("room_type"),
                        result.getBoolean("is_available")
                );
                System.out.println(result.getInt("room_number"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (room != null) {
            return room.isAvailable();
        }
        return false;
    }
}
