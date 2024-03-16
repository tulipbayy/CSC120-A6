import java.util.ArrayList;

/**
 * Represents a house, which is a specific type of building where residents live.
 */
public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  /**
   * Constructs a new House object with the given parameters.
   *
   * @param name          The name of the house.
   * @param address       The address of the house.
   * @param nFloors       The number of floors in the house.
   * @param hasDiningRoom Whether the house has a dining room or not.
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
      super(name, address, nFloors);
      this.residents = new ArrayList<>();
      this.hasDiningRoom = hasDiningRoom;
  }

  /**
   * Checks if the house has a dining room.
   *
   * @return true if the house has a dining room, false otherwise.
   */
  public boolean hasDiningRoom() {
      return hasDiningRoom;
  }

  /**
   * Gets the number of residents living in the house.
   *
   * @return The number of residents.
   */
  public int nResidents() {
      return residents.size();
  }

  /**
   * Adds a resident to the house.
   *
   * @param name The name of the resident to add.
   */
  public void moveIn(String name) {
      residents.add(name);
  }

  /**
   * Removes a resident from the house.
   *
   * @param name The name of the resident to remove.
   * @return The name of the resident removed, or null if the resident was not found.
   */
  public String moveOut(String name) {
      if (residents.remove(name)) {
          return name;
      }
      return null;
  }

  /**
   * Checks if a person is a resident of the house.
   *
   * @param person The name of the person to check.
   * @return true if the person is a resident, false otherwise.
   */
  public boolean isResident(String person) {
      return residents.contains(person);
  }
}
