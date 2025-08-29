package shahira;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ParkingLotApp {
    public static void main(String[] args) {

        try (Connection conn = DatabaseConnection.getConnection()) {

            if (conn == null) {
                System.out.println("❌ Database connection failed!");
                return;
            }

            System.out.println("✅ Database connected successfully!");
            System.out.println("Running ParkingLotApp...");

            Statement stmt = conn.createStatement();

            // Updated query according to new schema
            String query = "SELECT v.vehicle_id, v.vehicle_no, v.owner_name, v.vehicle_type, " +
                           "s.slot_number, p.amount " +
                           "FROM vehicles v " +
                           "LEFT JOIN slots s ON v.parking_slot = s.slot_id " +
                           "LEFT JOIN payments p ON v.vehicle_id = p.vehicle_id";

            ResultSet rs = stmt.executeQuery(query);

            System.out.println("----- Parking Lot Details -----");
            while (rs.next()) {
                int id = rs.getInt("vehicle_id");
                String no = rs.getString("vehicle_no");
                String owner = rs.getString("owner_name");
                String type = rs.getString("vehicle_type");
                String slot = rs.getString("slot_number");
                double amount = rs.getDouble("amount");

                System.out.printf("Vehicle ID: %d | No: %s | Owner: %s | Type: %s | Slot: %s | Paid: %.2f%n",
                        id, no, owner, type, (slot != null ? slot : "Not Assigned"), amount);
            }

        } catch (Exception e) {
            System.out.println("❌ Error running the application. Check if all tables exist in DB.");
            e.printStackTrace();
        }
    }
}
