// Imports for the parameters of flood

import java.lang.reflect.Array;
import java.util.*;


public class Flood {



//Time Complexity O(n^2)
    public static void flood(WaterColor color,
                              LinkedList<Coord> flooded_list,
                              Tile[][] tiles,
                              Integer board_size) {

        //Hash set to keep track of visited tiles
        HashSet<Coord> visited = new HashSet<>();


        //Time Complexity: O(n)
        for(int i = 0; i < flooded_list.size(); i++){
            Coord coord = flooded_list.get(i);
            visited.add(coord);
        }

        //Time Complexity: O(n)
        for(int i = 0; i < flooded_list.size(); i++){
            Coord coord = flooded_list.get(i);
            tiles[coord.getY()][coord.getX()].setColor(color);

        }
//        Time Complexity: O(n^2)
        for(int i = 0; i < flooded_list.size(); i++){

            Coord coord = flooded_list.get(i);

            for(Coord neighbor : coord.neighbors(board_size)){

                if(!visited.contains(neighbor) && tiles[neighbor.getY()][neighbor.getX()].getColor() == color){
                    flooded_list.add(neighbor);
                    visited.add(neighbor);

                }

            }
        }
    }

    // Time Complexity: worst O(n)^2 best O(n)
    public static void flood1(WaterColor color,
                             LinkedList<Coord> flooded_list,
                             Tile[][] tiles,
                             Integer board_size) {

        HashSet<Coord> visited = new HashSet<>();
        LinkedList<Coord> toAdd = new LinkedList<>();


//        Time Complexity: O(n)
        for (Coord coord : flooded_list) {
            visited.add(coord);
        }

//        Time Complexity: O(n^2
        for (Coord coord : flooded_list) {
            tiles[coord.getY()][coord.getX()].setColor(color);

            for (Coord neighbor : coord.neighbors(board_size)) {
                if (!visited.contains(neighbor) && tiles[neighbor.getY()][neighbor.getX()].getColor() == color) {
                    toAdd.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        //add all the new cords to the flooded list
        flooded_list.addAll(toAdd);




    }

}
