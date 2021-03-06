package song;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numSongs = Integer.parseInt(sc.nextLine());

        List<Song> playlist = new ArrayList<>();

        for (int i = 0; i < numSongs; i++){
            String [] data = sc.nextLine().split("_");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song song = new Song();

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            playlist.add(song);
        }

        String typeList = sc.nextLine();

        if (typeList.equals("all")){
            for (Song song : playlist){
                System.out.println(song.getName());
            }
        }
        else {
            for (Song song : playlist){
                if (song.getTypeList().equals(typeList)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
